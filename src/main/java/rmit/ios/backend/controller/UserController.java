package rmit.ios.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import rmit.ios.backend.entity.User;
import rmit.ios.backend.repository.UserRepository;
import rmit.ios.backend.service.UserService;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private final UserRepository userRepository;
    @Autowired
    private final UserService userService;

    @Autowired
    public UserController( UserRepository userRepository, UserService userService){
        this.userRepository = userRepository;
        this.userService = userService;
    }

    @GetMapping(path = "userName/{userName}")
    public User loadUserByUserName(@PathVariable("userName") String userName) {
        return userRepository.findUserByUserName(userName).get();
    }

    @PostMapping
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }

    @GetMapping
    public List<User> getUsers(){
        return userService.getUsers();
    }

}
