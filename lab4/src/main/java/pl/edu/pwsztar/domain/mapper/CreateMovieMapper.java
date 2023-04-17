package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.dto.MovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

import java.util.ArrayList;
import java.util.List;

@Component
public class CreateMovieMapper {
    public Movie mapToEntity(CreateMovieDto createMovieDto) {
        Movie movie = new Movie();
        MovieDto movieDto = new MovieDto();

        movie.setYear(createMovieDto.getYear().longValue());
        movie.setTitle(createMovieDto.getTitle());
        movie.setImage(createMovieDto.getImage());

        return movie;
    }
}
