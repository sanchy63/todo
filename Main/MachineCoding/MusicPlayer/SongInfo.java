package Main.MachineCoding.MusicPlayer;

public class SongInfo {
    private String SongName;
    private String SingerName;
    private String date;
    private String duration;
    public void setSongName(String SongName) {
        this.SongName = SongName;
    }
    public void setSingerName(String name){
        this.SingerName=name;
    }
    public void setdate(String date){
        this.date=date;
    }
    public void setduration(String duration){
        this.duration=duration;
    }
    public String getSongName(){
        return SongName;
    }
    public String getSingerName(){
        return SingerName;
    }
    public String getdate(){
        return date;
    }
    public String getDuration(){
        return duration;
    }
}
