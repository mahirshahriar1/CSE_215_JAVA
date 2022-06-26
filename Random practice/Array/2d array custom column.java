// In this code, we take a 2d array and make fixed rows but for each row, different columns.
public class Array02 { 
    public static void main(String[] args) { 
        int row; 
        double[][] arr; 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter length of row : "); 
        row = sc.nextInt(); 
        arr = new double[row][]; 
        for (int i = 0; i < arr.length; i++) { 
            System.out.print("Enter cloumn length of row " + (i + 1) + " : "); 
            int j = sc.nextInt(); 
            arr[i] = new double[j]; // for row i, declaring an array of size j which is a column
        } 
 
        for (double[] ds : arr) { //we use for each because we dont know the size of column for each row
            
            System.out.print("Enter value of row " + j + " : "); 
            for (int i = 0; i < ds.length; i++) { 
 
                ds[i] = sc.nextDouble(); //using for each and for loop can change array values.
            } 
        } 
 
        sc.close(); 
 
        System.out.println("Array : "); 
        for (double[] ds : arr) { 
            
            for (int i = 0; i < ds.length; i++) { 
 
                System.out.print(ds[i] + "\t"); 
            } 
            System.out.println(); 
        } 
 
    } 
} 
