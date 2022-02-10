package com.company;

public class Song {
     private String title;
     private String artist;
     private String genre;
     private int seconds;

     public Song(String title, String artist, String genre, int seconds) {
          this.title = title;
          this.artist = artist;
          this.genre = genre;
          this.seconds = seconds;
     }

     @Override
     public String toString() {
          return "Song{" +
                  "title='" + title + '\'' +
                  ", artist='" + artist + '\'' +
                  ", genre='" + genre + '\'' +
                  ", seconds=" + seconds +
                  '}';
     }

     public String getTitle() {
          return title;
     }

     public void setTitle(String title) {
          this.title = title;
     }

     public String getArtist() {
          return artist;
     }

     public void setArtist(String artist) {
          this.artist = artist;
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public int getSeconds() {
          return seconds;
     }

     public void setSeconds(int seconds) {
          this.seconds = seconds;
     }
}
