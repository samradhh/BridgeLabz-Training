class Node{
    int rollNumber;
    String name;
    int age;
    String grade;
    Node next;
    Node(int rollNumber,String name,int age,String grade){
        this.rollNumber=rollNumber;
        this.name=name;
        this.age=age;
        this.grade=grade;
        this.next=null;
    }
}
public class StudentRecordManager {
    private Node head;
    public void addFirst(int rollNumber,String name,int age,String grade){
        Node newNode=new Node( rollNumber, name, age,grade);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
        return;
    }
    public void addLast(int rollNumber, String name, int age, String grade){
        Node newNode=new Node(rollNumber, name, age, grade);
        if(head==null){
            head=newNode;
            return;
        }
        Node t=head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=newNode;
        return;
    }
    public void deletebyRollNumber(int rollnumber){
        if(head==null){
            return;
        }
        if (head.rollNumber == rollnumber) {
        head = head.next;
        return;
        }

        Node prev = head;
        Node curr = head.next;

        while (curr != null) {
        if (curr.rollNumber == rollnumber) {
            prev.next = curr.next;   
            return;
        }
        prev = curr;
        curr = curr.next;
    }
    }
    public void searchbyRollNumber(int data){
        if(head==null){
            return;
        }
        Node t=head;
        while(t!=null){
            if(t.rollNumber==data){
                System.out.println("The Student Present and his name is :"+ t.name);
                return;
            }
            t=t.next;
        }
        System.out.println("The Student is not present");
    }
    public void displayAll(){
        Node t=head;
        System.out.println("RollNumber\tname\tage\tGrade");
        while(t!=null){
            System.out.println(t.rollNumber+"\t"+t.name+"\t"+t.age+"\t"+t.grade);
            t=t.next;
        }
    }
    public void update(int rollNumber,String name,String grade){
        if(head==null){
            return;
        }
        Node t=head;
        while(t!=null){
            if(t.rollNumber==rollNumber){
                t.name=name;
                t.grade=grade;
                System.out.println("The Record Updated");
                return;
            }
            t=t.next;
        }
    }
    public static void main(String[]args){
        StudentRecordManager p=new StudentRecordManager();
        p.addFirst(1,"kuldeep Singh",24,"A+");
        p.addFirst(26,"Rishabh Gupta",21,"O++");
        p.addLast(69,"Aryan Randii",36,"l+");
        p.searchbyRollNumber(1);
        p.displayAll();
        p.update(69,"Aryan","A+");
        p.displayAll();
        p.deletebyRollNumber(1);
    }
}