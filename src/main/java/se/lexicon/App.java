package se.lexicon;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {

// Appointment
        Appointment appointment1 = new Appointment(25565);
        Appointment appointment2 = new Appointment(356894);

        System.out.println("Appointment information:");
        System.out.println(appointment1.getAppointmentInformation());
        System.out.println(appointment2.getAppointmentInformation());
        System.out.println();


        //Person
        Person person1 = new Person(25645625, "David", "Land", "david@gmail.com");
        Person person2 = new Person(45645625, "Marcus", "Carlsson", "david@gmail.com");

        //Before Appointment
        System.out.println("person information:");
        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());
        System.out.println();

        //AutoExpert
        Person assignee1 = new Person(25645625, "David", "Land", "david@gmail.com");
        Person assignee2 = new Person(55645625, "George", "Mats", "george@gmail.com");

        System.out.println("Assignee information:");
        System.out.println(person1.getAssigneeInformation());
        System.out.println(person2.getAssigneeInformation());
        System.out.println();

        person1.setAssignee(String.valueOf(appointment2));

        //After Assigned
        System.out.println("person information:");
        System.out.println(person1.getPersonInformation());
        System.out.println(person2.getPersonInformation());
        System.out.println();

        // User


        AppUser user1 = new AppUser("davis","55555",AppRole.USER);
        AppUser user2 = new AppUser("John","789546",AppRole.ADMIN);

        System.out.println("user information:");
        System.out.println(user1.getUsername());
        System.out.println(user2.getUsername());
        System.out.println();

    }
}



