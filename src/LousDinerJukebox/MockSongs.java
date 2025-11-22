package LousDinerJukebox;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {
    public static List<String> getSongStrings() {
        List<String> songs = new ArrayList<>(
                List.of("somersalt", "cassidy", "$10", "havana", "Cassidy", "50 ways")
        );
        return songs;
    }
}
