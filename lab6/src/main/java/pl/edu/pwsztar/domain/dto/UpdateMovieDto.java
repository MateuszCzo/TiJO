package pl.edu.pwsztar.domain.dto;

public class UpdateMovieDto {

    private String title;
    private String image;
    private Integer year;
    private String videoId;

    public UpdateMovieDto() {
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
        return "UpdateMovieDto{" +
                "title='" + title + '\'' +
                ", image='" + image + '\'' +
                ", year=" + year +
                ", videoId='" + videoId + '\'' +
                '}';
    }
}
