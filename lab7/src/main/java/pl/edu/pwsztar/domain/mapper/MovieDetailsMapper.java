package pl.edu.pwsztar.domain.mapper;

import org.springframework.stereotype.Component;
import pl.edu.pwsztar.domain.dto.DetailsMovieDto;
import pl.edu.pwsztar.domain.entity.Movie;

@Component
public class MovieDetailsMapper implements Converter<DetailsMovieDto, Movie> {
    @Override
    public DetailsMovieDto convert(Movie from) {
        DetailsMovieDto detailsMovieDto = new DetailsMovieDto
                .Builder()
                .title(from.getTitle())
                .videoId(from.getVideoId())
                .image(from.getImage())
                .year(from.getYear())
                .build();

        return detailsMovieDto;
    }
}
