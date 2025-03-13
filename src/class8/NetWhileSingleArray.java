package class8;

public class NetWhileSingleArray {

	public double netSalaryString(int exp,String job) {
		double salary = 9999;
        double medical_allowance = 0.0;
        double travel_allowance = 0.0;
        double food_allowance = 0.0;
        
        double house_loan = 0.0;
        double vehicle_loan = 0.0;
        double education_loan = 0.0;
        double commission_per = 0.0;
        
        if (job.equals("clerk")) {
            if (exp == 1) {
                salary = 5000;
                medical_allowance = salary * 0.03;
                travel_allowance = salary * 0.05;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.0015;
                vehicle_loan = salary * 0.025;
                education_loan = salary * 0.03;
                commission_per = 0.0;

            } else if (exp >= 2 && exp <= 5) {
                salary = 7000;
                medical_allowance = salary * 0.08;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.08;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.06;
                commission_per = 0.0;

            } else if (exp >= 6 && exp <= 10) {
                salary = 10000;
                medical_allowance = salary * 0.05;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.07;

                house_loan = salary * 0.05;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.07;
                commission_per = 0.0;

            } else if (exp >= 11 && exp <= 14) {
                salary = 14000;
                medical_allowance = salary * 0.11;
                travel_allowance = salary * 0.12;
                food_allowance = salary * 0.12;

                house_loan = salary * 0.11;
                vehicle_loan = salary * 0.12;
                education_loan = salary * 0.12;
                commission_per = 0.0;

            } else if (exp >= 15) {
                salary = 20000;
                medical_allowance = salary * 0.16;
                travel_allowance = salary * 0.15;
                food_allowance = salary * 0.17;

                house_loan = salary * 0.16;
                vehicle_loan = salary * 0.15;
                education_loan = salary * 0.17;
                commission_per = 0.0; //we can include this statement or if dont include no issues
            } else {
                System.out.println("Salary not listed");
            }
        }
          //Manager
			else if(job == "manager") {
					if(exp >=0 & exp <= 1) {
						salary = 8000;
						medical_allowance = salary*0.05;
						travel_allowance = salary*0.06;
						food_allowance = salary*0.08;
						
						house_loan = salary*0.05;
						vehicle_loan = salary*0.06;
						education_loan = salary*0.08;
							
					}else 
					if(exp >=2 & exp <=5) {
						salary = 12000;
						medical_allowance = salary*0.12;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.09;
						
						house_loan = salary*0.12;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.09;
					}else
					if(exp >=6 & exp <=10) {
						salary = 14000;
						medical_allowance = salary*0.18;
						travel_allowance = salary*0.19;
						food_allowance = salary*0.17;
						
						house_loan = salary*0.18;
						vehicle_loan = salary*0.19;
						education_loan = salary*0.17;
					}else
					if(exp >=11 & exp <=14) {
						salary = 20000;
						medical_allowance = salary*0.19;
						travel_allowance = salary*0.22;
						food_allowance = salary*0.24;
						
						house_loan = salary*0.19;
						vehicle_loan = salary*0.22;
						education_loan = salary*0.24;
					}else
					if(exp >=15) {
						salary = 25000;
						medical_allowance = salary*0.29;
						travel_allowance = salary*0.33;
						food_allowance = salary*0.31;
						
						house_loan = salary*0.29;
						vehicle_loan = salary*0.33;
						education_loan = salary*0.31;
					}else {
						System.out.println("salary not listed");
					} 
				}
			
			//SalesRep
			
			else if(job == "salesrep") {
					if(exp >=0 & exp <= 1) {
						salary = 6000;
						medical_allowance = salary*0.11;
						travel_allowance = salary*0.12;
						food_allowance = salary*0.12;
						
						house_loan = salary*0.11;
						vehicle_loan = salary*0.12;
						education_loan = salary*0.12;
						commission_per = 0.23;
							
					}else 
					if(exp >=2 & exp <=5) {
						salary = 8000;
						medical_allowance = salary*0.13;
						travel_allowance = salary*0.12;
						food_allowance = salary*0.14;
						
						house_loan = salary*0.13;
						vehicle_loan = salary*0.12;
						education_loan = salary*0.14;
						commission_per = 0.23;
					}else
					if(exp >=6 & exp <=10) {
						salary = 11000;
						medical_allowance = salary*0.21;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.22;
						
						house_loan = salary*0.21;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.22;
						commission_per = 0.23;
					}else
					if(exp >=11 & exp <=14) {
						salary = 13000;
						medical_allowance = salary*0.23;
						travel_allowance = salary*0.22;
						food_allowance = salary*0.21;
						
						house_loan = salary*0.23;
						vehicle_loan = salary*0.22;
						education_loan = salary*0.21;
						commission_per = 0.23;
					}else
					if(exp >=15) {
						salary = 18000;
						medical_allowance = salary*0.29;
						travel_allowance = salary*0.28;
						food_allowance = salary*0.27;
						
						house_loan = salary*0.29;
						vehicle_loan = salary*0.28;
						education_loan = salary*0.27;
						commission_per = 0.23;
					}else {
						System.out.println("salary not listed");
					} 
				}
				
					
					//programmar
			else if(job == "programmar") {
					if(exp >=0 & exp <= 1) {
						salary = 8000;
						medical_allowance = salary*0.10;
						travel_allowance = salary*0.12;
						food_allowance = salary*0.12;
						
						house_loan = salary*0.10;
						vehicle_loan = salary*0.12;
						education_loan = salary*0.12;
							
					}else 
					if(exp >=2 & exp <=5) {
						salary = 9500;
						medical_allowance = salary*0.11;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.11;
						
						house_loan = salary*0.11;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.11;
					}else
					if(exp >=6 & exp <=10) {
						salary = 11600;
						medical_allowance = salary*0.12;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.13;
						
						house_loan = salary*0.12;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.13;
					}else
					if(exp >=11 & exp <=14) {
						salary = 15500;
						medical_allowance = salary*0.13;
						travel_allowance = salary*0.22;
						food_allowance = salary*0.21;
						
						house_loan = salary*0.13;
						vehicle_loan = salary*0.22;
						education_loan = salary*0.21;
					}else
					if(exp >=15) {
						salary = 19550;
						medical_allowance = salary*0.22;
						travel_allowance = salary*0.28;
						food_allowance = salary*0.27;
						
						house_loan = salary*0.22;
						vehicle_loan = salary*0.28;
						education_loan = salary*0.27;
					}else {
						System.out.println("salary not listed");
					} 
				}
			//Analyst
			
			else if(job == "analyst") {
					if(exp >=0 & exp <= 1) {
						salary = 11300;
						medical_allowance = salary*0.10;
						travel_allowance = salary*0.12;
						food_allowance = salary*0.12;
						
						house_loan = salary*0.10;
						vehicle_loan = salary*0.12;
						education_loan = salary*0.12;
							
					}else 
					if(exp >=2 & exp <=5) {
						salary = 14900;
						medical_allowance = salary*0.11;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.11;
						
						house_loan = salary*0.11;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.11;
					}else
					if(exp >=6 & exp <=10) {
						salary = 19600;
						medical_allowance = salary*0.12;
						travel_allowance = salary*0.11;
						food_allowance = salary*0.13;
						
						house_loan = salary*0.12;
						vehicle_loan = salary*0.11;
						education_loan = salary*0.13;
					}else
					if(exp >=11 & exp <=14) {
						salary = 20500;
						medical_allowance = salary*0.13;
						travel_allowance = salary*0.22;
						food_allowance = salary*0.21;
						
						house_loan = salary*0.13;
						vehicle_loan = salary*0.22;
						education_loan = salary*0.21;
					}else
					if(exp >=15) {
						salary = 22550;
						medical_allowance = salary*0.22;
						travel_allowance = salary*0.28;
						food_allowance = salary*0.27;
						
						house_loan = salary*0.22;
						vehicle_loan = salary*0.28;
						education_loan = salary*0.27;
					}else {
						System.out.println("salary not listed");
					}
				}
			
			//SaleaManager
			else if(job == "salesmanager") {
					if(exp >=0 & exp <= 1) {
						salary = 14000;
						medical_allowance = salary*0.12;
						travel_allowance = salary*0.12;
						food_allowance = salary*0.12;
						
						house_loan = salary*0.12;
						vehicle_loan = salary*0.12;
						education_loan = salary*0.12;
						commission_per = 0.33; 
							
					}else 
					if(exp >=2 & exp <=5) {
						salary = 14900;
						medical_allowance = salary*0.18;
						travel_allowance = salary*0.19;
						food_allowance = salary*0.11;
						
						house_loan = salary*0.18;
						vehicle_loan = salary*0.19;
						education_loan = salary*0.11;
						commission_per = 0.33;
					}else
					if(exp >=6 & exp <=10) {
						salary = 20100;
						medical_allowance = salary*0.16;
						travel_allowance = salary*0.17;
						food_allowance = salary*0.15;
						
						house_loan = salary*0.16;
						vehicle_loan = salary*0.17;
						education_loan = salary*0.15;
						commission_per = 0.33;
					}else
					if(exp >=11 & exp <=14) {
						salary = 20500;
						medical_allowance = salary*0.19;
						travel_allowance = salary*0.22;
						food_allowance = salary*0.21;
						
						house_loan = salary*0.19;
						vehicle_loan = salary*0.22;
						education_loan = salary*0.21;
						commission_per = 0.33;
					}else
					if(exp >=15) {
						salary = 22550;
						medical_allowance = salary*0.29;
						travel_allowance = salary*0.33;
						food_allowance = salary*0.38;
						
						house_loan = salary*0.29;
						vehicle_loan = salary*0.33;
						education_loan = salary*0.38;
						commission_per = 0.33;
					}else {
						System.out.println("salary not listed");
					}

        }
        System.out.println(" \nSalary of " + job + " is " + salary);
        System.out.println(" \nMedical allowance of " + job + " is " + medical_allowance);
        System.out.println(" Travel allowance of " + job + " is " + travel_allowance);
        System.out.println(" Food allowance of " + job + " is " + food_allowance);

        System.out.println(" \nHouse loan of " + job + " is " + house_loan);
        System.out.println(" \nVehicle loan of " + job + " is " + vehicle_loan);
        System.out.println(" \nEducation loan of " + job + " is " + education_loan);
        
        double total_allowances = medical_allowance + travel_allowance + food_allowance;
        double total_deductions = house_loan + vehicle_loan + education_loan;
        System.out.println("commission_per is " + commission_per);
        double commission = salary * commission_per;
        double net_salary = salary + total_allowances + commission - total_deductions;
       // double net_salary = salary + total_allowances - total_deductions;

        System.out.println("\nNet salary = " + net_salary );

        return net_salary;
        
	}

	public static void main(String[] args) {
		NetWhileSingleArray obj = new NetWhileSingleArray();
        
        String[] name = {"Rafi", "Farida", "Shahid", "Shireen", "Soha", "Samara"};
        int[] exp = {1, 4, 7, 10, 12, 16};
        String[] job = {"clerk", "manager", "salesrep", "programmer", "analyst", "salesmanager"};
        int[] emp_num = {111,112,113,114,115,116};

        if (name.length == exp.length && name.length == job.length && name.length == emp_num.length) {
            System.out.println("Calculating the salary for each employee:\n");
            
            int i = 0;
            while( i < name.length) {
            		String fullname = name[i] + " Shaik";
            		System.out.println("\n Employee Number: " + emp_num[i]);
            		System.out.println("Full Name: " + fullname);
            		System.out.println("Experience: " + exp[i]);
            		System.out.println("Job: " + job[i]);
            		double net_salary = obj.netSalaryString(exp[i], job[i]);
            		System.out.println("Net salary for " + fullname + " is " + net_salary );
            		
            		i++;
            }
        }else {
        	System.out.println(" Array length not equal");
        }
	}
}
		

					
				            	
				        	

		

	
