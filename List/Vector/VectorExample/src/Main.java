// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        Vector<String> vector = new Vector<>();

        vector.add("Nashik");
        vector.add("Pune");
        vector.add("Jalgaon");
        vector.add("Bhusawal");

        System.out.println("Vector elements: " + vector);

        String elementAtIndex2 = vector.get(2);
        System.out.println("Element at index 2: " + elementAtIndex2);

        vector.remove("Bhusawal");
        System.out.println("Vector after removing Bhusawal: " + vector);

        boolean contain = vector.contains("Pune");
        System.out.println("Does vector contain Pune? " + contain);

        int size = vector.size();
        System.out.println("Size of the Vector: " + size);

        vector.clear();
        System.out.println("Vector after clearing: " + vector);
    }
}