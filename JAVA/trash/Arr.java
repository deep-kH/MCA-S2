import java.util.*;

public class Arr {
    public static void main(String args[]) {
        Scanner mine = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = mine.nextInt();
        int[] arr1 = new int[size];
        System.out.println("Array parayu : ");
        for (int i = 0; i < size; i++) {
            arr1[i] = mine.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(i + "th element is : " + arr1[i]);
        }
        System.out.println("The length of your array is : " + arr1.length);
        mine.close();
    }
}
