package pl.edu.pwsztar.service.serviceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.edu.pwsztar.domain.dto.*;
import pl.edu.pwsztar.domain.entity.Movie;
import pl.edu.pwsztar.domain.mapper.Converter;
import pl.edu.pwsztar.domain.mapper.MovieDetailsMapper;
import pl.edu.pwsztar.domain.mapper.MovieListMapper;
import pl.edu.pwsztar.domain.mapper.MovieMapper;
import pl.edu.pwsztar.domain.repository.MovieRepository;
import pl.edu.pwsztar.service.MovieService;

import java.util.List;

@Service
public class MovieServiceImpl implements MovieService {

    private static final Logger LOGGER = LoggerFactory.getLogger(MovieServiceImpl.class);

    private final MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public List<MovieDto> findAll() {
        List<Movie> movies = movieRepository.findByOrderByYearDesc();
        Converter<List<MovieDto>, List<Movie>> movieListMapper = new MovieListMapper();
        return movieListMapper.convert(movies);
    }

    @Override
    public void creatMovie(CreateMovieDto createMovieDto) {
        Converter<Movie, CreateMovieDto> movieMapper = new MovieMapper();
        Movie movie = movieMapper.convert(createMovieDto);
        movieRepository.save(movie);
    }

    @Override
    public void deleteMovie(Long movieId) {
        movieRepository.deleteById(movieId);
    }

    @Override
    public DetailsMovieDto findMovie(Long movieId) {
        Movie movie = movieRepository.findOneByMovieId(movieId);

        if(movie == null) {
            return new DetailsMovieDto();
        }

        Converter<DetailsMovieDto, Movie> movieDetailsMapper = new MovieDetailsMapper();
        return movieDetailsMapper.convert(movie);
    }

    @Override
    public MovieCounterDto countMovies() {
        return new MovieCounterDto
                .Builder()
                .counter(movieRepository.count())
                .build();
    }

    @Override
    public void updateMovie(Long movieId, UpdateMovieDto updateMovieDto) {
        Movie movie = movieRepository.findOneByMovieId(movieId);

        if(movie != null) {
            movie = new Movie
                    .Builder()
                    .movieId(movie.getMovieId())
                    .image(updateMovieDto.getImage())
                    .title(updateMovieDto.getTitle())
                    .videoId(updateMovieDto.getVideoId())
                    .year(updateMovieDto.getYear())
                    .build();

            movieRepository.save(movie);
        }
    }
}
