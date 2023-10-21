package com.example.demoSpring1;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FlightController {
    private final List<FlightInfo> flightInfoList = new ArrayList<>();

    @ResponseStatus(code = HttpStatus.BAD_REQUEST)
    public class FlightNotFoundException extends Exception {
        public FlightNotFoundException(String cause) {
            super(cause);
        }
    }

    public FlightController() {
        flightInfoList.add(
                new FlightInfo(1, "Delhi Indira Gandhi",
                        "Stuttgart", "D80"));
        flightInfoList.add(
                new FlightInfo(2, "Tokyo Haneda", "Frankfurt",
                        "110"));
        flightInfoList.add(
                new FlightInfo(3, "Berlin Schönefeld", "Tenerife", "15"));
        flightInfoList.add(
                new FlightInfo(4, "Kilimanjaro Arusha", "Boston", "15"));
    }


    @GetMapping("flights/{id}")
    public FlightInfo getFlightInfo(@PathVariable int id) {
        for (FlightInfo flightInfo : flightInfoList) {
            if (flightInfo.getId() == id) {
                if (Objects.equals(flightInfo.getFrom(), "Berlin Schönefeld")) {
                    throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                            "Berlin Schönefeld is closed for service today");
                } else {
                    return flightInfo;
                }

            }
        }
        throw new RuntimeException();
    }

}