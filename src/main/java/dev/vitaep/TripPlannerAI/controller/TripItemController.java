package dev.vitaep.TripPlannerAI.controller;

import dev.vitaep.TripPlannerAI.DTO.TripItemDTO;
import dev.vitaep.TripPlannerAI.service.TripItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping
@RestController("/trip")
public class TripItemController {

    @Autowired
    private TripItemService tripItemService;


    //POST METHOD;

    @PostMapping("/post")
    public ResponseEntity<TripItemDTO> postTrip(@RequestBody TripItemDTO tripItemDTO){
        TripItemDTO tripSaved = tripItemService.saveTrip(tripItemDTO);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(tripSaved);
    }

    // GET METHOD

    @GetMapping("/get")
    public ResponseEntity<List<TripItemDTO>> listAllTrips(){
        List<TripItemDTO> tripItemList = tripItemService.listTrip();

        return ResponseEntity.ok(tripItemList);
    }

    // GET BY ID METHOD

    @GetMapping("/get/{id}")
    public ResponseEntity<TripItemDTO> listTripById(@PathVariable Long id){
        TripItemDTO tripItemDTO = tripItemService.listTripById(id);

        return ResponseEntity.ok(tripItemDTO);
    }

    // UPDATE METHOD
    @PostMapping("/update/{id}")
    public ResponseEntity<TripItemDTO> updateTrip(@PathVariable Long id, @RequestBody TripItemDTO tripItemDTO){
        TripItemDTO tripUpdated = tripItemService.updateTrip(id, tripItemDTO);
        return ResponseEntity.ok(tripUpdated);
    }

    // DELETE METHOD

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteTrip(@PathVariable Long id){
        tripItemService.deleteTrip(id);
        return ResponseEntity.ok("The trip with ID: " + id + " has been deleted with success.");
    }

}
