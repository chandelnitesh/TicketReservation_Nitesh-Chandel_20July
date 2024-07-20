package com.JavaApplication.BusReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
@Entity
public class BusData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "bus_id")
    private Long busId;
    @Column(name = "bus_number")
    private String busNumber;

    @OneToMany(mappedBy = "bus")
    private List<Seat> seats;

}
