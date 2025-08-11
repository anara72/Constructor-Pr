package home_work;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
       home_work.Reader reader = new Reader("Попов В.В.",2, 9987776573212349L,
               LocalDate.of(1970, 2,23), 996705123661L);

        reader.takeBook(4);
        reader.returnBook(2);
        reader.getInfo();

    }
}