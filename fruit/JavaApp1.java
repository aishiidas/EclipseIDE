package fruit;
import java.util.*;
public class JavaApp1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Enter Employee Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Employee Salary: ");
		double salary =Double.parseDouble(sc.nextLine());
		System.out.println("The Employee id:"+id);
		System.out.println("The Employee name:"+name);
		System.out.println("The Employee salary:"+salary);
		
		

	}

}
