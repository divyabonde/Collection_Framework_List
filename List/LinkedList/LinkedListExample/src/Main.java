import java.util.LinkedList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("Divya");
        linkedList.add("Madhav");
        linkedList.add("Hitesh");
        linkedList.add("Rani");
        linkedList.add("Parth");

        System.out.println("Names in the List:");
        for (String name : linkedList) {
            System.out.println(name);
        }

        int size = linkedList.size();
        System.out.println("Size of linkedList: " + size);

        linkedList.remove("Parth");
        System.out.println("Names after removing Parth: ");
        for (String name : linkedList) {
            System.out.println(name);
        }

        if (linkedList.contains("Madhav")) {
            System.out.println("The list contains Madhav.");
        } else {
             System.out.println("The list does not contains Madhav.");
        }

        linkedList.clear();
        System.out.println("Names after clearing the list : ");
        for (String name : linkedList) {
            System.out.println(name);
        }
    }
}