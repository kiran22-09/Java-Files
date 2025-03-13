package class13_Static_NonStatic;

public class StaticNetSakaryCommission {
	
	

	    public static double commission(String job, double commission_per) {
	        if (job.equalsIgnoreCase("salesrep")) {
	            commission_per = 0.23;
	        } else if (job.equalsIgnoreCase("salesmanager")) {
	            commission_per = 0.33;
	        } else {
	            commission_per = 0.0;
	        }
	        return commission_per;
	    }

	    public static double netSalarycommission(String job, int exp) {

	        double salary = 9999;
	        double medical_allowance = 0.0;
	        double travel_allowance = 0.0;
	        double food_allowance = 0.0;

	        double house_loan = 0.0;
	        double vehicle_loan = 0.0;
	        double education_loan = 0.0;
	        double commission_per = 0.0;

	        if (job.equalsIgnoreCase("clerk")) {
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
	            commission_per = commission(job,commission_per);

	        } 
						
						//Manager
					else if(job.equalsIgnoreCase("manager")) {
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
							commission_per = commission(job,commission_per);
						}
					
					//SalesRep
					
					else if(job.equalsIgnoreCase("salesrep")) {
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
							commission_per = commission(job,commission_per);
						}
						
							
							//programmar
					else if(job.equalsIgnoreCase("Programmar")) {
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
							commission_per = commission(job,commission_per);
						}
					//Analyst
					
					else if(job.equalsIgnoreCase("analyst")) {
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
							commission_per = commission(job,commission_per);
						}
					
					//SaleaManager
					else if(job.equalsIgnoreCase("salesmanager")) {
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
							
							commission_per = commission(job,commission_per);
	           
	        }
	        
	        double commission_amount = salary * commission_per;
	        double total_allowance = medical_allowance + travel_allowance + food_allowance;
	        double total_deduction = house_loan + vehicle_loan + education_loan;
	        double net_salary = salary + total_allowance + commission_amount - total_deduction;

	        System.out.println("\nSalary of " + job + " is " + salary);
	        System.out.println("Medical allowance of " + job + " is " + medical_allowance);
	        System.out.println("Travel allowance of " + job + " is " + travel_allowance);
	        System.out.println("Food allowance of " + job + " is " + food_allowance);
	        System.out.println();
	        System.out.println("House loan of " + job + " is " + house_loan);
	        System.out.println("Vehicle loan of " + job + " is " + vehicle_loan);
	        System.out.println("Education loan of " + job + " is " + education_loan);
	        System.out.println();
	        System.out.println("Commission percentage is " + commission_per);
	        System.out.println("Net salary of " + job + " is " + net_salary);

	        return net_salary;
	    }
	    /* public static void main(String[] a) {
	    int exp = 16;
	    String job = "salesmanager";
	    NetSalarywithCommission obj = new NetSalarywithCommission();
	    double net_salary = obj.NetSalarywithCommission(exp, job);
	    System.out.println("\nNet salary of " + job + " is = " + net_salary);
		}*/

	   
	}

		
		
