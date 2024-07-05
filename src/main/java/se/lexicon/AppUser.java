package se.lexicon;

import java.util.Arrays;

public interface AppUser {

    String username = null;
    String password = null;
    AppRole role = null;
    String credentials = Arrays.toString(new String[]{username, password});


    String getUsername();
    void setUsername();
    String getPassword();
    void setPassword();
    AppRole getRole();
    void setRole();
    boolean equals();
    int hashCode();
    String toString();

}
