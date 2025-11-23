package LousDinerJukebox;

import java.util.Collections;
import java.util.List;

public class Jukebox1 {
    public static void main(String[] args) {
        new Jukebox1().go();
    }

    /**
     * Ordem natural significa ordem alfabética
     * caracteres especiais > números > letras maiúsculas > letras minúsculas
     */
    public void go() {
        List<Song> songList = MockSongs.getSongsObjects();
        System.out.println("Lista em ordem de inserção: " + songList);
        Collections.sort(songList);
        System.out.println("Lista ordenada naturalmente pelo sort: " + songList);
    }
}
