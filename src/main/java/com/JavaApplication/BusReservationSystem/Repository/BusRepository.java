package com.JavaApplication.BusReservationSystem.Repository;

import com.JavaApplication.BusReservationSystem.Entity.BusData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<BusData,Long> {
}
