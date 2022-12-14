package rmit.ios.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import rmit.ios.backend.entity.Movie;
import rmit.ios.backend.repository.MovieRepository;
import rmit.ios.backend.service.MovieService;

import java.util.List;
import java.util.Optional;
import java.util.Set;

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
    public Set<Movie> getMovies(){
        return movieService.getMovies();
    }

    @GetMapping(path = "movieName/{movieName}")
    public Optional<Movie> loadMovieByMovieName(@PathVariable("movieName") String movieName) {
        return movieRepository.findByMovieName(movieName);
    }
    @GetMapping(path = "popularMovies")
    public List<Movie> loadPopularMovie() {
        return movieService.getPopularMovies();
    }

    @GetMapping(path = "genre/{genreName}")
    public Set<Movie> loadMovieByGenreName(@PathVariable("genreName") String genreName) {
        return movieRepository.findMoviesByGenre(genreName);
    }
}
