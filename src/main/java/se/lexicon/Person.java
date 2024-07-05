package se.lexicon;

public class Person implements User {

    private String name;
    private Role role;


    public Person(String name, String role) {
        this.name = name;
        this.role = Role.valueOf(role);


    }

    public Person(Person[] user) {

    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return "person: " + name + " , role: " + role;
    }

    @Override
    public String setUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String setPassword() {
        return password;

    }

    @Override
    public Role getRole() {
        return role;
    }

    @Override
    public void setRole() {
        this.role = role;

    }

    @Override
    public boolean equals() {
        return false;
    }
}