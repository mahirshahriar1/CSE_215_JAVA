
import java.util.Scanner;
class Task01 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = sc.nextInt();
        System.out.println("Enter b : ");
        b = sc.nextInt();
        System.out.println("Enter c : ");
        c = sc.nextInt();
        sc.close();
        int temp = a;
        a = c;
        c = b;
        b = temp;
        System.out.printf("After interchange a = %d, b = %d, c = %d\n", a, b, c);
    }
}
