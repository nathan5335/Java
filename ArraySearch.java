import java.util.Scanner;

public class ArraySearch {
    
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        
        System.out.print("Enter element to search: ");
        int target = sc.nextInt();
        
        int index = search(arr, target);
        System.out.println(index != -1 ? "Found at position: " + (index + 1) : "Not found");
        
        sc.close();
    }
}
