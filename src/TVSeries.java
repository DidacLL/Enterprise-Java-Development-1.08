public class TVSeries extends Video{
    int totalEpisodes;
    int totalSeasons;
    int currentEpisode;
    Video[] episodes;

    public TVSeries(int duration, int rating, String title, String url, int totalEpisodes, int totalSeasons, int currentEpisode) {
        super(duration, rating, title, url);
        this.totalEpisodes = totalEpisodes;
        this.totalSeasons = totalSeasons;
        this.currentEpisode = currentEpisode;
        this.episodes=new Video[totalEpisodes];
    }

    public Video nextEpisode(){
        currentEpisode++;
        return episodes[currentEpisode];
    }


}
