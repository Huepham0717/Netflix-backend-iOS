package rmit.ios.backend.repository;

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
public interface GenreRepository extends JpaRepository<Genre,Long> {
}
