/*package JavaBasics;


public class NetSalaryCalc {
    public double netSalaryCalc(int exp, String job) {

        double salary = 9999;
        double medical_allowance = 0.0;
        double travel_allowance = 0.0;
        double food_allowance = 0.0;
        
        double house_loan = 0.0;
        double vehicle_loan = 0.0;
        double education_loan = 0.0;
        
        // Trim job string to avoid issues with extra spaces
        job = job.trim();

        // CLERK
        if (job.equals("clerk")) {
            if (exp == 1) {
                salary = 5000;
                medical_allowance = salary * 0.03;
                travel_allowance = salary * 0.05;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.0015;
                vehicle_loan = salary * 0.025;
                education_loan = salary * 0.03;

            } else if (exp >= 2 && exp <= 5) {
                salary = 7000;
                medical_allowance = salary * 0.08;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.08;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.06;

            } else if (exp >= 6 && exp <= 10) {
                salary = 10000;
                medical_allowance = salary * 0.05;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.07;

                house_loan = salary * 0.05;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.07;

            } else if (exp >= 11 && exp <= 14) {
                salary = 14000;
                medical_allowance = salary * 0.11;
                travel_allowance = salary * 0.12;
                food_allowance = salary * 0.12;

                house_loan = salary * 0.11;
                vehicle_loan = salary * 0.12;
                education_loan = salary * 0.12;

            } else if (exp >= 15) {
                salary = 20000;
                medical_allowance = salary * 0.16;
                travel_allowance = salary * 0.15;
                food_allowance = salary * 0.17;

                house_loan = salary * 0.16;
                vehicle_loan = salary * 0.15;
                education_loan = salary * 0.17;
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
							education_loan = salary*0.07;
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
								
						}else 
						if(exp >=2 & exp <=5) {
							salary = 8000;
							medical_allowance = salary*0.13;
							travel_allowance = salary*0.12;
							food_allowance = salary*0.14;
							
							house_loan = salary*0.13;
							vehicle_loan = salary*0.12;
							education_loan = salary*0.14;
						}else
						if(exp >=6 & exp <=10) {
							salary = 11000;
							medical_allowance = salary*0.21;
							travel_allowance = salary*0.11;
							food_allowance = salary*0.22;
							
							house_loan = salary*0.21;
							vehicle_loan = salary*0.11;
							education_loan = salary*0.22;
						}else
						if(exp >=11 & exp <=14) {
							salary = 13000;
							medical_allowance = salary*0.23;
							travel_allowance = salary*0.22;
							food_allowance = salary*0.21;
							
							house_loan = salary*0.23;
							vehicle_loan = salary*0.22;
							education_loan = salary*0.21;
						}else
						if(exp >=15) {
							salary = 18000;
							medical_allowance = salary*0.29;
							travel_allowance = salary*0.28;
							food_allowance = salary*0.27;
							
							house_loan = salary*0.29;
							vehicle_loan = salary*0.28;
							education_loan = salary*0.27;
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
								
						}else 
						if(exp >=2 & exp <=5) {
							salary = 14900;
							medical_allowance = salary*0.18;
							travel_allowance = salary*0.19;
							food_allowance = salary*0.11;
							
							house_loan = salary*0.18;
							vehicle_loan = salary*0.19;
							education_loan = salary*0.11;
						}else
						if(exp >=6 & exp <=10) {
							salary = 20100;
							medical_allowance = salary*0.16;
							travel_allowance = salary*0.17;
							food_allowance = salary*0.15;
							
							house_loan = salary*0.16;
							vehicle_loan = salary*0.17;
							education_loan = salary*0.15;
						}else
						if(exp >=11 & exp <=14) {
							salary = 20500;
							medical_allowance = salary*0.19;
							travel_allowance = salary*0.22;
							food_allowance = salary*0.21;
							
							house_loan = salary*0.19;
							vehicle_loan = salary*0.22;
							education_loan = salary*0.21;
						}else
						if(exp >=15) {
							salary = 22550;
							medical_allowance = salary*0.29;
							travel_allowance = salary*0.33;
							food_allowance = salary*0.38;
							
							house_loan = salary*0.29;
							vehicle_loan = salary*0.33;
							education_loan = salary*0.38;
						}else {
							System.out.println("salary not listed");
						}
					

						 double total_allowances = medical_allowance + travel_allowance + food_allowance;
					        double total_deductions = house_loan + vehicle_loan + education_loan;
					        double net_salary = salary + total_allowances - total_deductions;

					        System.out.println(" \nSalary of " + job + " is " + salary);
					        System.out.println(" \nMedical allowance of " + job + " is " + medical_allowance);
					        System.out.println(" \nTravel allowance of " + job + " is " + travel_allowance);
					        System.out.println(" \nFood allowance of " + job + " is " + food_allowance);

					        System.out.println(" \nHouse loan of " + job + " is " + house_loan);
					        System.out.println(" \nVehicle loan of " + job + " is " + vehicle_loan);
					        System.out.println(" \nEducation loan of " + job + " is " + education_loan);

					        System.out.println("\nNet salary = " + net_salary);

					        return net_salary;
					    }
    }


				public static void main(String[] a) {
			        int exp = 7;
			        String job = "clerk";
			        NetSalaryCalc obj = new NetSalaryCalc();
			        double net_salary = obj.netSalaryCalc(exp, job);
			        System.out.println("\nNet salary of " + job + " is = " + net_salary);
			    }
			}
	
*/

package JavaBasics;

public class NetSalaryCalc {
    public double netSalaryCalc(int exp, String job) {

        double salary = 9999;
        double medical_allowance = 0.0;
        double travel_allowance = 0.0;
        double food_allowance = 0.0;
        
        double house_loan = 0.0;
        double vehicle_loan = 0.0;
        double education_loan = 0.0;
        
        if (job.equals("clerk")) {
            if (exp == 1) {
                salary = 5000;
                medical_allowance = salary * 0.03;
                travel_allowance = salary * 0.05;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.0015;
                vehicle_loan = salary * 0.025;
                education_loan = salary * 0.03;

            } else if (exp >= 2 && exp <= 5) {
                salary = 7000;
                medical_allowance = salary * 0.08;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.06;

                house_loan = salary * 0.08;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.06;

            } else if (exp >= 6 && exp <= 10) {
                salary = 10000;
                medical_allowance = salary * 0.05;
                travel_allowance = salary * 0.06;
                food_allowance = salary * 0.07;

                house_loan = salary * 0.05;
                vehicle_loan = salary * 0.06;
                education_loan = salary * 0.07;

            } else if (exp >= 11 && exp <= 14) {
                salary = 14000;
                medical_allowance = salary * 0.11;
                travel_allowance = salary * 0.12;
                food_allowance = salary * 0.12;

                house_loan = salary * 0.11;
                vehicle_loan = salary * 0.12;
                education_loan = salary * 0.12;

            } else if (exp >= 15) {
                salary = 20000;
                medical_allowance = salary * 0.16;
                travel_allowance = salary * 0.15;
                food_allowance = salary * 0.17;

                house_loan = salary * 0.16;
                vehicle_loan = salary * 0.15;
                education_loan = salary * 0.17;
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
								
						}else 
						if(exp >=2 & exp <=5) {
							salary = 8000;
							medical_allowance = salary*0.13;
							travel_allowance = salary*0.12;
							food_allowance = salary*0.14;
							
							house_loan = salary*0.13;
							vehicle_loan = salary*0.12;
							education_loan = salary*0.14;
						}else
						if(exp >=6 & exp <=10) {
							salary = 11000;
							medical_allowance = salary*0.21;
							travel_allowance = salary*0.11;
							food_allowance = salary*0.22;
							
							house_loan = salary*0.21;
							vehicle_loan = salary*0.11;
							education_loan = salary*0.22;
						}else
						if(exp >=11 & exp <=14) {
							salary = 13000;
							medical_allowance = salary*0.23;
							travel_allowance = salary*0.22;
							food_allowance = salary*0.21;
							
							house_loan = salary*0.23;
							vehicle_loan = salary*0.22;
							education_loan = salary*0.21;
						}else
						if(exp >=15) {
							salary = 18000;
							medical_allowance = salary*0.29;
							travel_allowance = salary*0.28;
							food_allowance = salary*0.27;
							
							house_loan = salary*0.29;
							vehicle_loan = salary*0.28;
							education_loan = salary*0.27;
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
								
						}else 
						if(exp >=2 & exp <=5) {
							salary = 14900;
							medical_allowance = salary*0.18;
							travel_allowance = salary*0.19;
							food_allowance = salary*0.11;
							
							house_loan = salary*0.18;
							vehicle_loan = salary*0.19;
							education_loan = salary*0.11;
						}else
						if(exp >=6 & exp <=10) {
							salary = 20100;
							medical_allowance = salary*0.16;
							travel_allowance = salary*0.17;
							food_allowance = salary*0.15;
							
							house_loan = salary*0.16;
							vehicle_loan = salary*0.17;
							education_loan = salary*0.15;
						}else
						if(exp >=11 & exp <=14) {
							salary = 20500;
							medical_allowance = salary*0.19;
							travel_allowance = salary*0.22;
							food_allowance = salary*0.21;
							
							house_loan = salary*0.19;
							vehicle_loan = salary*0.22;
							education_loan = salary*0.21;
						}else
						if(exp >=15) {
							salary = 22550;
							medical_allowance = salary*0.29;
							travel_allowance = salary*0.33;
							food_allowance = salary*0.38;
							
							house_loan = salary*0.29;
							vehicle_loan = salary*0.33;
							education_loan = salary*0.38;
						}else {
							System.out.println("salary not listed");
						}

           
        }
        
  
        System.out.println(" \nSalary of " + job + " is " + salary);
        System.out.println(" \nMedical allowance of " + job + " is " + medical_allowance);
        System.out.println(" \nTravel allowance of " + job + " is " + travel_allowance);
        System.out.println(" \nFood allowance of " + job + " is " + food_allowance);

        System.out.println(" \nHouse loan of " + job + " is " + house_loan);
        System.out.println(" \nVehicle loan of " + job + " is " + vehicle_loan);
        System.out.println(" \nEducation loan of " + job + " is " + education_loan);
        
        double total_allowances = medical_allowance + travel_allowance + food_allowance;
        double total_deductions = house_loan + vehicle_loan + education_loan;
        double net_salary = salary + total_allowances - total_deductions;

        System.out.println("\nNet salary = " + net_salary);

        return net_salary;
    }

   /* public static void main(String[] a) {
        int exp = 16;
        String job = "salesmanager";
        NetSalaryCalc obj = new NetSalaryCalc();
        double net_salary = obj.netSalaryCalc(exp, job);
        System.out.println("\nNet salary of " + job + " is = " + net_salary);
    }*/
}


