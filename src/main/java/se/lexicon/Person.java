package se.lexicon;

public abstract class Person {

    private final String name;
    private final AppRole role;
    private String username;
    private final String password;

    public Person(String name, AppRole role,String username, String password){
        this.name = name;
        this.role = role;
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username){
        this.username = username;
    }
}
