//10% tax for the first 100000 and 20% for the rest.
import java.util.Scanner;
public class ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your annual income: ");
        double income = input.nextDouble();
       
        double tax = (income <= 100000) ? income * 0.1 : 100000+((income -100000)*0.2);
        System.out.printf("Eligible tax amount is : %,.4f\n", tax);
      
       input.close();
    }
}
