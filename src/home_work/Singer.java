package home_work;

public class Singer extends Person {
    private String bandName;
    private String singing;
    private String playGitar;

    public Singer  (String name,String designation,String walk,String eat,String bandName,String singing,String playGitar  ) {
        super(name,designation,walk,eat);
        this.bandName = bandName;
        this.singing = singing;
        this.playGitar= playGitar;
    }
    public void printPersoninfo(){
        super.printinfo();
        System.out.println("BandName :" + bandName);
        System.out.println("Singing :" + singing);
        System.out.println("PlayGitar :" + playGitar);

    }

    public String getGroupName() {
        return bandName;
    }

    public String getDancing() {
        return singing;
    }

    public String getPlayGitar() {
        return playGitar;
    }
}
