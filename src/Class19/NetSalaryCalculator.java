package Class19;

public class NetSalaryCalculator extends BasicSalaryCalculator implements Allowances, Deductions, LossOfPay {

    public double total_allowances;
    public double total_deductions;

    public NetSalaryCalculator(String regionID, String regionName, String countryID, String countryName,
                               String locationID, String city, String deptID, String deptName) {
        super(regionID, regionName, countryID, countryName, locationID, city, deptID, deptName);
        System.err.println("Inside NetSalary Calculator");
    }

    public double calculateAllowances() {
        double medical_allowance = 0.0;
        double travel_allowance = 0.0;
        double food_allowance = 0.0;
        
        if (super.getJobID().equalsIgnoreCase("clerk")) {
            System.out.println("Inside jobID clerk");
            if (super.getExperience() == 1) {
                medical_allowance = super.getBasicSalary() * 0.03;
                travel_allowance = super.getBasicSalary() * 0.05;
                food_allowance = super.getBasicSalary() * 0.06;
            } 
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                medical_allowance = super.getBasicSalary() * 0.08;
                travel_allowance = super.getBasicSalary() * 0.06;
                food_allowance = super.getBasicSalary() * 0.06;
            }
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                medical_allowance = super.getBasicSalary() * 0.08;
                travel_allowance = super.getBasicSalary() * 0.06;
                food_allowance = super.getBasicSalary() * 0.06;
            }
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                medical_allowance = super.getBasicSalary() * 0.08;
                travel_allowance = super.getBasicSalary() * 0.06;
                food_allowance = super.getBasicSalary() * 0.06;
            }
            if (super.getExperience() >= 15) {
                medical_allowance = super.getBasicSalary() * 0.03;
                travel_allowance = super.getBasicSalary() * 0.05;
                food_allowance = super.getBasicSalary() * 0.06;
            }
        } 
        
        if (super.getJobID().equalsIgnoreCase("manager")) {
            System.out.println("Inside jobID manager");
            if (super.getExperience() == 1) {
                medical_allowance = super.getBasicSalary() * 0.05;
                travel_allowance = super.getBasicSalary() * 0.06;
                food_allowance = super.getBasicSalary() * 0.08;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                medical_allowance = super.getBasicSalary() * 0.12;
                travel_allowance = super.getBasicSalary() * 0.11;
                food_allowance = super.getBasicSalary() * 0.09;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                medical_allowance = super.getBasicSalary() * 0.18;
                travel_allowance = super.getBasicSalary() * 0.19;
                food_allowance = super.getBasicSalary() * 0.17;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                medical_allowance = super.getBasicSalary() * 0.19;
                travel_allowance = super.getBasicSalary() * 0.22;
                food_allowance = super.getBasicSalary() * 0.24;
            } 
            if (super.getExperience() >= 15) {
                medical_allowance = super.getBasicSalary() * 0.29;
                travel_allowance = super.getBasicSalary() * 0.33;
                food_allowance = super.getBasicSalary() * 0.31;
            }
        }
        
        if(super.getJobID().equalsIgnoreCase("salesrep")) {
        	System.out.println("Inside jobID salesrep");
			if(super.getExperience() ==1) {
				medical_allowance = super.getBasicSalary()*0.11;
				travel_allowance = super.getBasicSalary()*0.12;
				food_allowance = super.getBasicSalary()*0.12;
				
					
			}
			if(super.getExperience() >=2 & super.getExperience() <=5) {
				
				medical_allowance = super.getBasicSalary()*0.13;
				travel_allowance = super.getBasicSalary()*0.12;
				food_allowance = super.getBasicSalary()*0.14;
				
				
			}
			if(super.getExperience() >=6 & super.getExperience() <=10) {
				
				medical_allowance = super.getBasicSalary()*0.21;
				travel_allowance = super.getBasicSalary()*0.11;
				food_allowance = super.getBasicSalary()*0.22;
				
				
			}
			if(super.getExperience() >=11 & super.getExperience() <=14) {
				
				medical_allowance = super.getBasicSalary()*0.23;
				travel_allowance = super.getBasicSalary()*0.22;
				food_allowance = super.getBasicSalary()*0.21;
				
				
			}
			if(super.getExperience() >=15) {
				
				medical_allowance = super.getBasicSalary()*0.29;
				travel_allowance = super.getBasicSalary()*0.28;
				food_allowance = super.getBasicSalary()*0.27;
				
				
			}
        }
        
        if(super.getJobID().equalsIgnoreCase("Programmar")) {
        	System.out.println("Inside jobID programmar");

        
			if(super.getExperience() == 1) {
				
				medical_allowance = super.getBasicSalary()*0.10;
				travel_allowance = super.getBasicSalary()*0.12;
				food_allowance = super.getBasicSalary()*0.12;
				
			
					
			} 
			if(super.getExperience() >=2 & super.getExperience() <=5) {
				
				medical_allowance = super.getBasicSalary()*0.11;
				travel_allowance = super.getBasicSalary()*0.11;
				food_allowance = super.getBasicSalary()*0.11;
				
				
			}
			if(super.getExperience() >=6 & super.getExperience() <=10) {
				
				medical_allowance = super.getBasicSalary()*0.12;
				travel_allowance = super.getBasicSalary()*0.11;
				food_allowance = super.getBasicSalary()*0.13;
				
				
			}
			if(super.getExperience() >=11 & super.getExperience() <=14) {
				
				medical_allowance = super.getBasicSalary()*0.13;
				travel_allowance = super.getBasicSalary()*0.22;
				food_allowance = super.getBasicSalary()*0.21;
				
				
			}
			if(super.getExperience() >=15) {
				
				medical_allowance = super.getBasicSalary()*0.22;
				travel_allowance = super.getBasicSalary()*0.28;
				food_allowance = super.getBasicSalary()*0.27;
				
				
			}
        }
        
        
        if(super.getJobID().equalsIgnoreCase("analyst")) {
        	System.out.println("Inside jobID analyst");
			if(super.getExperience() == 1) {
				
				medical_allowance = super.getBasicSalary()*0.10;
				travel_allowance = super.getBasicSalary()*0.12;
				food_allowance = super.getBasicSalary()*0.12;
				
				
					
			} 
			if(super.getExperience() >=2 & super.getExperience() <=5) {
				
				medical_allowance = super.getBasicSalary()*0.11;
				travel_allowance = super.getBasicSalary()*0.11;
				food_allowance = super.getBasicSalary()*0.11;
				
				
			}
			if(super.getExperience() >=6 & super.getExperience() <=10) {
			
				medical_allowance = super.getBasicSalary()*0.12;
				travel_allowance = super.getBasicSalary()*0.11;
				food_allowance = super.getBasicSalary()*0.13;
				
				
			}
			if(super.getExperience() >=11 & super.getExperience() <=14) {
				
				medical_allowance = super.getBasicSalary()*0.13;
				travel_allowance = super.getBasicSalary()*0.22;
				food_allowance = super.getBasicSalary()*0.21;
				
				
			}
			if(super.getExperience() >=15) {
				
				medical_allowance = super.getBasicSalary()*0.22;
				travel_allowance = super.getBasicSalary()*0.28;
				food_allowance = super.getBasicSalary()*0.27;
				
				
			}
        }
        
        
        
        if(super.getJobID().equalsIgnoreCase("salesmanager")) {
        	System.out.println("Inside jobID Salesmanager");
        	
			if(super.getExperience() == 1) {
				
				medical_allowance = super.getBasicSalary()*0.12;
				travel_allowance = super.getBasicSalary()*0.12;
				food_allowance = super.getBasicSalary()*0.12;
				
				
					
			} 
			if(super.getExperience()  >=2 & super.getExperience()  <=5) {
				
				medical_allowance = super.getBasicSalary()*0.18;
				travel_allowance = super.getBasicSalary()*0.19;
				food_allowance = super.getBasicSalary()*0.11;
				
				
			}
			if(super.getExperience()  >=6 & super.getExperience()  <=10) {
				
				medical_allowance = super.getBasicSalary()*0.16;
				travel_allowance = super.getBasicSalary()*0.17;
				food_allowance = super.getBasicSalary()*0.15;
				
				
			}
			if(super.getExperience()  >=11 & super.getExperience()  <=14) {
				
				medical_allowance = super.getBasicSalary()*0.19;
				travel_allowance = super.getBasicSalary()*0.22;
				food_allowance = super.getBasicSalary()*0.21;
				
				
			}
			if(super.getExperience() >=15) {
				
				medical_allowance = super.getBasicSalary()*0.29;
				travel_allowance = super.getBasicSalary()*0.33;
				food_allowance = super.getBasicSalary()*0.38;
				
				
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
        
        if (super.getJobID().equalsIgnoreCase("clerk")) {
            System.out.println("Inside jobID clerk");
            if (super.getExperience() == 1) {
                house_loan = super.getBasicSalary() * 0.0015;
                vehicle_loan = super.getBasicSalary() * 0.025;
                education_loan = super.getBasicSalary() * 0.03;
            } else if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                house_loan = super.getBasicSalary() * 0.08;
                vehicle_loan = super.getBasicSalary() * 0.06;
                education_loan = super.getBasicSalary() * 0.06;
            } else if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                house_loan = super.getBasicSalary() * 0.05;
                vehicle_loan = super.getBasicSalary() * 0.06;
                education_loan = super.getBasicSalary() * 0.07;
            } else if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                house_loan = super.getBasicSalary() * 0.11;
                vehicle_loan = super.getBasicSalary() * 0.12;
                education_loan = super.getBasicSalary() * 0.12;
            } else if (super.getExperience() >= 15) {
                house_loan = super.getBasicSalary() * 0.16;
                vehicle_loan = super.getBasicSalary() * 0.15;
                education_loan = super.getBasicSalary() * 0.17;
            }
        } 
        
        if (super.getJobID().equalsIgnoreCase("manager")) {
            System.out.println("Inside jobID manager");
            if (super.getExperience() == 1) {
                house_loan = super.getBasicSalary() * 0.05;
                vehicle_loan = super.getBasicSalary() * 0.06;
                education_loan = super.getBasicSalary() * 0.08;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
                house_loan = super.getBasicSalary() * 0.12;
                vehicle_loan = super.getBasicSalary() * 0.11;
                education_loan = super.getBasicSalary() * 0.09;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                house_loan = super.getBasicSalary() * 0.18;
                vehicle_loan = super.getBasicSalary() * 0.19;
                education_loan = super.getBasicSalary() * 0.17;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
                house_loan = super.getBasicSalary() * 0.19;
                vehicle_loan = super.getBasicSalary() * 0.22;
                education_loan = super.getBasicSalary() * 0.24;
            }
            if (super.getExperience() >= 15) {
                house_loan = super.getBasicSalary() * 0.29;
                vehicle_loan = super.getBasicSalary() * 0.33;
                education_loan = super.getBasicSalary() * 0.31;
            }
        }
        
        if (super.getJobID().equalsIgnoreCase("salesrep")) {
            System.out.println("Inside jobID salesrep");
            if (super.getExperience() == 1) {
            	house_loan = super.getBasicSalary()*0.11;
				vehicle_loan = super.getBasicSalary()*0.12;
				education_loan = super.getBasicSalary()*0.12;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
            	house_loan = super.getBasicSalary()*0.13;
				vehicle_loan = super.getBasicSalary()*0.12;
				education_loan = super.getBasicSalary()*0.14;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
                house_loan = super.getBasicSalary() * 0.18;
                vehicle_loan = super.getBasicSalary() * 0.19;
                education_loan = super.getBasicSalary() * 0.17;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
            	house_loan = super.getBasicSalary()*0.23;
				vehicle_loan = super.getBasicSalary()*0.22;
				education_loan = super.getBasicSalary()*0.21;
            }
            if (super.getExperience() >= 15) {
            	house_loan = super.getBasicSalary()*0.29;
				vehicle_loan = super.getBasicSalary()*0.28;
				education_loan = super.getBasicSalary()*0.27;
            }
        }
        
        
        if (super.getJobID().equalsIgnoreCase("programmar")) {
            System.out.println("Inside jobID programmar");
            if (super.getExperience() == 1) {
            	house_loan = super.getBasicSalary()*0.10;
				vehicle_loan = super.getBasicSalary()*0.12;
				education_loan = super.getBasicSalary()*0.12;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
            	house_loan = super.getBasicSalary()*0.11;
				vehicle_loan = super.getBasicSalary()*0.11;
				education_loan = super.getBasicSalary()*0.11;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
            	house_loan = super.getBasicSalary()*0.12;
				vehicle_loan = super.getBasicSalary()*0.11;
				education_loan = super.getBasicSalary()*0.13;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
            	house_loan = super.getBasicSalary()*0.13;
				vehicle_loan = super.getBasicSalary()*0.22;
				education_loan = super.getBasicSalary()*0.21;
            }
            if (super.getExperience() >= 15) {
            	house_loan = super.getBasicSalary()*0.22;
				vehicle_loan = super.getBasicSalary()*0.28;
				education_loan = super.getBasicSalary()*0.27;
            }
        }
        
        
        
        if (super.getJobID().equalsIgnoreCase("analyst")) {
            System.out.println("Inside jobID analyst");
            if (super.getExperience() == 1) {
            	house_loan = super.getBasicSalary()*0.10;
				vehicle_loan = super.getBasicSalary()*0.12;
				education_loan = super.getBasicSalary()*0.12;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
            	house_loan = super.getBasicSalary()*0.11;
				vehicle_loan = super.getBasicSalary()*0.11;
				education_loan = super.getBasicSalary()*0.11;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
            	house_loan = super.getBasicSalary()*0.12;
				vehicle_loan = super.getBasicSalary()*0.11;
				education_loan = super.getBasicSalary()*0.13;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
            	house_loan = super.getBasicSalary()*0.13;
				vehicle_loan = super.getBasicSalary()*0.22;
				education_loan = super.getBasicSalary()*0.21;
            }
            if (super.getExperience() >= 15) {
            	house_loan = super.getBasicSalary()*0.22;
				vehicle_loan = super.getBasicSalary()*0.28;
				education_loan = super.getBasicSalary()*0.27;
            }
        }
        
        
        
        if (super.getJobID().equalsIgnoreCase("salaesmanager")) {
            System.out.println("Inside jobID salaesmanager");
            if (super.getExperience() == 1) {
            	house_loan = super.getBasicSalary()*0.12;
				vehicle_loan = super.getBasicSalary()*0.12;
				education_loan = super.getBasicSalary()*0.12;
            }
            if (super.getExperience() >= 2 && super.getExperience() <= 5) {
            	house_loan = super.getBasicSalary()*0.18;
				vehicle_loan = super.getBasicSalary()*0.19;
				education_loan = super.getBasicSalary()*0.11;
            } 
            if (super.getExperience() >= 6 && super.getExperience() <= 10) {
            	house_loan = super.getBasicSalary()*0.16;
				vehicle_loan = super.getBasicSalary()*0.17;
				education_loan = super.getBasicSalary()*0.15;
            } 
            if (super.getExperience() >= 11 && super.getExperience() <= 14) {
            	house_loan = super.getBasicSalary()*0.19;
				vehicle_loan = super.getBasicSalary()*0.22;
				education_loan = super.getBasicSalary()*0.21;
            }
            if (super.getExperience() >= 15) {
            	house_loan = super.getBasicSalary()*0.29;
				vehicle_loan = super.getBasicSalary()*0.33;
				education_loan = super.getBasicSalary()*0.38;
            }
        }
        
        this.total_deductions = house_loan + vehicle_loan + education_loan;
        System.out.println("total_deductions.............." +this.total_deductions);
        return total_deductions;
    }
}
