package org.example.Week8.Task4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class GenreFilterIterator implements Iterator<Song> {
    private List<Song> playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(List<Song> playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size()) {
            if (playlist.get(currentIndex).getGenre().equals(targetGenre)) {
                return true;
            }
            currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No more songs with the target genre");
        }
        return playlist.get(currentIndex++);
    }
}
