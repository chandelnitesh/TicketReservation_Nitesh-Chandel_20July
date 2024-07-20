package com.JavaApplication.BusReservationSystem.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter@Setter@AllArgsConstructor@NoArgsConstructor@ToString
@Entity
public class UserData {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String userName;
    private String userPassword;
    private Long busId;
}
