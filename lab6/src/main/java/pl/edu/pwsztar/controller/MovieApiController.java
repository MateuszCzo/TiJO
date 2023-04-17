package pl.edu.pwsztar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pl.edu.pwsztar.domain.dto.*;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;

@Controller
@RequestMapping(value="/api")
public class MovieApiController {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieApiController.class);

    private final MovieService movieService;

    @Autowired
    public MovieApiController(MovieService movieService) {
        this.movieService = movieService;
    }

    @CrossOrigin
    @GetMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<MovieDto>> getMovies() {
        LOGGER.info("find all movies");

        List<MovieDto> moviesDto = movieService.findAll();
        return new ResponseEntity<>(moviesDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PostMapping(value = "/movies", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> createMovie(@RequestBody CreateMovieDto createMovieDto) {
        LOGGER.info("create movie: {}", createMovieDto);
        movieService.creatMovie(createMovieDto);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @CrossOrigin
    @DeleteMapping(value = "/movies/{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Void> deleteMovie(@PathVariable Long movieId) {
        LOGGER.info("delete movie: {}", movieId);
        movieService.deleteMovie(movieId);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DetailsMovieDto> detailsMovie(@PathVariable Long movieId) {
        LOGGER.info("details movie: {}", movieId);
        DetailsMovieDto detailsMovieDto = movieService.findMovie(movieId);

        return new ResponseEntity<>(detailsMovieDto, HttpStatus.OK);
    }

    @CrossOrigin
    @GetMapping(value = "/movies/counter", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CounterDto> getMoviesCounter() {
        LOGGER.info("movies counter");

        CounterDto counterDto = movieService.getCounter();
        return new ResponseEntity<>(counterDto, HttpStatus.OK);
    }

    @CrossOrigin
    @PutMapping(value = "/movies/{movieId}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> getMoviesCounter(@PathVariable Long movieId, @RequestBody UpdateMovieDto updateMovieDto) {
        LOGGER.info("update movie: {}", movieId);

        movieService.updateMovie(movieId, updateMovieDto);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
