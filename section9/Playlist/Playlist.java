package section9.Playlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
  public static void main(String[] args) {
    LinkedList<Song> playlist = populatePlaylist();
    playPlaylist(playlist);
  }

  public static void playPlaylist(LinkedList<Song> playlist) {
    ListIterator<Song> li = playlist.listIterator();

    if (playlist.isEmpty()) {
      System.out.println("Playlist is empty");
      return;
    } else {
      System.out.println("\nNow playing " + li.next());
    }

    Scanner scanner = new Scanner(System.in);
    boolean quit = false;
    boolean forward = true;

    printOptions();

    while (!quit) {
      System.out.print("Choose an option: ");
      int selection = scanner.nextInt();
      scanner.nextLine();

      switch (selection) {
        case 0:
          printOptions();
          break;
        case 1:
          printPlaylist(playlist);
          break;
        case 2: // move forward
          if (!forward) { // move cursor position
            if (li.hasNext()) {
              li.next();
            }
            forward = true;
          }
          if (li.hasNext()) {
            System.out.println("Now playing " + li.next());
          } else {
            System.out.println("At end of playlist");
          }
          break;
        case 3: // move backward
          if (forward) {
            if (li.hasPrevious()) {
              li.previous();
            }
            forward = false;
          }
          if (li.hasPrevious()) {
            System.out.println("Now playing " + li.previous());
          } else {
            System.out.println("At start of playlist");
          }
          break;
        case 4:
          if (!playlist.isEmpty()) {
            li.remove();
            if (li.hasNext()) {

              System.out.println("\nNow playing " + li.next());
            } else if (li.hasPrevious()) {
              System.out.println("\nNow playing " + li.previous());
            }
          } else {
            System.out.println("Playlist is empty");
          }
          break;
        case 5:
          System.out.println("Goodbye");
          quit = true;
          break;
        default:
          System.out.println("There was a problem.");
          quit = true;
          break;
      }
    }
  }

  public static void printPlaylist(LinkedList<Song> playlist) {
    System.out.println("=========================\nSongs in playlist: ");
    for (Song song : playlist) {
      System.out.println((playlist.indexOf(song) + 1) + ". " + song.getTitle() + ", " + song.getDuration());
    }
    System.out.println("=========================");
  }

  public static void printOptions() {
    System.out.println(
        "\nOptions:\n0: Print options\n1: Show songs in playlist\n2: Next song\n3: Previous song\n4: Delete current song\n5: Quit");
  }

  public static LinkedList<Song> populatePlaylist() {
    ArrayList<Album> albums = new ArrayList<>();

    Album album = new Album("Stormbringer", "Deep Purple");
    album.addSong("Stormbringer", 4.6);
    album.addSong("Love don't mean a thing", 4.22);
    album.addSong("Holy man", 4.3);
    album.addSong("Hold on", 5.6);
    album.addSong("Lady double dealer", 3.21);
    album.addSong("You can't do it right", 6.23);
    album.addSong("High ball shooter", 4.27);
    album.addSong("The gypsy", 4.2);
    album.addSong("Soldier of fortune", 3.13);
    album.addSong("Soldier of fortune", 3.13);
    albums.add(album);

    album = new Album("For those about to rock", "AC/DC");
    album.addSong("For those about to rock", 5.44);
    album.addSong("I put the finger on you", 3.25);
    album.addSong("Lets go", 3.45);
    album.addSong("Inject the venom", 3.33);
    album.addSong("Snowballed", 4.51);
    album.addSong("Evil walks", 3.45);
    album.addSong("C.O.D.", 5.25);
    album.addSong("Breaking the rules", 5.32);
    album.addSong("Night of the long knives", 5.12);
    albums.add(album);

    LinkedList<Song> playList = new LinkedList<>();
    albums.get(0).addToPlayList("Speed king", playList); // Does not exist
    albums.get(0).addToPlayList("You can't do it right", playList);
    albums.get(0).addToPlayList("Holy man", playList);
    albums.get(0).addToPlayList(9, playList);
    albums.get(1).addToPlayList(3, playList);
    albums.get(1).addToPlayList(2, playList);
    albums.get(1).addToPlayList(24, playList); // There is no track 24

    return playList;
  }
}

// The Playlist class will be modified to use an inner class called SongList
// which will replace the ArrayList that was used to hold the list of songs for
// an album.

// The SongList class will use an ArrayList to hold the track list for the
// album. To do this a member variable called songs will need to be declared and
// a constructor will need to be implemented to initialize the field.

// In addition, the inner class will need three(3) methods:

// 1) add - accepts a parameter of type Song. This method returns a boolean
// value which will be false if the song is found to already be in the songs
// list. If not, the song will be added to the list and a value of true will be
// returned.

// 2) findSong - accepts the title of a song as its only parameter. If the song
// with that title is found in the list then the song is returned from the
// method. If not, a value of null is returned.

// 3) findSong - overridden method which accepts a track number for a song. The
// track number is of type int. If a song is found with that track number the
// song is returned, otherwise null is returned.

// The member variable, constructor and all methods may be marked with private
// access.