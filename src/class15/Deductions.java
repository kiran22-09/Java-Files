package class15;

public class Deductions extends BasicSalaryCalculator {

	
	public double house_loan;
	public double vehicle_loan;
	public double education_loan;
	
	
	
	public double getHouse_loan() {
		return house_loan;
	}
	public void setHouse_loan(double house_loan) {
		this.house_loan = house_loan;
	}
	
	public double getVehicle_loan() {
		return vehicle_loan;
	}
	public void setVehicle_loan(double vehicle_loan) {
		this.vehicle_loan = vehicle_loan;
	}
	
	public double getEducation_loan() {
		return education_loan;
	}
	public void setEducation_loan(double education_loan) {
		this.education_loan = education_loan;
	}
	
	public double calculateDeductions() {
		
		if(super.getJobID().equalsIgnoreCase("clerk")) {
			
			 if (super.getExperience() == 1) {
				 house_loan = basicSalary * 0.0015;
	             vehicle_loan = basicSalary * 0.025;
	             education_loan = basicSalary * 0.03;

	         }
			 
			 else if (super.getExperience() >=2 & super.getExperience() <= 5) {
				 house_loan = basicSalary * 0.08;
	             vehicle_loan = basicSalary * 0.06;
	             education_loan = basicSalary * 0.06;
			 }
			 
			 else if (super.getExperience() >=6 & super.getExperience() <=10) {
				 house_loan = basicSalary * 0.05;
	             vehicle_loan = basicSalary * 0.06;
	             education_loan = basicSalary * 0.07;
			 }
			 
			 else if (super.getExperience() >=11 & super.getExperience() <= 14) {
				 house_loan = basicSalary * 0.11;
	             vehicle_loan = basicSalary * 0.12;
	             education_loan = basicSalary * 0.12;
			 }
			 
			 else if (super.getExperience() >=15)  {
				 house_loan = basicSalary * 0.16;
	             vehicle_loan = basicSalary * 0.15;
	             education_loan = basicSalary * 0.17;
			 }
			  
			 else {
				 System.out.println("Experience is not in the give limit......So Basic Salary was not calculated");
			 }
	
		}
		
		if(super.getJobID().equalsIgnoreCase("Manager")) {
			
			 if (super.getExperience() == 1) {
				 house_loan = basicSalary * 0.05;
	             vehicle_loan = basicSalary * 0.06;
	             education_loan = basicSalary * 0.08;

	         }
			 
			 else if (super.getExperience() >=2 & super.getExperience() <= 5) {
				 house_loan = basicSalary * 0.12;
	             vehicle_loan = basicSalary * 0.11;
	             education_loan = basicSalary * 0.09;
			 }
			 
			 else if (super.getExperience() >=6 & super.getExperience() <=10) {
				 house_loan = basicSalary * 0.18;
	             vehicle_loan = basicSalary * 0.19;
	             education_loan = basicSalary * 0.17;
			 }
			 
			 else if (super.getExperience() >=11 & super.getExperience() <= 14) {
				 house_loan = basicSalary * 0.19;
	             vehicle_loan = basicSalary * 0.22;
	             education_loan = basicSalary * 0.24;
			 }
			 
			 else if (super.getExperience() >=15)  {
				 house_loan = basicSalary * 0.29;
	             vehicle_loan = basicSalary * 0.33;
	             education_loan = basicSalary * 0.31;
			 }
			  
			 else {
				 System.out.println("Experience is not in the give limit......So Basic Salary was not calculated");
			 }
	
		}
		
		//return total_deductions = this.house_loan + this.vehicle_loan + this.education_loan;
		return this.calculateDeductions();
	
	}

    	public double getTotalDeductions() {
    			return house_loan + vehicle_loan + education_loan;
    		}

}
