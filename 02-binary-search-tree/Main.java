import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Create a new BinarySearchTree instance
        BinarySearchTree bst = new BinarySearchTree();

        // Insert random numbers
        Random rand = new Random();
        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(100);  // Generate numbers between 0 and 99
            bst.add(num);
            System.out.println("Inserted: " + num);
        }

        // Display tree
        System.out.print("\nTree elements: ");
        bst.display();

        // Check for the existence of a random number
        int checkNum = rand.nextInt(100);
        System.out.println("\nContains " + checkNum + "? " + bst.contains(checkNum));
    }
}
