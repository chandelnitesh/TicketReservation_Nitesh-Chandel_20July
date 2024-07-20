package com.JavaApplication.BusReservationSystem.Service;

import com.JavaApplication.BusReservationSystem.Entity.BusData;
import com.JavaApplication.BusReservationSystem.Entity.Route;
import com.JavaApplication.BusReservationSystem.Entity.Seat;

import java.util.List;

public interface BusService {
    BusData saveBusInformation(BusData busDetail);

    BusData getBusDetailById(Long busId);

    List<Seat> getAvailableSeats(Long busId);

    List<Route> getRoutes(String source, String destination);

    Seat saveSeatInformation(Seat seat);

    Route saveRouteInformation(Route route);
}
