package dev.vitaep.TripPlannerAI.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class TripItemDTO {

    private Long id;
    private String destination;
    private Integer tripDays;
    private String preference;
    private Integer spendingFund;
    private String goals;


}
