package LousDinerJukebox;

import java.util.Comparator;

public class ArtistCompare implements Comparator<Song> {
    @Override
    public int compare(Song song, Song t1) {
        return song.getArtist().compareTo(t1.getArtist());
    }
}
