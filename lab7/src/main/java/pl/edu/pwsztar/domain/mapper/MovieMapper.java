package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.CreateMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieMapper implements Converter<Movie, CreateMovieDto> {

    @Override
    public Movie convert(CreateMovieDto from) {
        Movie movie = new Movie
                .Builder()
                .image(from.getImage())
                .title(from.getTitle())
                .year(from.getYear())
                .videoId(from.getVideoId())
                .build();

        return movie;
    }
}
