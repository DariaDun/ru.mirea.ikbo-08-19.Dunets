package Author;
import java.lang.*;
public class Author {
    private String name;
    private String email;
    private char gender;
    public Author(String name, String emil, char gender) {
        this.name = name;
        this.email = emil;
        this.gender = gender; }
    public String getName() { return name; }
    public char getGender() { return gender;}
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String toString() { return name + " (" + gender + ") at " + email; }
}