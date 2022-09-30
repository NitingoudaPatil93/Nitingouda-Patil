import java.util.Scanner;

class Problem_1 {
  public static void main(String[] args) {

    char operator;
    Double double1, double2, output;

    Scanner scan = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = scan.next().charAt(0);

    System.out.println("Enter first number");
    double1 = scan.nextDouble();

    System.out.println("Enter second number");
    double2 = scan.nextDouble();

    switch (operator) {

      case '+':
    	  output = double1 + double2;
          System.out.println("Addition of two entered number is : "+output);
       break;

      case '-':
    	  output = double1 - double2;
          System.out.println("Subtraction of two entered number is : "+output);
        break;

      case '*':
    	  output = double1 * double2;
          System.out.println("Multiplication of two entered number is : "+output);
        break;

      case '/':
    	  output = double1 / double2;
        System.out.println("Division of two entered number is : "+output);
        break;

      default:
        System.out.println("Please load the proper operator");
        break;
    }

    scan.close();
  }
}