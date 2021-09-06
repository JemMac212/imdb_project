public class Imdb {
    private final String title;
    private final double score;
    private final String year;
    private final double duration;
    private final String rating;
    private final double budget;
    private final String genres;
    private final double gross;
    private final String director;
    private final String actor1;
    private final String actor2;
    private final String actor3;
    private final String language;
    private final String country;

    public Imdb(String[] imdbRawData){
        this.title = imdbRawData[0];
        this.score = Double.parseDouble(imdbRawData[1]);
        this.year = imdbRawData[2];
        this.duration = Double.parseDouble(imdbRawData[3]);
        this.rating = imdbRawData[4];
        this.budget = Double.parseDouble(imdbRawData[5]);
        this.genres = imdbRawData[6];
        this.gross = Double.parseDouble(imdbRawData[7]);
        this.director = imdbRawData[8];
        this.actor1 = imdbRawData[9];
        this.actor2 = imdbRawData[10];
        this.actor3 = imdbRawData[11];
        this.language = imdbRawData[12];
        this.country = imdbRawData[13];
    }

    public String getTitle() {
        return title;
    }

    public double getScore() {
        return score;
    }

    public String getYear() {
        return year;
    }

    public double getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public String getGenres() {
        return genres;
    }

    public double getGross() {
        return gross;
    }

    public String getDirector() {
        return director;
    }

    public String getActor1() {
        return actor1;
    }

    public String getActor2() {
        return actor2;
    }

    public String getActor3() {
        return actor3;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }
}
