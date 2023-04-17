package pl.edu.pwsztar.domain.dto;

public class MovieDetailsDto {
    private String title;
    private String videoId;

    public MovieDetailsDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getVideoId() {
        return videoId;
    }

    public void setVideoId(String videoId) {
        this.videoId = videoId;
    }
}
