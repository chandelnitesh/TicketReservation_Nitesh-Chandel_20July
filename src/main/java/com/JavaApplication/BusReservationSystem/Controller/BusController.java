package com.JavaApplication.BusReservationSystem.Controller;

import com.JavaApplication.BusReservationSystem.Entity.BusData;
import com.JavaApplication.BusReservationSystem.Entity.Route;
import com.JavaApplication.BusReservationSystem.Entity.Seat;
import com.JavaApplication.BusReservationSystem.Service.BusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BusController {
    @Autowired
    private BusService busService;

    @GetMapping("/{busId}/seats")
    public List<Seat> getAvailableSeats(@PathVariable Long busId){
        return busService.getAvailableSeats(busId);
    }
    @GetMapping("/routes")
    public List<Route> getRoutes(@RequestParam String source, @RequestParam String destination){
        return busService.getRoutes(source,destination);
    }

    @PostMapping("/save/busDetails")
    public BusData saveBusInformation(@RequestBody BusData busDetail){
        return busService.saveBusInformation(busDetail);
    }
    @PostMapping("/save/seatDetails")
    public Seat saveSeatInformation(@RequestBody Seat seat){
        return busService.saveSeatInformation(seat);
    }
    @PostMapping("/save/routeDetails")
    public Route saveRouteInformation(@RequestBody Route route){
        return busService.saveRouteInformation(route);
    }
    @GetMapping("/get/busDetailsById/{id}")
    public BusData retrieveBusDetailsById(@PathVariable("id") Long busId){
        return busService.getBusDetailById(busId);
    }
}
