package se.lexicon;

public interface IAppointment {

    String getUsername();
    void setUsername();
    String getPassword();
    String setPassword();
    AppRole getRole();
    void setRole();
    boolean equals();
    String toString();
}
