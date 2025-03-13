package Class19;

public class BasicSalaryCalculator extends Employees {
	
	public BasicSalaryCalculator(String regionID, String regionName, String countryID, String countryName,
			String locationID, String city, String deptID, String deptName) {
		super(regionID, regionName, countryID, countryName, locationID, city, deptID, deptName);
		// TODO Auto-generated constructor stub
	}


	//instance variable
	public double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	
	public double calculateBasicSalary() {
		
		//outer IF
		if(super.getJobID().equalsIgnoreCase("clerk")) {
			if(super.getExperience() == 1) {
				this.basicSalary = 5000;
				
			}else
			if(super.getExperience() >= 2 & super.getExperience() <= 5) {
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
		
		if(super.getJobID().equalsIgnoreCase("manager")) {
			if(super.getExperience() == 1) {
				this.basicSalary = 8000;
				
			}else
			if(super.getExperience() >= 2 & super.getExperience() <= 5) {
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
		
		if(super.getJobID().equalsIgnoreCase("salesrep")) {
			if(super.getExperience() == 1) {
				this.basicSalary = 6000;
				
			}else
			if(super.getExperience() >= 2 & super.getExperience() <= 5) {
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
		
		if(super.getJobID().equalsIgnoreCase("programmar")) {
			if(super.getExperience() == 1) {
				this.basicSalary = 8000;
				
			}else
			if(super.getExperience() >= 2 & super.getExperience() <= 5) {
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
		

		if(super.getJobID().equalsIgnoreCase("salesmanager")) {
			if(super.getExperience() == 1) {
				this.basicSalary = 11400;
				
			}else
			if(super.getExperience() >= 2 & super.getExperience() <= 5) {
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