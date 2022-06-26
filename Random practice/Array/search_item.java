//Code written by Nazmul Alam Diptu (Teacher of Cse215.L)

public class Array01 { 
    public static void main(String[] args) { 
        int size, item, count = 0; 
 
        Scanner sc = new Scanner(System.in); 
 
        System.out.print("Input size of array: "); 
        size = sc.nextInt(); 
        int[] arr = new int[size]; 
 
        System.out.print("Input elements in array: "); 
        for (int i = 0; i < arr.length; i++) { 
            arr[i] = sc.nextInt(); 
        } 
 
        System.out.println("Element to search?"); 
        item = sc.nextInt(); 
        sc.close(); 
 
        for (int i = 0; i < arr.length; i++) { 
            if (arr[i] == item) 
                count++; 
 
        } 
 
        if (count > 0) 
            System.out.println("Element found " + count + " times."); 
        else 
            System.out.println("Element not found."); 
    } 
 
} 
 
