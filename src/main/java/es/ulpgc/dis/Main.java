package es.ulpgc.dis;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person juan = new Person("Juan", LocalDate.of(2001, 1, 1));
        System.out.println(juan);
    }
}