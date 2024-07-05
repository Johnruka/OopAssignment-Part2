package se.lexicon;

public class AppUser implements IAppointment {

    String username;
    String password;
    AppRole role;
    String user;

    public AppUser(String username,String password, AppRole role) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.user = getUsername();
    }


    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public void setUsername() {
        this.username = username;

    }

    @Override
    public String getPassword() {
        return password;
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
        this.role = role;

    }

    @Override
    public boolean equals() {
        return false;
    }
}

