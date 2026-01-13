
class TextState {
    String content;
    TextState prev;
    TextState next;

    TextState(String content) {
        this.content = content;
    }
}

public class TextEditorUndoRedo {

    private TextState head;
    private TextState tail;
    private TextState current;
    private int size;
    private final int MAX_SIZE = 10;

    public void addState(String content) {
        TextState node = new TextState(content);

        if (head == null) {
            head = tail = current = node;
            size = 1;
            return;
        }

        if (current != tail) {
            current.next = null;
            tail = current;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        current = node;
        size++;

        if (size > MAX_SIZE) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        }
    }

    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        }
    }

    public void displayCurrentState() {
        if (current == null) {
            System.out.println("Empty Editor");
            return;
        }
        System.out.println("Current Text: " + current.content);
    }

    public static void main(String[] args) {
        TextEditorUndoRedo editor = new TextEditorUndoRedo();

        editor.addState("H");
        editor.addState("He");
        editor.addState("Hel");
        editor.addState("Hell");
        editor.addState("Hello");

        editor.displayCurrentState();

        editor.undo();
        editor.undo();
        editor.displayCurrentState();

        editor.redo();
        editor.displayCurrentState();

        editor.addState("Hello World");
        editor.displayCurrentState();
    }
}
