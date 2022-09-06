package rmit.ios.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import rmit.ios.backend.entity.User;

import java.util.Optional;

@Repository
@Transactional(readOnly= true)
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("SELECT u FROM User u WHERE u.password =?1 and u.userName =?2")
    Optional<User> findByPassword(String password,String userName);
    @Query("SELECT u FROM User u WHERE u.userName =?1")
    Optional<User> findByUserName(String userName);
}
