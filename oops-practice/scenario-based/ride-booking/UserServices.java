import java.util.*;

public class UserServices {
    private List<User> list_User = new ArrayList<>();

    public void createUser(String name, String phoneNumber, String email){
        User u=new User(name,phoneNumber,email);
        list_User.add(u);
        System.out.println("User Created Successfully");
    }
}