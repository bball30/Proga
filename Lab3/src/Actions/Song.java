package Actions;

import java.util.Objects;

public class Song {
    private String song;

    public Song(String st) {
        song = st;
    }

    public String getSong() {
        return song;
    }

    @Override
    public String toString() {
        return "Song{" +
                "song='" + song + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song1 = (Song) o;
        return song.equals(song1.song);
    }

    @Override
    public int hashCode() {
        return Objects.hash(song);
    }
}
