package software.ulpgc;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person("Juan", LocalDate.of(2001, 2, 5));
        System.out.println(juan);
    }
}
