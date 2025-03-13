package JavaBasics;

public class Salary {
	public static void main(String args[])
	{
		double salary = 0.0;
		int exp = 7;
		String job = "analyst";
		
		if(job == "clerk") {
			if(exp== 1) {
				salary = 5000;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 7000;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 10000;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 14000;
			}else
			if(exp >=15) {
				salary = 20000;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of clerk is :"  +salary);
			
		}//outer for 
		if(job == "manager"){
			if(exp >=0 & exp<=1) {
				salary = 8000;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 12000;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 14000;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 20000;
			}else
			if(exp >=15) {
				salary = 25000;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of manager is :"  +salary);
			
		}
		
		if(job == "salesrep"){
			if(exp >=0 & exp<=1) {
				salary = 6000;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 8000;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 11000;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 13000;
			}else
			if(exp >=15) {
				salary = 18000;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of salesrep is :"  +salary);
			
		}
		if(job == "programmer"){
			if(exp >=0 & exp<=1) {
				salary = 8000;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 9500;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 11600;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 15500;
			}else
			if(exp >=15) {
				salary = 19550;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of programmer is :"  +salary);
			
		}
		if(job == "analyst"){
			if(exp >=0 & exp<=1) {
				salary = 11300;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 14900;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 19600;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 20500;
			}else
			if(exp >=15) {
				salary = 22550;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of analyst is :"  +salary);
			
		}
		if(job == "sales manager"){
			if(exp >=0 & exp<=1) {
				salary = 14000;	
			}else 
			if(exp >=2 & exp <=5) {
				salary = 14900;	
			}else
			if(exp >=6 & exp <=10) {
				salary = 20100;	
			}else
			if(exp >=11 & exp >=14) {
				salary = 20500;
			}else
			if(exp >=15) {
				salary = 22550;
			}else {
				System.out.println("salary not listed");
			}
			System.out.println("salary of sales manager is :"  +salary);
			
		}
		
		
			
	}

}
