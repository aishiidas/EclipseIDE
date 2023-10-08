package org.anudip.lab;
import java.util.Scanner;
public class BillMain {
    public static void main(String[] args) {
    	Scanner scanner=new Scanner(System.in);
		//Accept the number of consumers
		System.out.println("Enter the number of consumers: ");
		int number=Integer.parseInt(scanner.nextLine());
		//number is negative or 0 then display Invalid
		if(number<=0) {
			System.out.println("Invalid Input");
		}else {
			//create Consumer class type array
		Consumer [] consumerArray=new Consumer[number];
		for(int i=0;i<number;i++) {
			//accepting details of each customer
			System.out.println("Enter details of consumer number "+(i+1)+" : ");
			String consumerDetails =scanner.nextLine();
			String []arr=consumerDetails.split(",");
			int unitConsumed=Integer.parseInt(arr[2]);
			Consumer consumer =new Consumer(arr[0],arr[1],unitConsumed);
			//Call billCalculation() method of BillService class to calculate finalPayment
			String finalPayment=BillService.billCalculation(consumer);
			consumer.setFinalPayment(finalPayment);
			consumerArray[i]=consumer;
			
		}
		//Display each consumer's id,name,unit consumed and amount payable
		for(Consumer con:consumerArray) {
			System.out.println(con);
		}
	  }

    }//end of main
}//end of class
