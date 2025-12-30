package LousDinerJukebox;

import java.util.List;

public class JukeboxStreams {
    public static void main(String[] args) {
        Songs songs = new Songs();

        List<Song> rock = songs.getSongs().stream()
                .filter(song -> song.getGenre().equalsIgnoreCase("rock"))
                .toList();

        System.out.println(rock);
    }
}
