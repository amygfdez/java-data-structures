public class Main {

    public static void main(String[] args) {
        Heap heap = new Heap(); // Create a new instance of the Heap class.

        // Add some elements to the heap.
        heap.add(20);
        heap.add(15);
        heap.add(30);
        heap.add(40);
        heap.add(10);
        heap.add(60);
        heap.add(25);
        heap.add(5);

        // Print and remove the minimum element until the heap is empty.
        while (heap.length > 0) {
            System.out.println("Minimum element: " + heap.min());
            heap.removeMin();
        }
    }
}
