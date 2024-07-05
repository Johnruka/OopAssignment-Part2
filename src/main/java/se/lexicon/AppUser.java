package se.lexicon;

import java.util.Arrays;

public interface AppUser {

    String username = null;
    String password = null;
    AppRole role = null;
    String credentials = Arrays.toString(new String[]{username, password});


    static String getUsername() {
        return username;
    }

    String setUsername();

    String getPassword();

    String setPassword();

    AppRole getRole();

    void setRole();

    boolean equals();

    int hashCode();

    String toString();

}
