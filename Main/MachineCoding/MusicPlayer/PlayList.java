package Main.MachineCoding.MusicPlayer;

import java.util.ArrayList;

public class PlayList extends SongInfo{
    private ArrayList<SongInfo> songlist=new ArrayList<>();
    public void addSong(SongInfo song){
        songlist.add(song);
        System.out.println("Added song : "+song.getSongName());
    }
    public void removeSong(SongInfo song){
        if(songlist.contains(song)){
            songlist.remove(song);
        }
        System.out.println(song.getSongName()+" "+"is removed");
    }
    public void showPlaylist(){
        System.out.println("playlist");
        for(SongInfo song:songlist){
            System.out.println("- "+song.getSongName()+" by "+ song.getSingerName());
        }
    }
}
