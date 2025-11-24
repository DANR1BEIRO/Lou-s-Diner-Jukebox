package LousDinerJukebox;

import com.sun.security.jgss.GSSUtil;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jukebox4 {
    public static void main(String[] args) {
        Jukebox4.go();
    }

    public static void go() {
        List<Song> songList = MockMoreSongs.getSongsObjects();
        System.out.println(songList);

        songList.sort((s1, s2) -> s1.getTitle().compareTo(s2.getTitle()));
        System.out.println(songList);

        Set<Song> songSet = new HashSet<>(songList);
        System.out.println(songSet);

        System.out.println(System.identityHashCode(songList));
        System.out.println(System.identityHashCode(songSet));
        System.out.println(true ? songList.equals(songSet) : false);
    }
}
