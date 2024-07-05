package se.lexicon;

public enum Role {
    ROLE("user","admin");

    private final String user;
    private final String admin;

    Role(String user, String admin) {
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

