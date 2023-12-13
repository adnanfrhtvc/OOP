package org.example.Week8.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Ja bez tebe ne mogu da živim", "Halid Bešlić", "Folk"));
        playlist.add(new Song("Dani su bez broja", "Magazin", "Pop"));
        playlist.add(new Song("Danima te čekam", "Šaban Šaulić", "Folk"));
        playlist.add(new Song("Razmažena", "Jelena Rozga", "Pop"));

        String targetGenre = "Pop";
        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, targetGenre);

        System.out.println("Songs with genre " + targetGenre + ":");
        while (genreFilterIterator.hasNext()) {
            Song song = genreFilterIterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}
