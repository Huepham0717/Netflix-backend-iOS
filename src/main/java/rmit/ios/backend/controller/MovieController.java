package rmit.ios.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.repository.MovieRepository;
import rmit.ios.backend.repository.UserRepository;
import rmit.ios.backend.service.MovieService;
import rmit.ios.backend.service.UserService;

import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping(path = "/movie")
public class MovieController {
    @Autowired
    private final MovieRepository movieRepository;
    @Autowired
    private final MovieService movieService;

    @Autowired
    public MovieController( MovieRepository movieRepository, MovieService movieService){
        this.movieRepository = movieRepository;
        this.movieService = movieService;
    }

    @GetMapping
    public List<Movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping(path = "movieName/{movieName}")
    public Optional<Movie> loadMovieByMovieName(@PathVariable("movieName") String movieName) {
        return movieRepository.findByMovieName(movieName);
    }
}