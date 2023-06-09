package pl.edu.pwsztar.domain.entity;

import pl.edu.pwsztar.domain.dto.CreateMovieDto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "movies")
public class Movie implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movie_id")
    private Long movieId;

    @Column(name = "title")
    private String title;

    @Column(name = "image")
    private String image;

    @Column(name = "year")
    private Integer year;

    @Column(name = "video_id")
    private String videoId;

    public Movie() {
    }

    private Movie(Builder builder) {
        this.movieId = builder.movieId;
        this.title = builder.title;
        this.image = builder.image;
        this.year = builder.year;
        this.videoId = builder.videoId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    public String getVideoId() {
        return videoId;
    }

    public final static class Builder {
        private Long movieId;
        private String title;
        private String image;
        private Integer year;
        private String videoId;

        public Builder() {
        }

        public Builder movieId(Long movieId) {
            this.movieId = movieId;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder image(String image) {
            this.image = image;
            return this;
        }

        public Builder year(Integer year) {
            this.year = year;
            return this;
        }

        public Builder videoId(String videoId) {
            this.videoId = videoId;
            return this;
        }

        public Builder fromPrototype(Movie prototype) {
            this.movieId = prototype.movieId;
            this.title = prototype.title;
            this.image = prototype.image;
            this.year = prototype.year;
            this.videoId = prototype.videoId;
            return this;
        }

        public Movie build() {
            return new Movie(this);
        }
    }
}
