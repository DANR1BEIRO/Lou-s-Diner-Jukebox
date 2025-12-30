package LousDinerJukebox;

import java.util.Collections;
import java.util.Comparator;
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
        List<Song> songList = MockMoreSongs.getSongsObjects();
        System.out.println("Lista em ordem de inserção: " + songList);
        // Usa Comparable para ordenar
        Collections.sort(songList);
        System.out.println("Lista ordenada naturalmente pelo sort: " + songList);

        ArtistCompare artistCompare = new ArtistCompare();
        // Usa uma classe Comparator customizada para ordenar
        songList.sort(artistCompare);
        System.out.println("Comparando por artista utilizando um compare: " + songList);

        songList.sort(new Comparator<Song>() {
            @Override
            public int compare(Song song, Song t1) {
                return song.getArtist().compareTo(t1.getArtist());
            }
        });
        System.out.println("Ordena a lista pelo nome do artista usando um Comparator " +
                "implementado como classe interna anônima passada diretamente no método sort: \n "
                + songList);
    }
}
