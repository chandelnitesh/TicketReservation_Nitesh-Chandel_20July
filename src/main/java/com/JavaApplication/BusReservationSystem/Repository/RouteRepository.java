package com.JavaApplication.BusReservationSystem.Repository;

import com.JavaApplication.BusReservationSystem.Entity.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RouteRepository extends JpaRepository<Route,Long> {
    List<Route> findBySourceAndDestination(String source, String destination);
}
