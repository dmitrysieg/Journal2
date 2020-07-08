package ru.sieg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.sieg.model.Track;
import ru.sieg.repository.TrackRepository;

import java.util.ArrayList;
import java.util.List;

@Component
public class TrackService {

    @Autowired
    private TrackRepository trackRepository;

    public List<Track> findAll() {

        final List<Track> result = new ArrayList<>();

        for (final Track track : trackRepository.findAll()) {
            result.add(track);
        }

        return result;
    }
}
