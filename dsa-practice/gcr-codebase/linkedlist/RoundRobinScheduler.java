class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;
    int waitingTime;
    int turnAroundTime;
    ProcessNode next;

    ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}

public class RoundRobinScheduler {

    private ProcessNode head;
    private int processCount;

    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(pid, burstTime, priority);
        processCount++;

        if (head == null) {
            head = node;
            node.next = node;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = node;
        node.next = head;
    }

    public void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head;
        ProcessNode prev = null;

        do {
            if (curr.pid == pid) {
                if (curr == head && curr.next == head) {
                    head = null;
                } else {
                    if (curr == head) {
                        head = head.next;
                    }
                    if (prev != null) {
                        prev.next = curr.next;
                    } else {
                        ProcessNode temp = head;
                        while (temp.next != curr) {
                            temp = temp.next;
                        }
                        temp.next = curr.next;
                    }
                }
                processCount--;
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    public void displayQueue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }

        ProcessNode temp = head;
        do {
            System.out.println("PID: " + temp.pid +
                    " Remaining: " + temp.remainingTime +
                    " Priority: " + temp.priority);
            temp = temp.next;
        } while (temp != head);
    }

    public void simulate(int timeQuantum) {
        if (head == null) return;

        int time = 0;
        ProcessNode curr = head;

        while (processCount > 0) {
            if (curr.remainingTime > 0) {
                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                time += execTime;

                ProcessNode temp = head;
                do {
                    if (temp != curr && temp.remainingTime > 0) {
                        temp.waitingTime += execTime;
                    }
                    temp = temp.next;
                } while (temp != head);

                System.out.println("\nAfter executing PID " + curr.pid);
                displayQueue();

                if (curr.remainingTime == 0) {
                    curr.turnAroundTime = time;
                    int finishedPid = curr.pid;
                    curr = curr.next;
                    removeProcess(finishedPid);
                    continue;
                }
            }
            curr = curr.next;
        }
    }

    public void calculateAverages(ProcessNode originalHead) {
        if (originalHead == null) return;

        int totalWT = 0;
        int totalTAT = 0;
        int count = 0;

        ProcessNode temp = originalHead;
        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnAroundTime;
            count++;
            temp = temp.next;
        } while (temp != originalHead);

        System.out.println("\nAverage Waiting Time: " + (double) totalWT / count);
        System.out.println("Average Turnaround Time: " + (double) totalTAT / count);
    }

    public static void main(String[] args) {
        RoundRobinScheduler rr = new RoundRobinScheduler();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        System.out.println("Initial Queue:");
        rr.displayQueue();

        int timeQuantum = 3;
        rr.simulate(timeQuantum);
    }
}