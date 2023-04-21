package pl.edu.pwsztar.domain.dto;

public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;

    public DetailsMovieDto() {
    }

    private DetailsMovieDto(Builder builder) {
        this.title = builder.title;
        this.videoId = builder.videoId;
        this.image = builder.image;
        this.year = builder.year;
    }

    public String getTitle() {
        return title;
    }

    public String getVideoId() {
        return videoId;
    }

    public String getImage() {
        return image;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "DetailsMovieDto{" +
                "title='" + title + '\'' +
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

        public Builder fromPrototype(DetailsMovieDto prototype) {
            this.title = prototype.title;
            this.image = prototype.image;
            this.year = prototype.year;
            this.videoId = prototype.videoId;
            return this;
        }

        public DetailsMovieDto build() {
            return new DetailsMovieDto(this);
        }
    }
}
