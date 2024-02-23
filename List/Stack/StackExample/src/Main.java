import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Marathi");
        stack.push("Hindi");
        stack.push("English");
        stack.push("Mathematics");
        stack.push("Science");

        System.out.println("Stack elements: " + stack);

        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack element after popping: " + stack);

        String topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the Stack empty? " + isEmpty);

        int index = stack.search("Hindi");
        if (index != -1) {
            System.out.println("Hindi is present at index: " + index);
        } else {
            System.out.println("Hindi is not present in the index.");
        }
    }
}