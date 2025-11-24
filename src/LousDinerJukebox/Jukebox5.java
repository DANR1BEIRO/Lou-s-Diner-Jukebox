package LousDinerJukebox;

import java.util.Set;
import java.util.TreeSet;

public class Jukebox5 {
    public static void main(String[] args) {
        Jukebox5.go();
    }

    public static void go() {

        Set<Song> treeSongSet = new TreeSet<>(MockMoreSongs.getSongsObjects());
        System.out.println(treeSongSet);

        Set<Song> treeSongSet2 = new TreeSet<>((o1, o2) -> o1.getArtist().compareTo(o2.getArtist()));
        treeSongSet2.addAll(MockMoreSongs.getSongsObjects());
        System.out.println(treeSongSet2);
    }
}
