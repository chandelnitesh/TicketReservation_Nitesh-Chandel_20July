package com.JavaApplication.BusReservationSystem.Service;

import com.JavaApplication.BusReservationSystem.Entity.BusData;
import com.JavaApplication.BusReservationSystem.Entity.Route;
import com.JavaApplication.BusReservationSystem.Entity.Seat;
import com.JavaApplication.BusReservationSystem.Repository.BusRepository;
import com.JavaApplication.BusReservationSystem.Repository.RouteRepository;
import com.JavaApplication.BusReservationSystem.Repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BusServiceImpl implements BusService{
    @Autowired
    private BusRepository busRepository;
    @Autowired
    private SeatRepository seatRepository;
    @Autowired
    private RouteRepository routeRepository;
    @Override
    public BusData saveBusInformation(BusData busDetail) {
        return busRepository.save(busDetail);
    }

    @Override
    public BusData getBusDetailById(Long busId) {
        return busRepository.findById(busId).get();
    }

    @Override
    public List<Seat> getAvailableSeats(Long busId){
        BusData bus = busRepository.findById(busId).orElseThrow(()-> new RuntimeException("Bus not found"));
        return seatRepository.findByBusAndIsAvailableTrue(bus);
    }

    @Override
    public List<Route> getRoutes(String source, String destination){
        return routeRepository.findBySourceAndDestination(source, destination);
    }

    @Override
    public Seat saveSeatInformation(Seat seat) {
        return seatRepository.save(seat);
    }

    @Override
    public Route saveRouteInformation(Route route) {
        return routeRepository.save(route);
    }

}
