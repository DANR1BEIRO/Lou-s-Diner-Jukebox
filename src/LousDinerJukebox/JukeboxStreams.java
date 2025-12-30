package LousDinerJukebox;

import java.util.*;
import java.util.stream.Collectors;

public class JukeboxStreams {
    public static void main(String[] args) {
        List<Song> songs = new Songs().getSongs();

        List<Song> rockSongs = songs.stream()
                .filter(song -> song.getGenre().contains("Rock"))
                .toList();

        System.out.println(rockSongs);
        System.out.println("-------------------------");

        List<String> genres = songs.stream()
                .map(Song::getGenre)
                .distinct() // There will be no duplicates after this point
                .sorted()
                .toList();
        System.out.println(genres);
        System.out.println("-------------------------");

        System.out.println("\nOldest to newest");
        songs.stream()
                .sorted(Comparator.comparingInt(Song::getYear))
                .forEach(song -> System.out.println(song.getTitle() + " - " + song.getYear()));
        System.out.println("-------------------------");

        Set<String> genreNaturalOrderWithSet = songs.stream()
                .map(Song::getGenre)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(genreNaturalOrderWithSet);
        System.out.println("-------------------------");

        // check if something exists
        boolean b = songs.stream()
                .anyMatch(song -> song.getGenre().equals("R&B"));
        System.out.println(b);
        System.out.println("-------------------------");

        // find a specific thing
        songs.stream()
                .filter(song -> song.getYear() == 1995)
                .findFirst()
                .ifPresentOrElse(song -> System.out.println("Found: " + song.getTitle()),
                        () -> System.out.println("There isn't a song released in this year"));

        System.out.println("-------------------------");

        // count the items
        long count = songs.stream()
                .map(song -> song.getArtist())
                .distinct()
                .count();
        System.out.println(count);
        System.out.println("-------------------------");


    }
}
