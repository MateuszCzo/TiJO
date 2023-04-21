package pl.edu.pwsztar.domain.dto;

import java.io.Serializable;

public class UpdateMovieDto implements Serializable {
    private String title;
    private String image;
    private Integer year;
    private String videoId;

    public UpdateMovieDto() {
    }

    private UpdateMovieDto(Builder builder) {
        this.title = builder.title;
        this.image = builder.title;
        this.year = builder.year;
        this.videoId = builder.videoId;
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

    @Override
    public String toString() {
        return "CreateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }

    public final static class Builder {
        private String title;
        private String image;
        private Integer year;
        private String videoId;

        public Builder() {
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

        public Builder fromPrototype(UpdateMovieDto prototype) {
            this.title = prototype.title;
            this.image = prototype.image;
            this.year = prototype.year;
            this.videoId = prototype.videoId;
            return this;
        }

        public UpdateMovieDto build() {
            return new UpdateMovieDto(this);
        }
    }
}
