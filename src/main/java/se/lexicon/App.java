package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Person[] user = {
                new Person("John Baptist", "user"),
                new Person("David Land", "admin"),


        };
        Person person = new Person(user);

        System.out.print(Arrays.equals(user, user));


    }
}



