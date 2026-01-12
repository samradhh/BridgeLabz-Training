import java.util.*;
public class User {
    String name;
    String phoneNumber;
    String email;
    List<User> list_User=new ArrayList<>();
    User(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}