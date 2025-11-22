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
        List<String> songList = MockSongs.getSongStrings();
        Collections.sort(songList);
        System.out.println(songList);
    }
}
