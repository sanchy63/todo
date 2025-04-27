package Main.MachineCoding.Abstraction;

public class Abstraction {
    private String songName;
    private String SigngerName;
    public void setSongName(String songName){
        this.songName=songName;
    }
    public String getSongName(){
        return getSongName();
    }
    public void playmusic(){
       System.out.println(this.songName+"is playing");
    }
}
