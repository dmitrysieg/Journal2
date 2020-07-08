package ru.sieg.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.sieg.model.Track;

@Repository
public interface TrackRepository extends CrudRepository<Track, Integer> {

}
