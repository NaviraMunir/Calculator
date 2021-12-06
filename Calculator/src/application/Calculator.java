package application;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

class Calculator{
	Calculator(){
		
	}
	//code from https://www.programiz.com/java-programming/examples/calculator-switch-case
	double simplecalculator(double number1,double number2, String operator)
	{
		double result=0;
		
		switch (operator) {
	      case "+":
	        result = number1 + number2;
	        break;
	      case "-":
	        result = number1 - number2;
	        break;
	      case "*":
	        result = number1 * number2;
	        break;
	      case "/":
	        result = number1 / number2;
	        break;
	    }
		return result;
	 }
		
	double CalculateBmi(double w,double h)
	{
		double bmi=0;
		double height = h*h;
		bmi=w/height;
		return bmi;
	}
	//code from https://www.geeksforgeeks.org/program-calculate-age/
	int[] CalculateAge(int current_date, int current_month,
            int current_year, int birth_date,
            int birth_month, int birth_year)
	{
		// days of every month
	    int month[] = { 31, 28, 31, 30, 31, 30, 31,
	                          31, 30, 31, 30, 31 };
	    if (birth_date > current_date) {
	        current_date = current_date + month[birth_month - 1];
	        current_month = current_month - 1;
	    }
	 
	    if (birth_month > current_month) {
	        current_year = current_year - 1;
	        current_month = current_month + 12;
	    }
	 
	    int calculated_date = current_date - birth_date;
	    int calculated_month = current_month - birth_month;
	    int calculated_year = current_year - birth_year;
	    
		int[] agearray;
		agearray=new int[3];
		agearray[0]=calculated_date;
		agearray[1]=calculated_month;
		agearray[2]=calculated_year;
		return agearray;
		
	}
	double CalculateDiscount(double orgprice,double discount2)
	{
		double discount=(discount2/100)*orgprice;
		return discount;
	}
	public static double converttopkr(String curr,String value)
	{
	    double usd=(double) 0.0057;
    	double eur=(double) 0.005;
    	double inr=(double) 0.4259;
    	double sar=(double) 0.0212;
		if(curr.equals("PKR"))
			return Float.parseFloat(value);
		else if(curr.equals("USD"))
			return (double) (Float.parseFloat(value)*usd);
		else if(curr.equals("EUR"))
			return (double) (Float.parseFloat(value)*eur);
		else if(curr.equals("INR"))
			return (double) (Float.parseFloat(value)*inr);
		else return (double) (Float.parseFloat(value)*sar);
		
	}
	
	public static double getexchangerate(String curr,double value)
	{
	    double usd=(double) 0.0057;
    	double eur=(double) 0.005;
    	double inr=(double) 0.4259;
    	double sar=(double) 0.0212;
		if(curr.equals("PKR"))
			return value;
		else if(curr.equals("USD"))
			return (double) (value/usd);
		else if(curr.equals("EUR"))
			return (double) (value/eur);
		else if(curr.equals("INR"))
			return (double) (value/inr);
		else return (double) (value/sar);
		
	}
	// From previous assignments
	public static String convertcurrency(String from, String to, String value)
	{
		double answ=converttopkr(to,value);
		double fin_anwer=getexchangerate(from,answ);
		String str=fin_anwer+"";
		return str;
	}
	static double calculateinvestment(double amount,double interest,int y)
	{
		double f=amount*Math.pow((1+interest/100),y);
		return f;
	}
	public static void main(String[] args) throws IOException {
		
	    
	}
}