
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Customer {
    private long id;
    private String fullName;
    private String email;
    private LocalDate dateOfBirth;
    private String phoneNumber;

    public Customer() {
    }

    public Customer(long id, String fullName, String email, LocalDate dateOfBirth, String phoneNumber) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    //создаем массив, чтобы сохрaнить данные
    //todo DB
    Customer[] customers = new Customer[10];
    int count = 0; //index

    //CRUD
    //todo C - create
    public void createCustomer(Customer customer) {
        customers[count++] = customer;
        System.out.println("Success");
    }

    //todo R - read
    public Customer[] getAllCustomers() { //не принимает параметров, просто возвращает
        return customers;
    }

    public Customer getByIdCustomer(long id) {
        for (Customer c : customers) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null; //если не сработает if, то null
    }

    //todo U - update
    public void updaCustomerById(long id, Customer newCustomer) {
        //id никогда не меняется!!!!!!
        Customer oldCustomer = getByIdCustomer(id); //option 1
        oldCustomer.setFullName(newCustomer.getFullName());
        oldCustomer.setEmail(newCustomer.getEmail());
        System.out.println("GREATE!");
        /*for(Customer cc : customers){ //option 2
            if(cc.id == id){
                cc.setFullName(newCustomer.getFullName()); //меняем имя клиента по id на новый
                cc.setEmail(newCustomer.getEmail());
                System.out.println("GREATE!");
                return; //прерываем цикл, когда совпадает условие, как break
            }
            else {
                System.out.println("Customer with id (" + id + ") not found!");
            }
        }*/
    }

    //todo D - delete
    public void deleteCustomerById(long id) {
        int index = -1;
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getId() == id) {
                index = i; //если id = 1, то index = 0
                break;
            }
        }
        System.out.println(id);
        Customer[] newCustomers = new Customer[customers.length - 1]; //если всего 10, то после удаления станет 9
        for (int i = 0; i < index; i++) {  //данныйларды табылганга чейинки данныйларды переносим в новый
            newCustomers[i] = customers[i];
        }
        /*for (int i = 0; i < newCustomers.length; i++) { //табылгандан кийин
            newCustomers[i] = customers[i+1];
        }*/ //НЕ НАДО когда двое!! А если неск-ко то можно использовать
        customers = newCustomers;
    }

    @Override
    public String toString() {
        return "\nid: " + id +
                "\nFullName: " + fullName +
                "\nEmail: " + email +
                "\nDateOfBirth: " + dateOfBirth +
                "\nPhoneNumber: " + phoneNumber + "\n";

    }
}
