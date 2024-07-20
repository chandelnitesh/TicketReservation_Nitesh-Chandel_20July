package com.JavaApplication.BusReservationSystem.Entity;

import jakarta.persistence.*;
import lombok.*;

@Entity@Setter@Getter@AllArgsConstructor@NoArgsConstructor@ToString
public class Route {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String source;
    private String destination;
    private String departureTime;

    @ManyToOne
    @JoinColumn(name = "busId")
    private BusData bus;
}
