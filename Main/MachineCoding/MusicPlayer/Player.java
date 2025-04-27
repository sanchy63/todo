package Main.MachineCoding.MusicPlayer;

public class Player extends SongInfo{
    private String songName;
    private boolean isPlaying;
    Player(String songname){
        this.songName=songname;
        System.out.println("current song is"+" "+songName);
    }
    public void start(){
        isPlaying=true;
        System.out.println(songName+" is playing");
    }
    public void stop(){
        if(isPlaying){
            isPlaying=false;
            System.out.println(songName+" "+"is stopped");
        }
        
    }
    public void nextsong(){
        System.out.println("next song is playing");
    }
}
