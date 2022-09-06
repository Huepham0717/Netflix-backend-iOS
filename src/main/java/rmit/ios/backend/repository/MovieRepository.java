package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rmit.ios.backend.entity.Movie;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@Transactional(readOnly= true)
public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Query("SELECT m FROM Movie m WHERE m.movieName =?1")
    Optional<Movie> findByMovieName(String movieName);
    @Query("SELECT m FROM Movie m JOIN FETCH m.castList")
    Set<Movie> getAll();
}
