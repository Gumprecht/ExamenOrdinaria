package model;

public class Movie {
    
    //private final Thumbnail thumbnail;
    private final String title;
    private final int releaseDate;
    private final String director;
    //private final Array cast;
    private final String genre;
    private int rating;
    private final int duration;

    public Movie(String title, int releaseDate, String director, String genre, int duration) {
        this.title = title;
        this.releaseDate = releaseDate;
        this.director = director;
        this.genre = genre;
        this.duration = duration;
    }
    
    
}
