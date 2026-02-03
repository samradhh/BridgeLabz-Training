enum Role {
    ADMIN,
    REGULAR,
    INVALID
}

abstract class User 
{
    private final String username;
    private final Role role;

    public User(String username, String role) {
        this.username = username;
        Role tempRole;
        try {
            tempRole = Role.valueOf(role);
        } catch (Exception e) {
            tempRole = Role.INVALID;
        }
        this.role = tempRole;
    }

    public String getUsername() {
        return username;
    }
    

    public Role getRole() { 
        return role;
    }

    public abstract boolean hasAdminAccess();
}

class Admin extends User {
    public Admin(String username, String role) {
        super(username, role);
    }

    @Override
    public boolean hasAdminAccess() {
        return getRole() == Role.ADMIN;
    }
}

    class RegularUser extends User {
    public RegularUser(String username, String role) {
        super(username, role);
    }

    @Override
    public boolean hasAdminAccess() {
        return false;
    }
}

public class UserProfileManagement {
    public static void main(String[] args) {

        User admin = new Admin("admin", "ADMIN");
        System.out.println(admin.hasAdminAccess());   

        User regular = new RegularUser("user", "REGULAR");
        System.out.println(regular.hasAdminAccess()); 

        User invalid = new Admin("test", "GUEST");
        System.out.println(invalid.hasAdminAccess()); 
    }
}