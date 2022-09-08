package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.entity.SaveList;
import rmit.ios.backend.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@Transactional(readOnly= true)
public interface SaveListRepository extends JpaRepository<SaveList,Long> {
    @Query("SELECT s FROM SaveList s JOIN FETCH s.movie m JOIN FETCH m.genreList")
    Set<SaveList> getAll();
    @Query("SELECT s FROM SaveList s JOIN FETCH s.movie m JOIN FETCH m.genreList WHERE s.user.userName =?1")
    Set<SaveList> findByUserName(String userName);
}
