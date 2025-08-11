package home_work;

import java.time.LocalDate;

public class Reader {
    String fullName;
    int library;
    long cardNumber;
    LocalDate dateOfBirth;
    long phoneNumber;

    public Reader(String fullName, int library, long cardNumber,
                  LocalDate dateOfBirth, long phoneNumber){
        this.fullName = fullName;
        this.library = library;
        this.cardNumber = cardNumber;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int count) {
        System.out.println(fullName + " взял " + count + " книги.");
    }

    public void returnBook(int count) {
        System.out.println(fullName + " вернул " + count + " книги.");
    }

    public void getInfo(){
        System.out.println("\n" + "Имя: " + fullName + "\n" +
                "Оставшиеся книги: " + library + "\n" +
                "Номер карты: " + cardNumber + "\n" +
                "Дата рождения: " + dateOfBirth + "\n" +
                "Номер телефона: " + phoneNumber + "\n");
    }

}
