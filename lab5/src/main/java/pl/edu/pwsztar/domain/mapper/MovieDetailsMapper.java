package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.MovieDetailsDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class MovieDetailsMapper {
    public MovieDetailsDto mapToDto(Movie movie) {
        MovieDetailsDto movieDetailsDto = new MovieDetailsDto();

        movieDetailsDto.setTitle(movie.getTitle());
        movieDetailsDto.setVideoId(movie.getVideoId());

        return movieDetailsDto;
    }
}
