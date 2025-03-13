package dev.vitaep.TripPlannerAI.service;

import dev.vitaep.TripPlannerAI.DTO.TripItemDTO;
import dev.vitaep.TripPlannerAI.DTO.mapper.TripItemMapper;
import dev.vitaep.TripPlannerAI.model.TripItemModel;
import dev.vitaep.TripPlannerAI.repository.TripItemRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TripItemService {

    @Autowired
    private TripItemRepository tripItemRepository;
    @Autowired
    private TripItemMapper tripItemMapper;

    // SAVE SERVICES
    public TripItemDTO saveTrip(TripItemDTO tripItemDTO){
        TripItemModel tripItemModel = tripItemMapper.map(tripItemDTO);
        tripItemRepository.save(tripItemModel);

        return tripItemMapper.map(tripItemModel);
    }

    // GET SERVICES

    public List<TripItemDTO> listTrip(TripItemDTO tripItemDTO){
        List<TripItemModel> tripItemModelList = tripItemRepository.findAll();
        return tripItemModelList.stream().map(tripItemMapper::map)
                .collect(Collectors.toList());

    }

    // PUT SERVICES

    @PutMapping("/update/{id}")
    public TripItemDTO updateTrip(Long id, TripItemDTO tripItemDTO){

        TripItemModel trip = tripItemRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("The trip with ID: " + id + " has not been founded."));

        if (tripItemDTO.getDestination() != null && !tripItemDTO.getDestination().isEmpty()){
            trip.setDestination(tripItemDTO.getDestination());
        }
        if (tripItemDTO.getTripDays() != null){
            trip.setTripDays(tripItemDTO.getTripDays());
        }
        if (tripItemDTO.getPreference() != null && !tripItemDTO.getPreference().isEmpty()){
            trip.setPreference(tripItemDTO.getPreference());
        }
        if (tripItemDTO.getSpendingFund() != null){
            trip.setSpendingFund(tripItemDTO.getSpendingFund());
        }
        if (tripItemDTO.getGoals() != null && !tripItemDTO.getGoals().isEmpty()){
            trip.setGoals(tripItemDTO.getGoals());
        }

        tripItemRepository.save(trip);
        return tripItemMapper.map(trip);

    }

    // DELETE MAPPING

    public void deleteTrip(Long id){
        tripItemRepository.deleteById(id);
    }


}
