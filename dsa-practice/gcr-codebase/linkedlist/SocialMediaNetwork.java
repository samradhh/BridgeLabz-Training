import java.util.ArrayList;
import java.util.List;

class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friends;
    UserNode next;

    UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = new ArrayList<>();
        this.next = null;
    }
}

public class SocialMediaNetwork {

    private UserNode head;

    public void addUser(int id, String name, int age) {
        UserNode node = new UserNode(id, name, age);
        node.next = head;
        head = node;
    }

    private UserNode findUserById(int id) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == id) return temp;
            temp = temp.next;
        }
        return null;
    }

    public void addFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null || id1 == id2) return;

        if (!u1.friends.contains(id2)) u1.friends.add(id2);
        if (!u2.friends.contains(id1)) u2.friends.add(id1);
    }

    public void removeFriendConnection(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        u1.friends.remove(Integer.valueOf(id2));
        u2.friends.remove(Integer.valueOf(id1));
    }

    public void displayFriends(int userId) {
        UserNode user = findUserById(userId);
        if (user == null) return;

        System.out.println("Friends of " + user.name + ":");
        for (int fid : user.friends) {
            UserNode f = findUserById(fid);
            if (f != null) System.out.println(f.userId + " " + f.name);
        }
    }

    public void findMutualFriends(int id1, int id2) {
        UserNode u1 = findUserById(id1);
        UserNode u2 = findUserById(id2);

        if (u1 == null || u2 == null) return;

        System.out.println("Mutual Friends:");
        for (int fid : u1.friends) {
            if (u2.friends.contains(fid)) {
                UserNode f = findUserById(fid);
                if (f != null) System.out.println(f.userId + " " + f.name);
            }
        }
    }

    public void searchByUserId(int id) {
        UserNode user = findUserById(id);
        if (user != null)
            System.out.println(user.userId + " " + user.name + " " + user.age);
        else
            System.out.println("User not found");
    }

    public void searchByName(String name) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println(temp.userId + " " + temp.name + " " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("User not found");
    }

    public void countFriends() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println(temp.name + " has " + temp.friends.size() + " friends");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        SocialMediaNetwork sm = new SocialMediaNetwork();

        sm.addUser(1, "Kuldeep", 24);
        sm.addUser(2, "Rahul", 23);
        sm.addUser(3, "Aman", 22);
        sm.addUser(4, "Neha", 21);

        sm.addFriendConnection(1, 2);
        sm.addFriendConnection(1, 3);
        sm.addFriendConnection(2, 3);
        sm.addFriendConnection(2, 4);

        sm.displayFriends(2);
        sm.findMutualFriends(1, 2);
        sm.countFriends();

        sm.removeFriendConnection(1, 3);
        System.out.println("After Removal:");
        sm.displayFriends(1);
    }
}