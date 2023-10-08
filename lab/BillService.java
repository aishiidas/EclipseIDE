package org.anudip.lab;

import java.text.DecimalFormat;

public class BillService {
	//Calculate consumers bill
    public static String billCalculation(Consumer consumer) {
    	//use for decimal formatting
    	DecimalFormat decfor=new DecimalFormat("0.00");
    	//Get the value of unitConsumed
    	int unitConsumed =consumer.getUnitConsumed();
    	String finalPayment="";
    	double flatAmount=0.0;
    	
    	if(unitConsumed<=200) {
    		flatAmount=300;
    		finalPayment=decfor.format(flatAmount);	
    	}
    	else if(unitConsumed<=500){
    		flatAmount=300+(unitConsumed-200)*1.25;
    		finalPayment=decfor.format(flatAmount);	
    	}
    	else if(unitConsumed<=1000) {
    		flatAmount=300+(300*1.25)+(unitConsumed-500)*1.00;
            finalPayment=decfor.format(flatAmount);	
    	}
    	else{
    		flatAmount=300+300*1.25+500*1.00+(unitConsumed-1000)*0.75;
            finalPayment=decfor.format(flatAmount);	
    	}
    	
    	return finalPayment;
    }
}//end of class
