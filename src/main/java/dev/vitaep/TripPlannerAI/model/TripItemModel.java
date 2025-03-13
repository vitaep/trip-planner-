package dev.vitaep.TripPlannerAI.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_trip_item")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TripItemModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "destination")
    private String destination;

    @Column(name = "trip_days")
    private Integer tripDays;

    @Column(name = "preference")
    private String preference;

    @Column(name = "spending_fund")
    private Integer spendingFund;

    @Column(name = "goals")
    private String goals;

}
