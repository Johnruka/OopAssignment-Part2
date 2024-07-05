package se.lexicon;

public class Person implements AppUser {

    private final String name;
    private final AppRole role;

    public Person(String name, AppRole role) {
        this.name = name;
        this.role = role;


    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername() {

    }

    @Override
    public String getPassword() {
        return "";
    }

    @Override
    public void setPassword() {

    }

    @Override
    public AppRole getRole() {
        return role;
    }

    @Override
    public void setRole() {

    }

    @Override
    public boolean equals() {
        return false;
    }
}



