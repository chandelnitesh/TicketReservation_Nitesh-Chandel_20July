package com.JavaApplication.BusReservationSystem.Repository;

import com.JavaApplication.BusReservationSystem.Entity.BusData;
import com.JavaApplication.BusReservationSystem.Entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeatRepository extends JpaRepository<Seat,Long> {
    List<Seat> findByBusAndIsAvailableTrue(BusData bus);

}
