package home_work;
import java.util.Scanner;

public class Refrigerator {
    private Long id;
    private String name;
    private int volume;
    private String cooling;
    private String control;

    public Refrigerator() {
    }

    public Refrigerator(Long id, String name, int volume, String cooling, String control) {
        this.id = id;
        this.name = name;
        this.volume = volume;
        this.cooling = cooling;
        this.control = control;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCooling() {
        return cooling;
    }

    public void setCooling(String cooling) {
        this.cooling = cooling;
    }

    public String getControl() {
        return control;
    }

    public void setControl(String control) {
        this.control = control;
    }


    Refrigerator[] refrigerators = new Refrigerator[3];
    int count = 0;

    public void createRefrigerator(Refrigerator refrigerator) {
        refrigerators[count++] = refrigerator;
        System.out.println("Success");
    }

    public Refrigerator[] getAllRefrigerators() {
        return refrigerators;
    }

    public Refrigerator getByIdRefrigerator(long id) {
        for (Refrigerator refrigerator : refrigerators) {
            if (refrigerator.getId() == id) {
                return refrigerator;
            }
        }
        return null;
    }

    public void updateRefrigeratorById(long id, Refrigerator newRefrigerator) {
        Refrigerator oldRefrigerator = getByIdRefrigerator(id); //option 1
        oldRefrigerator.setName(newRefrigerator.getName());
        oldRefrigerator.setVolume(newRefrigerator.getVolume());
        System.out.println("GREATE!");

    }

    public void deleteRefrigeratorById(long id) {
        int index = -1;
        for (int i = 0; i < refrigerators.length; i++) {
            if (refrigerators[i].getId() == id) {
                index = i;
                break;
            }
        }
        System.out.println(id);
        Refrigerator[] newRefrigerator = new Refrigerator[refrigerators.length - 1];
        for (int i = 0; i < index; i++) {
            newRefrigerator[i] = refrigerators[i];
        }
        refrigerators = newRefrigerator;
    }

//    public Refrigerator getRefrigerator(Refrigerator refrigerator) {
//        Scanner scannerForStr = new Scanner(System.in);
//        Scanner scannerForNum = new Scanner(System.in);
//        Refrigerator refrigerator1 = new Refrigerator();
//
//        System.out.println("Write id: ");
//        refrigerator1.setId(scannerForNum.nextLong());
//        System.out.println("Write name: ");
//        refrigerator1.setName(scannerForStr.nextLine());
//        System.out.println("Write volume :");
//        refrigerator1.setVolume(scannerForNum.nextInt());
//        System.out.println("Write cooling:");
//        refrigerator1.setCooling(scannerForStr.nextLine());
//        System.out.println("Write control:");
//        refrigerator1.setControl(scannerForStr.nextLine());
//        return refrigerator1;
//
//    }




        @Override
        public String toString () {
            return
                    "\n" + "Id : " + id +
                            "Name :" + name + "\n" +
                            "Volume:" + volume + "\n" +
                            "Cooling :" + cooling + "\n" +
                            "Control :" + control + "\n" +
                            "Name :" + name + "\n" +
                            "Volume :" + volume + "\n" +
                            "Cooling :" + cooling + "\n" +
                            "Control :" + control + "\n";
        }
    }

