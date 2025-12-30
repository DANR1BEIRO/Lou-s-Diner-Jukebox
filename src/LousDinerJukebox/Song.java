package LousDinerJukebox;

public class Song implements Comparable {
    private String title;
    private String artist;
    private String genre;
    private int year;
    private int timesPlayed;

    public Song(String title, String artist, String genre, int year, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.year = year;
        this.timesPlayed = timesPlayed;
    }

    public Song(String title, String artist, int timesPlayed) {
        this.title = title;
        this.artist = artist;
        this.timesPlayed = timesPlayed;
    }

    @Override
    public String toString() {
        return "\n" + title + ", " + artist + ", " + genre;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public int getTimesPlayed() {
        return timesPlayed;
    }
}
