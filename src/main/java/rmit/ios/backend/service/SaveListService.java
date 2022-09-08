package rmit.ios.backend.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.entity.SaveList;
import rmit.ios.backend.entity.User;
import rmit.ios.backend.repository.MovieRepository;
import rmit.ios.backend.repository.SaveListRepository;
import rmit.ios.backend.repository.UserRepository;

import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@AllArgsConstructor
public class SaveListService {
    @Autowired
    private SaveListRepository saveListRepository;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private UserRepository userRepository;

    @Transactional
    public String addMovieToSaveList(String userName, Long movieId) {
        User user = userRepository.findUserByUserName(userName).orElseThrow(()-> new IllegalStateException(
                "User with username "+userName+" does not exists"
        ));
        Movie movie = movieRepository.findById(movieId).orElseThrow(()-> new IllegalStateException(
                "Movie with id "+movieId+" does not exists"
        ));
        saveListRepository.save(new SaveList(movie,user));
        return "{ \"message\": \"Save list successfully updated.\" }";
    }
    public Set<SaveList> loadSaveListByUserName(String userName){
        return saveListRepository.findByUserName(userName);
    }
}
