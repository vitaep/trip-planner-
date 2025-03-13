package dev.vitaep.TripPlannerAI.DTO.mapper;

import dev.vitaep.TripPlannerAI.DTO.TripItemDTO;
import dev.vitaep.TripPlannerAI.model.TripItemModel;

public class TripItemMapper {

    public TripItemModel map(TripItemDTO tripItemDTO){

        TripItemModel tripItemModel = new TripItemModel();

        tripItemModel.setId(tripItemDTO.getId());
        tripItemModel.setDestination(tripItemDTO.getDestination());
        tripItemModel.setTripDays(tripItemDTO.getTripDays());
        tripItemModel.setPreference(tripItemDTO.getPreference());
        tripItemModel.setSpendingFund(tripItemDTO.getSpendingFund());
        tripItemModel.setGoals(tripItemDTO.getGoals());

        return tripItemModel;

    }

    public TripItemDTO map(TripItemModel tripItemModel){

        TripItemDTO tripItemDTO = new TripItemDTO();

        tripItemDTO.setId(tripItemModel.getId());
        tripItemDTO.setDestination(tripItemModel.getDestination());
        tripItemDTO.setTripDays(tripItemModel.getTripDays());
        tripItemDTO.setPreference(tripItemModel.getPreference());
        tripItemDTO.setSpendingFund(tripItemModel.getSpendingFund());
        tripItemDTO.setGoals(tripItemModel.getGoals());

        return tripItemDTO;

    }

}
