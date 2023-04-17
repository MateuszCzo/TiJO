package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class MovieDto implements Serializable {

    private Long movieId;
    private Long year;
    private String title;
    private String image;

    public MovieDto() {
    }

    public Long getMovieId() {
        return movieId;
    }

    public Long getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
