public class Stereo {

    private String location;

    public Stereo(String location){
        this.location = location;
    }

    public void on(){
            System.out.println(location + " stereo is on ");
    }

    public void off(){
        System.out.println(location + " stereo is off");
    }

    public void setCd(){
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDvd(){
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio(){
        System.out.println(location + " stereo is set for radio output");
    }

    public void setVolume(int volumeLevel){
        System.out.println(location + " stereo volume set to " + volumeLevel);
    }

}
