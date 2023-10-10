import java.util.Scanner;

public class SimpleCalculatorApplication {
    public static void main(String[] args) {
        int a, b, ch, out = 0;
        String i;
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            System.out.print("Enter first number : ");
            a = sc.nextInt();
            System.out.print("Enter second number : ");
            b = sc.nextInt();
            System.out.println("****** MENU ******");
            System.out.println("1) Addition\n2) Subtraction\n3) Multiplication\n4) Division");
            System.out.print("Enter a choice : ");
            ch = sc.nextInt();
            
            switch (ch) {
                case 1:
                    out = a + b;
                    break;
                case 2:
                    out = a - b;
                    break;
                case 3:
                    out = a * b;
                    break;
                case 4:
                    if (b != 0) {
                        out = a / b;
                    } else {
                        System.out.println("Error: Division by zero");
                    }
                    break;
                default:
                    System.exit(1);
                    break;
            }
            
            System.out.println("Result is : " + out);
            System.out.print("Do you want to continue? (y/n) : ");
            i = sc.next();
            
            if (i.equals("n"))
                break;
        }
        sc.close();
    }
}
