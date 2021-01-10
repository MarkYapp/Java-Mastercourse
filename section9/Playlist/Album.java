package section9.Playlist;

import java.util.ArrayList;
import java.util.List;

public class Album {
  private String name;
  private String artist;
  private SongList songs;

  public Album(String name, String artist) {
    this.name = name;
    this.artist = artist;
    this.songs = new SongList();
  }

  public Song getSong(int track) {
    return songs.findSong(track);
  }

  public boolean addSong(String title, double duration) {
    if (findSong(title) != null) { // check if song already exists in album
      System.out.println(title + " is already on " + this.name);
      return false;
    }

    return songs.add(new Song(title, duration));
  }

  public boolean addToPlayList(int track, List<Song> playlist) {
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

  public boolean addToPlayList(String title, List<Song> playlist) {
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
    return songs.findSong(title);
  }

  public class SongList {
    private ArrayList<Song> songList;

    SongList() {
      this.songList = new ArrayList<>();
    }

    private boolean add(Song song) {
      if (songList.contains(song)) {
        return false;
      }
      songList.add(song);
      return true;
    }

    private Song findSong(String title) {
      for (int i = 0; i < songList.size(); i++) {
        Song currentSong = songList.get(i);
        if (currentSong.getTitle().equals(title)) {
          return currentSong;
        }
      }
      return null;
    }

    private Song findSong(int track) {
      int trackIndex = track - 1;
      if (trackIndex < 0 || trackIndex > songList.size()) {
        return null;
      }
      return songList.get(trackIndex);
    }
  }
}
