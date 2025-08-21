package mapmytour.assignment.repository;

import mapmytour.assignment.bean.Tour;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TourRepo extends JpaRepository<Tour,Long> {
//    Optional<Tour> findByTitle(String location);

    List<Tour> findByTitleContainingIgnoreCase(String location);
}
