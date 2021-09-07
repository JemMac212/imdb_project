public class Movie {
    private final String title;
    private final double score;
    private final String year;
    private final int duration;
    private final String rating;
    private final double budget;
    private final String[] genres;
    private final double gross;
    private final String director;
    private final String[] actors;
    private final String language;
    private final String country;

    public Movie(String[] imdbMovieRecord){
        this.title = imdbMovieRecord[0];
        this.score = Double.parseDouble(imdbMovieRecord[1]);
        this.year = imdbMovieRecord[2];
        this.duration = Integer.parseInt(imdbMovieRecord[3]);
        this.rating = imdbMovieRecord[4];
        this.budget = Double.parseDouble(imdbMovieRecord[5]);
        this.genres = imdbMovieRecord[6].split("\\|");
        this.gross = Double.parseDouble(imdbMovieRecord[7]);
        this.director = imdbMovieRecord[8];
        this.actors = new String[]{imdbMovieRecord[9], imdbMovieRecord[10], imdbMovieRecord[11]};
        this.language = imdbMovieRecord[12];
        this.country = imdbMovieRecord[13];
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

    public int getDuration() {
        return duration;
    }

    public String getRating() {
        return rating;
    }

    public double getBudget() {
        return budget;
    }

    public String[] getGenres() {
        return genres;
    }

    public double getGross() {
        return gross;
    }

    public String getDirector() {
        return director;
    }

    public String[] getActors() {
        return actors;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }
}
