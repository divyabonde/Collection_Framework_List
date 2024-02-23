import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        System.out.println("Fruits in the list: ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        int size = fruits.size();
        System.out.println("Size of arraylist: " + size);

        fruits.remove("Banana");
        System.out.println("Fruits after removing Banana: ");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }

        if (fruits.contains("Orange")) {
            System.out.println("The list contains Orange.");
        } else {
            System.out.println("The List does not contains Orange.");
        }

        fruits.clear();
        System.out.println("Fruits after clearing the list: ");
        for (String fruit: fruits) {
            System.out.println(fruit);
        }
    }
}