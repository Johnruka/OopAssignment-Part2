package se.lexicon;

import java.util.Arrays;

public interface User {

    String username = null;
    String password = null;
    Role role = null;
    String credentials = Arrays.toString(new String[]{username, password});


    static String getUsername() {
        return username;
    }

    String setUsername();

    String getPassword();

    String setPassword();

    Role getRole();

    void setRole();

    boolean equals();

    int hashCode();

    String toString();

}
