package class15;

public class Allowances extends BasicSalaryCalculator {

    public double medical_allowance;
    public double travel_allowance;
    public double food_allowance;
    
   

    public double getMedical_allowance() {
        return medical_allowance;
    }

    public void setMedical_allowance(double medical_allowance) {
        this.medical_allowance = medical_allowance;
    }

    public double getTravel_allowance() {
        return travel_allowance;
    }

    public void setTravel_allowance(double travel_allowance) {
        this.travel_allowance = travel_allowance;
    }

    public double getFood_allowance() {
        return food_allowance;
    }

    public void setFood_allowance(double food_allowance) {
        this.food_allowance = food_allowance;
    }
    
    public double calculateAllowances(double basicSalary) {
    	
    	//double total_allowances = 0.0;
    	
		
		if(super.getJobID().equalsIgnoreCase("clerk")) {
			
			 if (super.getExperience() == 1) {
				  	this.medical_allowance= basicSalary * 0.03;
	                this.travel_allowance = basicSalary * 0.05;
	                this.medical_allowance = basicSalary * 0.06;

	         }
			 
			 else if (super.getExperience() >=2 & super.getExperience() <= 5) {
				this.medical_allowance = basicSalary * 0.08;
				this.travel_allowance = basicSalary * 0.06;
				this.food_allowance = basicSalary * 0.06;
			 }
			 
			 else if (super.getExperience() >=6 & super.getExperience() <=10) {
				 this.medical_allowance = basicSalary * 0.05;
				 this.travel_allowance = basicSalary * 0.06;
	             this.food_allowance = basicSalary * 0.07;
			 }
			 
			 else if (super.getExperience() >=11 & super.getExperience() <= 14) {
				 this.medical_allowance = basicSalary * 0.11;
				 this.travel_allowance = basicSalary * 0.12;
	             this.food_allowance = basicSalary * 0.12;
			 }
			 
			 else if (super.getExperience() >=15)  {
				 this.medical_allowance = basicSalary * 0.16;
				 this.travel_allowance = basicSalary * 0.15;
	             this.food_allowance = basicSalary * 0.17;
			 }
			  
			 
			 else {
				 System.out.println("Experience is not in the give limit......So Basic Salary was not calculated");
			 }
	
		}
		
		if(super.getJobID().equalsIgnoreCase("Manager")) {
			
			 if (super.getExperience() == 1) {
				  medical_allowance = basicSalary * 0.05;
	                travel_allowance = basicSalary * 0.06;
	                food_allowance = basicSalary * 0.08;

	         }
			 
			 else if (super.getExperience() >=2 & super.getExperience() <= 5) {
				 medical_allowance = basicSalary * 0.12;
	                travel_allowance = basicSalary * 0.11;
	                food_allowance = basicSalary * 0.09;
			 }
			 
			 else if (super.getExperience() >=6 & super.getExperience() <=10) {
				 medical_allowance = basicSalary * 0.18;
	                travel_allowance = basicSalary * 0.19;
	                food_allowance = basicSalary * 0.17;
			 }
			 
			 else if (super.getExperience() >=11 & super.getExperience() <= 14) {
				 medical_allowance = basicSalary * 0.19;
	                travel_allowance = basicSalary * 0.22;
	                food_allowance = basicSalary * 0.24;
			 }
			 
			 else if (super.getExperience() >=15)  {
				 medical_allowance = basicSalary * 0.29;
	                travel_allowance = basicSalary * 0.33;
	                food_allowance = basicSalary * 0.31;
			 }
			  
			 
			 else {
				 System.out.println("Experience is not in the give limit......So Basic Salary was not calculated");
			 }
	
		}
		
		//return  total_allowances = this.medical_allowance + this.travel_allowance + this.food_allowance;
		return this.calculateAllowances();
	}

    public double getTotalAllowances() {
    return this.medical_allowance + this.travel_allowance + this.food_allowance;
}
}

