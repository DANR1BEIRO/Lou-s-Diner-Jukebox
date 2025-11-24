package LousDinerJukebox;

import java.util.List;
import java.util.stream.Collectors;

public class Jukebox3 {
    public static void main(String[] args) {
        new Jukebox3().go();
    }

    public void go() {
        List<Song> songList = MockSongs.getSongsObjects();

        System.out.println("---Ordem natural");
        songList.sort((song1, song2) -> song1.getTitle().compareTo(song2.getTitle()));
        System.out.println(songList);

        System.out.println("---Ordem decrescente");
        songList.sort((song1, song2) -> song2.getTitle().compareTo(song1.getTitle()));
        System.out.println(songList);

        System.out.println("---Decrescente com int");
        songList.sort((song1, song2) -> song2.getBpm() - song1.getBpm());
        System.out.println(songList.stream()
                .map(song -> String.valueOf(song.getBpm()))
                .collect(Collectors.joining(", ", "", ".")));
    }
}
