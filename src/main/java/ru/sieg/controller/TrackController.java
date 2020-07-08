package ru.sieg.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sieg.model.Track;
import ru.sieg.service.TrackService;

import java.util.List;

@RestController
public class TrackController {

    @Autowired
    private TrackService trackService;

    @GetMapping("/track/all")
    public List<Track> getTrackAll() {

        return trackService.findAll();
    }

}
