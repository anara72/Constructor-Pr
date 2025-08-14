package home_work;

 public class Dancer extends Person {
    private String groupName;
    private String dancing;

    public Dancer (String name,String designation,String walk,String eat,String groupName,String dancing) {
        super(name,designation,walk,eat);
        this.groupName = groupName;
        this.dancing = dancing;
    }
    public void printPersoninfo(){
        super.printinfo();
        System.out.println("GroupName :" + groupName);
        System.out.println("Dancing :" + dancing);

    }

    public String getGroupName() {
        return groupName;
    }

    public String getDancing() {
        return dancing;
    }}