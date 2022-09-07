package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import rmit.ios.backend.entity.Genre;
import rmit.ios.backend.entity.Movie;

import java.util.Optional;
import java.util.Set;

@Repository
@Transactional(readOnly= true)
public interface MovieRepository extends JpaRepository<Movie,Long> {
    @Query("SELECT m FROM Movie m WHERE m.title =?1")
    Optional<Movie> findByMovieName(String movieName);
    @Query("SELECT m FROM Movie m JOIN FETCH m.genreList")
    Set<Movie> getAll();
    @Query("SELECT m FROM Movie m JOIN FETCH m.genreList g WHERE g.genreName =?1 ")
    Set<Movie> findMoviesByGenre(String genreName);
}
