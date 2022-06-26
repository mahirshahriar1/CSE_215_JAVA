import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rows: ");
        m = input.nextInt();
        System.out.print("Enter columns: ");
        n = input.nextInt();
      
        int a[][] = new int[m][n];
        int transpose[][] = new int[n][m];
      
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                a[i][j] = input.nextInt();
      
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j) 
                transpose[j][i] = a[i][j];
      
        System.out.println("Transpose : ");
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < m; j++) 
            {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
      /*      for (int i = 0; i < n; i++)
          {
            for (int j = 0; j < m; j++)
              System.out.print(a[j][i] + "\t");
               
            System.out.println();
          }         
           */
        input.close();
    }
}
