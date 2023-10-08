package flower;
import java.util.Scanner;
public class JavaQuestion2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st operand: ");
		int m= Integer.parseInt(sc.nextLine());
		System.out.println("Enter 2nd operand: ");
		int n= Integer.parseInt(sc.nextLine());
		System.out.println("Enter Math operator: ");
		String Operator= sc.nextLine();
		switch(Operator) {
		case "Addition(+)": System.out.println("Addition of m+n is "+(m+n));break;
		case "Substraction(-)": System.out.println("Subtraction of m-n is "+(m-n));break;
		case "Division(/)": System.out.println("Division of m/n is "+(m/n));break;
		case "Modular(%)": System.out.println("Modular of m%n is "+(m%+n));break;
		case "Multiplication(*)": System.out.println("Multiplication of m*n is "+(m*n));break;
		case "Increment Operator(++)": System.out.println("Increment Operator of");break;
		case "Decrement Operator(--)": System.out.println("Decrement Operator of");break;
		default:System.out.println("Wrong Math Operator");
		}
		
		}

	}


