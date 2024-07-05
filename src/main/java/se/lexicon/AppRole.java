package se.lexicon;

public enum AppRole {
    ROLE("user","admin");

    private String user;
    private String admin;

    AppRole(String user,String admin) {
        this.user = user;
        this.admin = admin;

    }

    public String getUser() {
        return user;
    }

    public String getAdmin() {
        return admin;
    }


}

