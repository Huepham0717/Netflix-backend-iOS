package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rmit.ios.backend.entity.Cast;
import rmit.ios.backend.entity.Movie;

import java.util.List;
import java.util.Optional;

@Repository
@Transactional(readOnly= true)
public interface CastRepository extends JpaRepository<Cast,Long> {
    @Query("SELECT c FROM Cast c WHERE c.castName =?1")
    Optional<Cast> findByName(String castName);
    @Query("SELECT c.movieList FROM Cast c WHERE c.castName =?1")
    List<Movie> findMoviesByName(String castName);
}
