public class TVShow {
    private String title;
    private String genre;
    private String network;
    private String yearsActive;
    private String episodes;
    private String synopsis;

    public TVShow(String title, String genre, String network, String yearsActive, String episodes, String synopsis) {
        this.title = title;
        this.genre = genre;
        this.network = network;
        this.yearsActive = yearsActive;
        this.episodes = episodes;
        this.synopsis = synopsis;
    }

    public boolean stillOnAir (String yearsOn) {
        return yearsActive.length() <= 5;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getNetwork() {
        return network;
    }

    public String getYearsActive() {
        return yearsActive;
    }

    public String getEpisodes() {
        return episodes;
    }

    public String getSynopsis() {
        return synopsis;
    }

    @Override
    public String toString() {
        return  "Title: " + title + '\n' +
                "Genre: " + genre + '\n' +
                "Network: " + network + '\n' +
                "Years Active: " + yearsActive + '\n' +
                "Episodes: " + episodes + '\n' +
                "Synopsis: " + synopsis + "\n\n";
    }
}
