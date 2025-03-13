package Class21;

public class BasicSalaryCalculator extends Employees {
	
	public BasicSalaryCalculator(String regionID, String regionName, String countryID, String countryName,
			String locationID, String city, String deptID, String deptName, String empID, String fname, String lname, int experience, String jobID) {
		super(regionID, regionName, countryID, countryName, locationID, city, deptID, deptName, empID, fname, lname, experience,jobID);
		// TODO Auto-generated constructor stub
	}


	//instance variable
	public double basicSalary;


	
	
	public double calculateBasicSalary() {
		
		//outer IF
		if(jobID.equalsIgnoreCase("clerk")) {
			if(experience == 1) {
				this.basicSalary = 5000;
				
			}else
			if(experience >= 2 & experience <= 5) {
				this.basicSalary = 7000;	
			}
			else
			if(experience >= 6 & experience <= 10) {
				this.basicSalary = 10000;	
			}
			else
			if(experience >= 11 & experience <= 14) {
				this.basicSalary = 14000;	
			}else
			if(experience >= 15) {
				this.basicSalary = 20000;	
			}else {
				System.out.println("experience did not match ...........NO BASIC SALARY");
			}
			
		}
		
		if(jobID.equalsIgnoreCase("manager")) {
			if(experience == 1) {
				this.basicSalary = 8000;
				
			}else
			if(experience >= 2 & experience <= 5) {
				this.basicSalary = 12000;	
			}
			else
			if(experience >= 6 & experience <= 10) {
				this.basicSalary = 14000;	
			}
			else
			if(experience >= 11 & experience <= 14) {
				this.basicSalary = 20000;	
			}else
			if(experience >= 15) {
				this.basicSalary = 25000;	
			}else {
				System.out.println("experience did not match ...........NO BASIC SALARY");
			}
			
		}
		
		if(jobID.equalsIgnoreCase("salesrep")) {
			if(experience == 1) {
				this.basicSalary = 6000;
				
			}else
			if(experience >= 2 & experience <= 5) {
				this.basicSalary = 8000;	
			}
			else
			if(experience >= 6 & experience <= 10) {
				this.basicSalary = 11000;	
			}
			else
			if(experience >= 11 & experience <= 14) {
				this.basicSalary = 13000;	
			}else
			if(experience >= 15) {
				this.basicSalary = 18000;	
			}else {
				System.out.println("experience did not match ...........NO BASIC SALARY");
			}
			
		}
		
		if(jobID.equalsIgnoreCase("programmar")) {
			if(experience == 1) {
				this.basicSalary = 8000;
				
			}else
			if(experience >= 2 & experience <= 5) {
				this.basicSalary = 9500;	
			}
			else
			if(experience >= 6 & experience <= 10) {
				this.basicSalary = 11600;	
			}
			else
			if(experience >= 11 & experience <= 14) {
				this.basicSalary = 15500;	
			}else
			if(experience >= 15) {
				this.basicSalary = 19550;	
			}else {
				System.out.println("experience did not match ...........NO BASIC SALARY");
			}
			
		}
		

		if(jobID.equalsIgnoreCase("salesmanager")) {
			if(experience == 1) {
				this.basicSalary = 11400;
				
			}else
			if(experience >= 2 & experience <= 5) {
				this.basicSalary = 14900;	
			}
			else
			if(experience >= 6 & experience <= 10) {
				this.basicSalary = 20100;	
			}
			else
			if(experience >= 11 & experience <= 14) {
				this.basicSalary = 20500;	
			}else
			if(experience >= 15) {
				this.basicSalary = 22550;	
			}else {
				System.out.println("experience did not match ...........NO BASIC SALARY");
			}
			
		}

		
		return this.basicSalary;
	}
}