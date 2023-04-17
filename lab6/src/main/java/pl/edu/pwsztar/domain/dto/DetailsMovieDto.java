package pl.edu.pwsztar.domain.dto;

public class DetailsMovieDto {
    private String title;
    private String videoId;
    private String image;
    private Integer year;

    public DetailsMovieDto() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
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

    public void setImage(String image) {
        this.image = image;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "DetailsMovieDto{" +
                "title='" + title + '\'' +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}
