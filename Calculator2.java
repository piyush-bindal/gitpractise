import java.util.Scanner;
public class Calculator2 {
    int a, b;

    // Constructor with parameters
    public Calculator2(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void add() {
        int c = a + b;
        System.out.println("Addition: " + c);
    }

    public void subtract() {
        int d = a - b;
        System.out.println("Subtraction: " + d);
    }

    public void multiply() {
        int e = a * b;
        System.out.println("Multiplication: " + e);
    }

    public void division() {
        if (b != 0) {
            int f = a / b;
            System.out.println("Division: " + f);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        // Option 1: Hardcoded parameters
        // Calculator2 obj = new Calculator2(10, 5);

        // Option 2: Input from user using Scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number (a): ");
        int a = sc.nextInt();
        System.out.print("Enter second number (b): ");
        int b = sc.nextInt();

        Calculator2 obj = new Calculator2(a, b);
        obj.add();
        obj.subtract();
        obj.multiply();
        obj.division();
    }
}
