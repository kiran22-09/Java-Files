/*package class15;

public class BasicSalaryCalculator extends  FullTimeEmployees{
	
	public double basicSalary;

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	
	public double calculateBasicSalary() {
	
	if (super.getJobID() == null) {
            System.out.println("Job ID is not set. Basic Salary cannot be calculated.");
            return 0;
        }
		
		if(super.getJobID().equalsIgnoreCase("clerk")) {
			
			 if (super.getExperience() == 1) {
	             this.basicSalary = 5000;
	         }
			 
			 else if (super.getExperience() >=2 & super.getExperience() <= 5) {
				 this.basicSalary = 7000;
			 }
			 
			 else if (super.getExperience() >=6 & super.getExperience() <=10) {
				 this.basicSalary = 10000;
			 }
			 
			 else if (super.getExperience() >=11 & super.getExperience() <= 14) {
				 this.basicSalary = 14000;
			 }
			 
			 else if (super.getExperience() >=15)  {
				 this.basicSalary = 20000;
			 }
			  
			 else {
				 System.out.println("Experience is not in the give limit......So Basic Salary was not calculated");
			 }
	

		}
		return this.basicSalary;
	}
	
	
		
	
		
} 
*/

package class15;

public class BasicSalaryCalculator extends FullTimeEmployees {
    public double basicSalary;
    
    public double medical_allowance;
    public double travel_allowance;
    public double food_allowance;
    
    public double house_loan;
	public double vehicle_loan;
	public double education_loan;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double calculateBasicSalary() {
        if (super.getJobID() == null) {
            System.out.println("Job ID is not set. Basic Salary cannot be calculated.");
            return 0;
        }

        if (super.getJobID().equalsIgnoreCase("clerk")) {
            if (super.getExperience() == 1) {
                this.basicSalary = 5000;
            } else if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                this.basicSalary = 7000;
            } else if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                this.basicSalary = 10000;
            } else if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                this.basicSalary = 14000;
            } else if (super.getExperience() >= 15) {
                this.basicSalary = 20000;
            } else {
                System.out.println("Experience is not within the limit. Basic Salary not calculated.");
            }
        }
        
        if (super.getJobID().equalsIgnoreCase("manager")) {
            if (super.getExperience() == 1) {
                this.basicSalary = 8000;
            } else if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                this.basicSalary = 12000;
            } else if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                this.basicSalary = 14000;
            } else if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                this.basicSalary = 20000;
            } else if (super.getExperience() >= 15) {
                this.basicSalary = 25000;
            } else {
                System.out.println("Experience is not within the limit. Basic Salary not calculated.");
            }
        }
        return this.basicSalary;
    }

    public double calculateAllowances() {
        if (super.getJobID() == null) {
            System.out.println("Job ID is not set. Allowances cannot be calculated.");
            return 0;
        }

        if (super.getJobID().equalsIgnoreCase("clerk")) {
            if (super.getExperience() == 1) {
                medical_allowance = basicSalary * 0.03;
                travel_allowance = basicSalary * 0.05;
                food_allowance = basicSalary * 0.06;
            } else if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                medical_allowance = basicSalary * 0.08;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.06;
            } else if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                medical_allowance = basicSalary * 0.05;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.07;
            } else if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                medical_allowance = basicSalary * 0.11;
                travel_allowance = basicSalary * 0.12;
                food_allowance = basicSalary * 0.12;
            } else if (super.getExperience() >= 15) {
                medical_allowance = basicSalary * 0.16;
                travel_allowance = basicSalary * 0.15;
                food_allowance = basicSalary * 0.17;
            }
        } 
        
        else if (super.getJobID().equalsIgnoreCase("Manager")) {
            if (super.getExperience() == 1) {
                medical_allowance = basicSalary * 0.05;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.08;
            } else if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                medical_allowance = basicSalary * 0.12;
                travel_allowance = basicSalary * 0.11;
                food_allowance = basicSalary * 0.09;
            } else if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                medical_allowance = basicSalary * 0.18;
                travel_allowance = basicSalary * 0.19;
                food_allowance = basicSalary * 0.17;
            } else if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                medical_allowance = basicSalary * 0.19;
                travel_allowance = basicSalary * 0.22;
                food_allowance = basicSalary * 0.24;
            } else if (super.getExperience() >= 15) {
                medical_allowance = basicSalary * 0.29;
                travel_allowance = basicSalary * 0.33;
                food_allowance = basicSalary * 0.31;
            }
        }
        
        return medical_allowance + travel_allowance + food_allowance;
        
    }
        
        
        public double calculateDeductions() {
            if (super.getJobID() == null) {
                System.out.println("Job ID is not set. Deductions cannot be calculated.");
                return 0;
            }

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
        }
        return house_loan + vehicle_loan + education_loan;
    }
    
    
}
