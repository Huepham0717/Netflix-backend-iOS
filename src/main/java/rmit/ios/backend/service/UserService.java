package rmit.ios.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rmit.ios.backend.entity.User;
import rmit.ios.backend.repository.UserRepository;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void addUser(User user){
        Optional<User> userOptional = userRepository.findByUserName(user.getUserName());
        if (userOptional.isPresent()){
            throw new IllegalStateException("User taken");
        } else {
            userRepository.save(user);
        }
    }

    public Optional<User> loadUserById(Long userId){
        return userRepository.findById(userId);
    }
}
