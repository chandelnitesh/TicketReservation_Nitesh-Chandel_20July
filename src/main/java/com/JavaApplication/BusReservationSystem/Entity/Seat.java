package com.JavaApplication.BusReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int seatNumber;
    private boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "bus_id")
    private BusData bus;
}
