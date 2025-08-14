package home_work;

public class Programmer extends Person{
    private String companyName;
    private String coding;
    private String learn;


    public Programmer (String name,String designation, String walk,String eat,String companyName,String coding,String learn) {
        super(name,designation,walk,eat);
        this.companyName = companyName;
        this.coding = coding;
        this.learn = learn;
    }
    public void printPersoninfo(){
        super.printinfo();
        System.out.println("CompanyName :" + companyName);
        System.out.println("Coding :" + coding);
        System.out.println("learn :" + learn);
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getCoding() {
        return coding;
    }

    public String getLearn() {
        return learn;
    }}



