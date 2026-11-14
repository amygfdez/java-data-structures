public class Main {

    public static void main(String args[]) {
        new Main();
    }

    public Main() {
        int size = 10;
        int[] a = new int[size];

        fillArray(a);
        printArray(a);
        insertionSort(a);
        printArray(a);
    }

    public static void fillArray(int[] list) {
        for (int i = 0; i < list.length; i++) {
            list[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public static void printArray(int[] list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void insertionSort(int[] list) {
        for (int i = 1; i < list.length; i++) {
            int temp = list[i];
            int j = i - 1;
            while (j >= 0 && temp < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = temp;
        }
    }

    public static void listMerge(int[] list1, int[] list2, int[] list3) {
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        while (p1 != list1.length && p2 != list2.length) {
            if (list1[p1] < list2[p2]) {
                list3[p3] = list1[p1];
                p1++;
            } else {
                list3[p3] = list2[p2];
                p2++;
            }
            p3++;
        }
        while (p1 != list1.length) {
            list3[p3] = list1[p1];
            p1++;
            p3++;
        }
        while (p2 != list2.length) {
            list3[p3] = list2[p2];
            p2++;
            p3++;
        }
    }
}
