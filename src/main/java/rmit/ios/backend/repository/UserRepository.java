package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.entity.User;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Repository
@Transactional(readOnly= true)
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.userName =?1")
    Optional<User> findUserByUserName(String userName);
}
