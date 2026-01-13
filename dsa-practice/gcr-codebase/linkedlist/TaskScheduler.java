class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {

    private TaskNode head;
    private TaskNode current;

    public void addFirst(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = node;
            node.next = node;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        node.next = head;
        temp.next = node;
        head = node;
    }

    public void addLast(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = node;
            node.next = node;
            current = head;
            return;
        }
        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    public void addAtPosition(int pos, int id, String name, int priority, String dueDate) {
        if (pos <= 1 || head == null) {
            addFirst(id, name, priority, dueDate);
            return;
        }

        TaskNode temp = head;
        int count = 1;

        while (temp.next != head && count < pos - 1) {
            temp = temp.next;
            count++;
        }

        TaskNode node = new TaskNode(id, name, priority, dueDate);
        node.next = temp.next;
        temp.next = node;
    }

    public void removeByTaskId(int id) {
        if (head == null) return;

        TaskNode temp = head;
        TaskNode prev = null;

        do {
            if (temp.taskId == id) {
                if (temp == head && temp.next == head) {
                    head = current = null;
                } else if (temp == head) {
                    prev = head;
                    while (prev.next != head) {
                        prev = prev.next;
                    }
                    head = head.next;
                    prev.next = head;
                } else {
                    prev.next = temp.next;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    public void viewCurrentTask() {
        if (current == null) return;
        System.out.println(current.taskId + " " + current.taskName + " " +
                current.priority + " " + current.dueDate);
        current = current.next;
    }

    public void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(temp.taskId + " " + temp.taskName + " " +
                    temp.priority + " " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    public void searchByPriority(int priority) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println(temp.taskId + " " + temp.taskName + " " + temp.dueDate);
            }
            temp = temp.next;
        } while (temp != head);
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addFirst(1, "Design", 1, "10-01-2026");
        ts.addLast(2, "Coding", 2, "15-01-2026");
        ts.addAtPosition(2, 3, "Testing", 1, "18-01-2026");

        ts.displayAll();
        System.out.println("Current Task:");
        ts.viewCurrentTask();
        ts.viewCurrentTask();

        System.out.println("Search Priority 1:");
        ts.searchByPriority(1);

        ts.removeByTaskId(2);
        System.out.println("After Removal:");
        ts.displayAll();
    }
}