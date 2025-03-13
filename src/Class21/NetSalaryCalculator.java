package Class21;

public class NetSalaryCalculator extends BasicSalaryCalculator implements Allowances, Deductions, LossOfPay{
	
	private double total_allowances;
	private double total_deductions;

	public NetSalaryCalculator(String regionID, String regionName, String countryID, String countryName,
			String locationID, String city, String deptID, String deptName, String empID, String fname, String lname,
			int experience, String jobID) {
		super(regionID, regionName, countryID, countryName, locationID, city, deptID, deptName, empID, fname, lname, experience,
				jobID);
		// TODO Auto-generated constructor stub
		
		System.out.println("Inside NetSaalry Calculator using Constructors without getters and setters");
	}
	
	public double calculateAllowances() {
        double medical_allowance = 0.0;
        double travel_allowance = 0.0;
        double food_allowance = 0.0;
        
        if (jobID.equalsIgnoreCase("clerk")) {
            System.out.println("Inside jobID clerk");
            if (experience == 1) {
                medical_allowance = basicSalary * 0.03;
                travel_allowance = basicSalary * 0.05;
                food_allowance = basicSalary * 0.06;
            } 
            if (experience >= 2 && experience <= 5) {
                medical_allowance = basicSalary * 0.08;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.06;
            }
            if (experience >= 6 && experience <= 10) {
                medical_allowance = basicSalary * 0.08;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.06;
            }
            if (experience >= 11 && experience <= 14) {
                medical_allowance = basicSalary * 0.08;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.06;
            }
            if (experience >= 15) {
                medical_allowance = basicSalary * 0.03;
                travel_allowance = basicSalary * 0.05;
                food_allowance = basicSalary * 0.06;
            }
        } 
        
        if (jobID.equalsIgnoreCase("manager")) {
            System.out.println("Inside jobID manager");
            if (experience == 1) {
                medical_allowance = basicSalary * 0.05;
                travel_allowance = basicSalary * 0.06;
                food_allowance = basicSalary * 0.08;
            }
            if (experience >= 2 && experience <= 5) {
                medical_allowance = basicSalary * 0.12;
                travel_allowance = basicSalary * 0.11;
                food_allowance = basicSalary * 0.09;
            } 
            if (experience >= 6 && experience <= 10) {
                medical_allowance = basicSalary * 0.18;
                travel_allowance = basicSalary * 0.19;
                food_allowance = basicSalary * 0.17;
            } 
            if (experience >= 11 && experience <= 14) {
                medical_allowance = basicSalary * 0.19;
                travel_allowance = basicSalary * 0.22;
                food_allowance = basicSalary * 0.24;
            } 
            if (experience >= 15) {
                medical_allowance = basicSalary * 0.29;
                travel_allowance = basicSalary * 0.33;
                food_allowance = basicSalary * 0.31;
            }
        }
        
        if(jobID.equalsIgnoreCase("salesrep")) {
        	System.out.println("Inside jobID salesrep");
			if(experience==1) {
				medical_allowance = basicSalary*0.11;
				travel_allowance = basicSalary*0.12;
				food_allowance = basicSalary*0.12;
				
					
			}
			if(experience >=2 & experience <=5) {
				
				medical_allowance = basicSalary*0.13;
				travel_allowance = basicSalary*0.12;
				food_allowance = basicSalary*0.14;
				
				
			}
			if(experience >=6 & experience <=10) {
				
				medical_allowance = basicSalary*0.21;
				travel_allowance = basicSalary*0.11;
				food_allowance = basicSalary*0.22;
				
				
			}
			if(experience >=11 & experience <=14) {
				
				medical_allowance = basicSalary*0.23;
				travel_allowance = basicSalary*0.22;
				food_allowance = basicSalary*0.21;
				
				
			}
			if(experience >=15) {
				
				medical_allowance = basicSalary*0.29;
				travel_allowance = basicSalary*0.28;
				food_allowance = basicSalary*0.27;
				
				
			}
        }
        
        if(jobID.equalsIgnoreCase("Programmar")) {
        	System.out.println("Inside jobID programmar");

        
			if(experience == 1) {
				
				medical_allowance = basicSalary*0.10;
				travel_allowance = basicSalary*0.12;
				food_allowance = basicSalary*0.12;
				
			
					
			} 
			if(experience >=2 & experience <=5) {
				
				medical_allowance = basicSalary*0.11;
				travel_allowance = basicSalary*0.11;
				food_allowance = basicSalary*0.11;
				
				
			}
			if(experience >=6 & experience <=10) {
				
				medical_allowance = basicSalary*0.12;
				travel_allowance = basicSalary*0.11;
				food_allowance = basicSalary*0.13;
				
				
			}
			if(experience >=11 & experience <=14) {
				
				medical_allowance = basicSalary*0.13;
				travel_allowance = basicSalary*0.22;
				food_allowance = basicSalary*0.21;
				
				
			}
			if(experience >=15) {
				
				medical_allowance = basicSalary*0.22;
				travel_allowance = basicSalary*0.28;
				food_allowance = basicSalary*0.27;
				
				
			}
        }
        
        
        if(jobID.equalsIgnoreCase("analyst")) {
        	System.out.println("Inside jobID analyst");
			if(experience == 1) {
				
				medical_allowance = basicSalary*0.10;
				travel_allowance = basicSalary*0.12;
				food_allowance = basicSalary*0.12;
				
				
					
			} 
			if(experience >=2 & experience <=5) {
				
				medical_allowance = basicSalary*0.11;
				travel_allowance = basicSalary*0.11;
				food_allowance = basicSalary*0.11;
				
				
			}
			if(experience >=6 & experience <=10) {
			
				medical_allowance = basicSalary*0.12;
				travel_allowance = basicSalary*0.11;
				food_allowance = basicSalary*0.13;
				
				
			}
			if(experience >=11 & experience <=14) {
				
				medical_allowance = basicSalary*0.13;
				travel_allowance = basicSalary*0.22;
				food_allowance = basicSalary*0.21;
				
				
			}
			if(experience >=15) {
				
				medical_allowance = basicSalary*0.22;
				travel_allowance = basicSalary*0.28;
				food_allowance = basicSalary*0.27;
				
				
			}
        }
        
        
        
        if(jobID.equalsIgnoreCase("salesmanager")) {
        	System.out.println("Inside jobID Salesmanager");
        	
			if(experience == 1) {
				
				medical_allowance = basicSalary*0.12;
				travel_allowance = basicSalary*0.12;
				food_allowance = basicSalary*0.12;
				
				
					
			} 
			if(experience  >=2 & experience  <=5) {
				
				medical_allowance = basicSalary*0.18;
				travel_allowance = basicSalary*0.19;
				food_allowance = basicSalary*0.11;
				
				
			}
			if(experience  >=6 & experience  <=10) {
				
				medical_allowance = basicSalary*0.16;
				travel_allowance = basicSalary*0.17;
				food_allowance = basicSalary*0.15;
				
				
			}
			if(experience  >=11 & experience <=14) {
				
				medical_allowance = basicSalary*0.19;
				travel_allowance = basicSalary*0.22;
				food_allowance = basicSalary*0.21;
				
				
			}
			if(experience >=15) {
				
				medical_allowance = basicSalary*0.29;
				travel_allowance = basicSalary*0.33;
				food_allowance = basicSalary*0.38;
				
				
			}
        }
        
        this.total_allowances = medical_allowance + travel_allowance + food_allowance;
        System.out.println("total_allowances ..........."+this.total_allowances);
        return total_allowances;
    }
    

    public double calculateDeductions() {
        double house_loan = 0.0;
        double vehicle_loan = 0.0;
        double education_loan = 0.0;
        
        if (jobID.equalsIgnoreCase("clerk")) {
            System.out.println("Inside jobID clerk");
            if (experience == 1) {
                house_loan = basicSalary * 0.0015;
                vehicle_loan = basicSalary * 0.025;
                education_loan = basicSalary * 0.03;
                
            } else if (experience >= 2 && experience <= 5) {
                house_loan = basicSalary * 0.08;
                vehicle_loan = basicSalary * 0.06;
                education_loan = basicSalary * 0.06;
                
            } else if (experience >= 6 && experience <= 10) {
                house_loan = basicSalary * 0.05;
                vehicle_loan = basicSalary * 0.06;
                education_loan = basicSalary * 0.07;
            } else if (experience >= 11 && experience <= 14) {
                house_loan = basicSalary * 0.11;
                vehicle_loan = basicSalary * 0.12;
                education_loan = basicSalary * 0.12;
            } else if (experience>= 15) {
                house_loan = basicSalary * 0.16;
                vehicle_loan = basicSalary * 0.15;
                education_loan = basicSalary * 0.17;
            }
        } 
        
        if (jobID.equalsIgnoreCase("manager")) {
            System.out.println("Inside jobID manager");
            if (experience == 1) {
                house_loan = basicSalary * 0.05;
                vehicle_loan = basicSalary * 0.06;
                education_loan = basicSalary * 0.08;
            }
            if (experience >= 2 && experience <= 5) {
                house_loan = basicSalary * 0.12;
                vehicle_loan = basicSalary * 0.11;
                education_loan = basicSalary * 0.09;
            } 
            if (experience >= 6 && experience <= 10) {
                house_loan = basicSalary * 0.18;
                vehicle_loan = basicSalary * 0.19;
                education_loan = basicSalary * 0.17;
            } 
            if (experience >= 11 && experience <= 14) {
                house_loan = basicSalary * 0.19;
                vehicle_loan = basicSalary * 0.22;
                education_loan = basicSalary * 0.24;
            }
            if (experience >= 15) {
                house_loan = basicSalary * 0.29;
                vehicle_loan = basicSalary * 0.33;
                education_loan = basicSalary * 0.31;
            }
        }
        
        if (jobID.equalsIgnoreCase("salesrep")) {
            System.out.println("Inside jobID salesrep");
            if (experience == 1) {
            	house_loan = basicSalary*0.11;
				vehicle_loan = basicSalary*0.12;
				education_loan = basicSalary*0.12;
            }
            if (experience >= 2 && experience <= 5) {
            	house_loan = basicSalary*0.13;
				vehicle_loan = basicSalary*0.12;
				education_loan = basicSalary*0.14;
            } 
            if (experience >= 6 && experience <= 10) {
                house_loan = basicSalary * 0.18;
                vehicle_loan = basicSalary * 0.19;
                education_loan = basicSalary * 0.17;
            } 
            if (experience >= 11 && experience <= 14) {
            	house_loan = basicSalary*0.23;
				vehicle_loan = basicSalary*0.22;
				education_loan = basicSalary*0.21;
            }
            if (experience >= 15) {
            	house_loan = basicSalary*0.29;
				vehicle_loan = basicSalary*0.28;
				education_loan = basicSalary*0.27;
            }
        }
        
        
        if (jobID.equalsIgnoreCase("programmar")) {
            System.out.println("Inside jobID programmar");
            if (experience == 1) {
            	house_loan = basicSalary*0.10;
				vehicle_loan = basicSalary*0.12;
				education_loan = basicSalary*0.12;
            }
            if (experience >= 2 && experience <= 5) {
            	house_loan = basicSalary*0.11;
				vehicle_loan = basicSalary*0.11;
				education_loan = basicSalary*0.11;
            } 
            if (experience >= 6 && experience <= 10) {
            	house_loan = basicSalary*0.12;
				vehicle_loan = basicSalary*0.11;
				education_loan = basicSalary*0.13;
            } 
            if (experience >= 11 && experience <= 14) {
            	house_loan = basicSalary*0.13;
				vehicle_loan = basicSalary*0.22;
				education_loan = basicSalary*0.21;
            }
            if (experience >= 15) {
            	house_loan = basicSalary*0.22;
				vehicle_loan = basicSalary*0.28;
				education_loan = basicSalary*0.27;
            }
        }
        
        
        
        if (jobID.equalsIgnoreCase("analyst")) {
            System.out.println("Inside jobID analyst");
            if (experience == 1) {
            	house_loan = basicSalary*0.10;
				vehicle_loan = basicSalary*0.12;
				education_loan = basicSalary*0.12;
            }
            if (experience >= 2 && experience <= 5) {
            	house_loan = basicSalary*0.11;
				vehicle_loan = basicSalary*0.11;
				education_loan = basicSalary*0.11;
            } 
            if (experience >= 6 && experience <= 10) {
            	house_loan = basicSalary*0.12;
				vehicle_loan = basicSalary*0.11;
				education_loan = basicSalary*0.13;
            } 
            if (experience >= 11 && experience <= 14) {
            	house_loan = basicSalary*0.13;
				vehicle_loan = basicSalary*0.22;
				education_loan = basicSalary*0.21;
            }
            if (experience >= 15) {
            	house_loan = basicSalary*0.22;
				vehicle_loan = basicSalary*0.28;
				education_loan = basicSalary*0.27;
            }
        }
        
        
        
        if (jobID.equalsIgnoreCase("salaesmanager")) {
            System.out.println("Inside jobID salaesmanager");
            if (experience == 1) {
            	house_loan = basicSalary*0.12;
				vehicle_loan = basicSalary*0.12;
				education_loan = basicSalary*0.12;
            }
            if (experience >= 2 && experience <= 5) {
            	house_loan = basicSalary*0.18;
				vehicle_loan = basicSalary*0.19;
				education_loan = basicSalary*0.11;
            } 
            if (experience >= 6 && experience <= 10) {
            	house_loan = basicSalary*0.16;
				vehicle_loan = basicSalary*0.17;
				education_loan = basicSalary*0.15;
            } 
            if (experience >= 11 && experience <= 14) {
            	house_loan = basicSalary*0.19;
				vehicle_loan = basicSalary*0.22;
				education_loan = basicSalary*0.21;
            }
            if (experience >= 15) {
            	house_loan = basicSalary*0.29;
				vehicle_loan = basicSalary*0.33;
				education_loan = basicSalary*0.38;
            }
        }
        
        this.total_deductions = house_loan + vehicle_loan + education_loan;
        System.out.println("total_deductions.............." +this.total_deductions);
        return total_deductions;
    }
}



