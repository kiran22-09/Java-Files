package JavaBasics;

public class SalaryCalculator {
	
	public double basic_Salary (int exp, String job) {
		
	double salary = 9999;
	
	if(job == "Clerk") {
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
		System.out.println("salary of clerk..........."+salary);
	}	
	
	if(job == "Manager") {
		if(exp >=0 & exp<=1) {
			salary = 8000;	
		}else 
		if(exp >=2 & exp <=5) {
			salary = 7000;	
		}else
		if(exp >=6 & exp <=10) {
			salary = 12000;	
		}else
		if(exp >=11 & exp >=14) {
			salary = 14000;
		}else
		if(exp >=15) {
			salary = 20000;
		}else {
			System.out.println("salary not listed");
		}
		System.out.println("salary of manager ..........."+salary);
	}	
	
	if(job == "Salesrep") {
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
		System.out.println("salary of salesrep ..........."+salary);
	}
	
	if(job == "Programmar") {
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
		System.out.println("salary of programmar ..........."+salary);
	}
		
	if(job == "Analyst") {
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
		System.out.println("salary of Analyst ..........."+salary);
	}
	
	if(job == "Salesmanager") {
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
		System.out.println("salary of salesmanager ..........."+salary);
	}
	
	return salary;
	}	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int exp= 10;
		String job ="Programmar";
		
		SalaryCalculator obj = new SalaryCalculator();
		double salary = obj.basic_Salary(exp, job);
		System.out.println("salary of "+job+ ": " +salary);

	}

}
