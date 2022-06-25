public abstract class Video {
    int duration;
    int rating;
    String title;
    String url;

    public Video(int duration, int rating, String title,String url) {
        this.duration = duration;
        this.rating = rating;
        this.title = title;
        this.url=url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
