package home_work;

public class Person {
    private String name;
    private String designation;
    private String walk;
    private String eat;




    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }


    public String getWalk() {
        return walk;
    }

    public String getEat() {
        return eat;
    }

  public void printinfo() {
      System.out.println("Name :" + name);
      System.out.println("Designation:" + designation);
      System.out.println("Walk:" + walk);
      System.out.println("Eat:" + eat);
  }}
