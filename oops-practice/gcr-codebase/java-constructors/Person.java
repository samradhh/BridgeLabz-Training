public class Person {
    private String name;
    private int age;
    //Default constructor
    public Person() {
        this.name = "John Doe";
        this.age = 30;
    }
    //Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("---------------------------");
    }
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Alice", 25);
        Person person3 = new Person(person2);

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }

}