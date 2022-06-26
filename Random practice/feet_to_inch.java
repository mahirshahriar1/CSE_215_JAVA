import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      
        System.out.println("First person:");
        System.out.println("Enter feet:");
        int feet1 = input.nextInt();      
        System.out.println("Enter inch:");
        int inch1 = input.nextInt();
      
        System.out.println("Enter feet:");
        int feet2 = input.nextInt();
        System.out.println("Enter inch:");
        int inch2 = input.nextInt();
    
        int total1 = f1*12 + i1;
        int total2 = f2*12 + i2;
        int difference = (total1 > total2) ? total1 - total2 : total2 - total1;
        
        System.out.println("Difference: "+difference/12+ " feet "+difference%12+" inch.");
        input.close();
    }
}
