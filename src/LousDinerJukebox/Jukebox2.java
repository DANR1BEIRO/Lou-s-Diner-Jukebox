package LousDinerJukebox;

import java.util.ArrayList;
import java.util.List;

public class Jukebox2 {

    public static void main(String[] args) {
        new Jukebox2().go();

    }
    public void go(){
        List<Song> songList = MockSongs.getSongsObjects();
        /**
         * Chame o metodo sort na lista de Songs e passe
         * para ele uma referência a um objeto Comparator, projetado
         * especificamente para ordenar objetos Song
         */
        songList.sort(new ArtistCompare());
        System.out.println(songList);
    }
}
