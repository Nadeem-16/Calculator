import java.util.*;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); // Used for User Input
        System.out.print("Enter Your Choice = \n 1.Add \n 2.Substract \n 3.Multiplication \n 4.Divison \n");
        int Cal = sc.nextInt();

        System.out.print("Enter value of a = ");
        int a = sc.nextInt(); 
        System.out.print("Enter value of b = ");
        int b = sc.nextInt();

        switch (Cal) { //Switvh case 
            case 1:
                System.out.println("Addition of two no. is = " + (a + b));
                break;

            case 2:
                System.out.println("Subtraction of two no. is = " + (a - b));
                break;

            case 3:
                System.out.println("Multiplication of two no. is = " + (a * b));
                break;

            case 4:
                System.out.println("Division of two no. is = " + (a / b));
                break;

            default:
                System.out.println("Invalid Selection");
        }
    }
}
