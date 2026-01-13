class Node{
    int id;
    String name;
    String movieName;
    String seatNumber;
    String time;
    Node next;
    Node(int id,String name,String movieName,String seatNumber,String time){
        this.id=id;
        this.name=name;
        this.movieName=movieName;
        this.seatNumber=seatNumber;
        this.time=time;
        this.next=null;
    }
}
public class OnlineTicketReservationSystem {
    private Node head;
    private Node tail;
    public void add(int id,String name,String movieName,String seatNumber,String time){
        Node newNode = new Node( id, name,movieName,seatNumber,time);
        if(head==null){
            head=tail=newNode;
            tail.next=head;
            return;
        }
        tail.next=newNode;
        newNode.next=head;
        tail=newNode;
    }
    public void removebyId(int id){
        if(head==null){
            System.out.println("No ticket id Available");
            return;
        }
        Node curr=head;
        Node prev=null;
        if(head.id==id){
            head=head.next;
            System.out.println("The Ticket successfully deleted");
            return;
        }
        while(true){
            if(curr.id==id){
                prev.next=curr.next;
                System.out.println("The ticket successFully Deleted");
                return;
            }
            prev=curr;
            curr=curr.next;
            if(curr==head){
                break;
            }
        }
    }
    public void displayAll() {
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node t = head;
    while (true) {
        System.out.println(
            t.id + " " + t.name + " " + t.movieName + " " +
            t.seatNumber + " " + t.time
        );
        t = t.next;

        if (t == head) {
            break;
        }
    }
}
public void searchByMovieName(String movieName){
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node t = head;
    while (true) {
        if(t.movieName.equalsIgnoreCase(movieName)){
            System.out.println("the movie1 ticket found");
            System.out.println(t.id + " " + t.name + " " + t.movieName + " " +t.seatNumber + " " + t.time);
            return;
        }
        t = t.next;
        if (t == head) {
            break;
        }
    }
    System.out.println("No tickets found");
}
public void searchByName(String name){
    if (head == null) {
        System.out.println("List is empty");
        return;
    }

    Node t = head;
    while (true) {
        if(t.name.equalsIgnoreCase(name)){
            System.out.println("the movie ticket found");
            System.out.println(t.id + " " + t.name + " " + t.movieName + " " +t.seatNumber + " " + t.time);
            return;
        }
        t = t.next;
        if (t == head) {
            break;
        }
    }
    System.out.println("No tickets found");
}
public void totalTickets(){
    if (head == null) {
        System.out.println("0 tickets found");
        return;
    }

    Node t = head;
    int c=0;
    while (true) {
        c++;
        t = t.next;
        if (t == head) {
            break;
        }
    }
    System.out.println("the total tickets booked are : "+c );
}
    public static void main(String[]args){
        OnlineTicketReservationSystem p=new OnlineTicketReservationSystem();
        p.add(1, "Rahul Sharma", "KGF Chapter 2", "A1", "10:00 AM");
        p.add(3, "Vikas Singh", "Pathaan", "A3", "10:00 AM");
        p.add(4, "Neha Gupta", "Dunki", "B1", "01:00 PM");
        p.add(5, "Amit Kumar", "Animal", "B2", "01:00 PM");
        p.add(6, "Pooja Mishra", "3 Idiots", "B3", "01:00 PM");
        p.add(7, "Rohit Yadav", "Bahubali", "C1", "04:00 PM");
        p.add(8, "Sneha Patel", "RRR", "C2", "04:00 PM");
        p.add(9, "Karan Malhotra", "Avengers: Endgame", "C3", "04:00 PM");
        p.add(10, "Priya Saxena", "Inception", "D1", "07:00 PM");
        p.add(2, "Anita Verma", "Jawan", "A2", "10:00 AM");
        p.displayAll();
        p.removebyId(3);
        p.displayAll();
        p.searchByName("Vikas Singh");
        p.totalTickets();
        p.searchByMovieName("Jawan");
    }
}