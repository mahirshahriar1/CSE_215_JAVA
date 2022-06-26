import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("N = ");
        N = input.nextInt();
      
        int a[][] = new int[N][N];
      
        for (int i = 0; i < N; i++)
            for (int j = 0; j < N; j++)
                a[i][j] = sc.nextInt();
      
        input.close();
        int sum = 0;
        for (int i = 0; i < N; i++)
        {
            for (int j = 0; j < N; j++)
            {
              if(i==j)
                sum += a[i][j];
            }          
        }
      /*for (int i = 0; i < N; i++)
            sum += a[i][i];*/ //alternative
        
        System.out.println(sum);
    }
}
