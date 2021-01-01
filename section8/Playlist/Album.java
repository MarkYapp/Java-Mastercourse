package section8.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
  private String name;
  private String artist;
  private ArrayList<Song> songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new ArrayList<>();
  }

  public Song getSong(int track) { // track starts at 1
    int trackIndex = track - 1;
    if (trackIndex < 0 || trackIndex > this.songs.size()) {
      return null;
    }
    return this.songs.get(trackIndex);
  }

  public boolean addSong(String title, double duration) {
    if (findSong(title) != null) { // check if song already exists in album
      System.out.println(title + " is already on " + this.name);
      return false;
    }
    Song song = new Song(title, duration);
    this.songs.add(song);
    return true;
  }

  public boolean addToPlayList(int track, LinkedList<Song> playlist) {
    // return the song object
    Song song = getSong(track);

    // check if track exists on the album
    if (song == null) {
      System.out.println("The album \"" + this.name + "\" doesn't contain track #" + track);
      return false;
    }
    // check if song already exists in the playlist
    else if (playlist.contains(song)) {
      System.out.println(song.getTitle() + " is already in the playlist");
      return false;
    }
    // add song to playlist
    playlist.add(song);
    return true;
  }

  public boolean addToPlayList(String title, LinkedList<Song> playlist) {
    // retrieve song object
    Song song = findSong(title);
    // check if track exists on the album
    if (song == null) {
      System.out.println("The album \"" + this.name + "\" doesn't contain song \"" + title + "\"");
      return false;
    }
    // check if song already exists in the playlist
    else if (playlist.contains(song)) {
      System.out.println(song.getTitle() + " is already in the playlist");
      return false;
    }
    // add song to playlist
    playlist.add(song);
    return true;
  }

  private Song findSong(String title) {
    for (int i = 0; i < this.songs.size(); i++) {
      Song currentSong = this.songs.get(i);
      if (currentSong.getTitle().equals(title)) {
        return currentSong;
      }
    }
    return null;
  }
}
