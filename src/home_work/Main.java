package home_work;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

          Person person = new Person("Samat: ","Father: ","ingener:","Plov:");
          Programmer programmer = new Programmer("Azamat:","Son:","Programmer:","Pizza:","Codi fain:","Codi:","It");
          Dancer dancer  = new Dancer("Aida:","Daughter:","Dancer","Doner","Shoola","Brek");
          Singer singer = new Singer("Bektyr :","Granson","Singer:","Burger:","Biz:","Lale:","Duduk");
           System.out.println("-----------------Person---------------");
           person.printinfo();
           System.out.println("----------------Programmer------------");
             programmer.printPersoninfo();
             System.out.println("-_______________Dancer_______________");
             dancer.printPersoninfo();
             System.out.println("---------------- Singer---------------");
             singer.printPersoninfo();

//        Refrigerator refrigerator = new Refrigerator();
//        Scanner scannerForStr = new Scanner(System.in);
//        Scanner scannerForNum = new Scanner(System.in);
//        Refrigerator refrigerator1 = new Refrigerator();
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
//
//        Refrigerator refrigerator2 = new Refrigerator();
//        System.out.println("Write id: ");
//        refrigerator2.setId(scannerForNum.nextLong());
//        System.out.println("Write name: ");
//        refrigerator2.setName(scannerForStr.nextLine());
//        System.out.println("Write volume :");
//        refrigerator2.setVolume(scannerForNum.nextInt());
//        System.out.println("Write cooling:");
//        refrigerator2.setCooling(scannerForStr.nextLine());
//        System.out.println("Write control:");
//        refrigerator2.setControl(scannerForStr.nextLine());
//
//        Refrigerator refrigerator3 = new Refrigerator();
//        System.out.println("Write id: ");
//        refrigerator3.setId(scannerForNum.nextLong());
//        System.out.println("Write name: ");
//        refrigerator3.setName(scannerForStr.nextLine());
//        System.out.println("Write volume :");
//        refrigerator3.setVolume(scannerForNum.nextInt());
//        System.out.println("Write cooling:");
//        refrigerator3.setCooling(scannerForStr.nextLine());
//        System.out.println("Write control:");
//        refrigerator3.setControl(scannerForStr.nextLine());
//

//        refrigerator.createRefrigerator(refrigerator.getRefrigerator(new Refrigerator()));
//        refrigerator.getByIdRefrigerator(new Scanner(System.in).nextLong());
//        refrigerator.getAllRefrigerators(); // todo
//        refrigerator.updateRefrigeratorById(1, refrigerator.getRefrigerator(new Refrigerator()));
//        refrigerator.deleteRefrigeratorById(1);

////     Refrigerator refrigerator2 = new Refrigerator();
////        System.out.println("Write id: ");
////        refrigerator2.setId(scanner.nextLong());
////        System.out.println("Write name: ");
//        refrigerator2.setName(scanner.nextLine());
//        System.out.println("Write volume :");
//        refrigerator2.setVolume(scanner.nextInt());
//        System.out.println("Write cooling:");
//        refrigerator2.setCooling(scanner.nextLine());
//        System.out.println("Write control:");
//        refrigerator2.setControl(scanner.nextLine());
//
////




//         System.out.println("GET ALL: ");
//        System.out.println(Arrays.toString(customer.getAllCustomers())); //A.A and B.B
//        System.out.println("GET BY: ");
//        System.out.println(customer.getByIdCustomer(2L));
//        //изменяем данные
//        System.out.println("UPDATE: ");
//        Customer updateCustomer = new Customer();
//        updateCustomer.setFullName("C.C");
//        updateCustomer.setEmail("c@gmail.com");
//        Customer customer = new Customer();
//        //customer.createCustomer();
//        //ичине киргизуу
//        Customer customer1 = new Customer(); //положим аргументы в метод в классе createCustomer
//        customer1.setId(1L);
//        customer1.setFullName("A.A");
//        customer1.setEmail("e@gmail.com");
//        customer1.setDateOfBirth(LocalDate.of(2006, 4, 6));
//        customer1.setPhoneNumber("+996999999");
//        //customer.createCustomer(customer1); // == (Customer customer) в классе
//
//        Customer customer2 = new Customer(); //положим аргументы в метод в классе createCustomer
//        customer2.setId(2L);
//        customer2.setFullName("B.B");
//        customer2.setEmail("n@gmail.com");
//        customer2.setDateOfBirth(LocalDate.of(2006, 4, 6));
//        customer2.setPhoneNumber("+996990000");
//        System.out.println("CREATE: ");
//        customer.createCustomer(customer1); //такой метод сохраняет предыдущее значение и добавляется новое
//        customer.createCustomer(customer2); //A.A and B.B //Success выходит два раза
//        //выводим данные
//        customer.updaCustomerById(1L, updateCustomer);
//        System.out.println(Arrays.toString(customer.getAllCustomers())); //C.C and B.B
//        //удаляем
//        System.out.println("DELETE: ");
//        customer.deleteCustomerById(2L);
//        System.out.println("GET ALL: ");
//        System.out.println(Arrays.toString(customer.getAllCustomers()));
//    }
//}

    }
}