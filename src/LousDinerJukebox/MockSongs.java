package LousDinerJukebox;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    /**
     * Metodo static porque a classe não tem campo de instância e não precisa de um
     *
     * @return lista de strings
     */
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>(
                List.of("somersault", "cassidy", "$10", "havana", "Cassidy", "50 ways")
        );
        return songs;
    }

    public static List<Song> getSongsObjects() {
        List<Song> songs = new ArrayList<>(List.of(
                new Song("somersault", "zero 7", 147),
                new Song("cassidy", "grateful dead", 158),
                new Song("$10", "hitchhiker", 140),
                new Song("havana", "cabello", 105),
                new Song("Cassidy", "grateful dead", 158),
                new Song("50 ways", "simon", 102)));

        return songs;
    }
}
