package se.lexicon;

public class AppUser implements IAppointment {

    String username;
    String password;
    AppRole role;

    public AppUser(String username,String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }
}
