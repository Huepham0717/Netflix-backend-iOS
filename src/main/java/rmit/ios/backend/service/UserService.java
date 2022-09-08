package rmit.ios.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import rmit.ios.backend.entity.User;
import rmit.ios.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void addUser(User user){
        Optional<User> userOptional = userRepository.findUserByUserName(user.getUserName());
        if (userOptional.isPresent()){
            throw new IllegalStateException("User taken");
        } else {
            userRepository.save(user);
        }
    }


    public List<User> getUsers() {
        return userRepository.findAll();
    }
}
