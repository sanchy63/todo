package Main.MachineCoding.MusicPlayer;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Create a SongInfo object
        SongInfo song1 = new SongInfo();
        song1.setSongName("SoulMate");
        song1.setSingerName("Arjit Singh");
        song1.setdate("23 fb 2024");
        song1.setduration("3 minutes");

        // Create a PlayList object and add the song
        PlayList mPlayList = new PlayList();
        mPlayList.addSong(song1);
        mPlayList.showPlaylist();

        // Create an ArrayList of songs
        ArrayList<SongInfo> music = new ArrayList<>();
        music.add(song1);

        // Search for a song by name
        searchSongByName(song1.getSongName(), music);

        // Play the song with a timer
        playWithTimer(song1.getSongName());

        // Repeat the song 3 times
        repeatSong(song1, 3);
    }

    public static void searchSongByName(String name, ArrayList<SongInfo> songlist) {
        for (SongInfo song : songlist) {
            if (song.getSongName().equals(name)) {
                Player player1 = new Player(song.getSongName());
                player1.start();
                return; // Exit the method if the song is found
            }
        }
        // If no song is found, print this message
        System.out.println("Song is not found");
    }

    public static void playWithTimer(String name) {
        System.out.println("Playing song: " + name);
        try {
            Thread.sleep(3000); // Simulate 3 seconds of playtime
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("Song finished " + name);
    }

    public static void repeatSong(SongInfo song, int times) {
        System.out.println("Repeating song " + song.getSongName() + " " + times + " times:");
        for (int i = 0; i < times; i++) {
            System.out.println("Playing song: " + song.getSongName());
        }
    }
}