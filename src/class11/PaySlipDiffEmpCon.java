package class11;

import java.util.Scanner;

public class PaySlipDiffEmpCon {

	public static void main(String[] args) {
				// TODO Auto-generated method stub

			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the job_tile (Clerk, Manager, Salesrep, Programmar, Analyst, SalesManager");
			String job = sc.next();
		
			System.out.println("Enter the experience of " +job);
			int exp = sc.nextInt();

			
			NetSalaryDiffEmpCon obj = new NetSalaryDiffEmpCon();
			double salary= obj.netSalarycommission(job,exp);
	        
	       
			
			//System.out.println("For " +job+ " the experience of " +exp+ " and the net_salary is " +salary );
			
		
		
				Regions regobj = new Regions("ASA","North America");
				RegionsBiz regbizobj = new RegionsBiz();
				boolean regid = regbizobj.chkregId(regobj.getregionID());
				boolean regname = regbizobj.chkregName(regobj.getregionName());
				boolean regsen = regbizobj.chkSen(regobj.getregionName());
				boolean regopt = regbizobj.regOptions(regobj.getregionID());
				boolean reglenlimit = regbizobj.reglenLimit(regobj.getregionID());
				boolean regnamelimit = regbizobj.regNamLimit(regobj.getregionName());
				boolean regNamevalid = regbizobj.regNamechk(regobj.getregionName());
				
				
				Countrys counobj = new Countrys("C440","USA");
				CountrysBiz counbizobj = new CountrysBiz();
				boolean counid = counbizobj.chkcounId(counobj.getcountryID());
				boolean counname = counbizobj.chkcounName(counobj.getcountryName());
				boolean counsen = counbizobj.counSen(counobj.getcountryName());
				boolean counopt = counbizobj.counOptions(counobj.getcountryID());
				boolean counlenlimit = counbizobj.counlenLimit(counobj.getcountryID());
				boolean counnamelimit = counbizobj.counNamLimit(counobj.getcountryName());
				
				Locations locobj = new Locations("3526","oxford","cumming","georgia","533447");
				LocationsBiz locbizobj = new LocationsBiz();
				boolean locid = locbizobj.chklocId(locobj.getlocationID());
				boolean streetadd = locbizobj.chkstradd(locobj.getstreetAddress());
				boolean loccity = locbizobj.chkcity(locobj.getcity());
				boolean locstate = locbizobj.chkstate(locobj.getstate());
				boolean loczip = locbizobj.chkzip(locobj.getzipcode());
				//boolean locconId = locobj.locchkconId(countryId);
				//boolean locOptions = locobj.locOptions(locationId);
				//boolean locconOptions = locobj.locconOp(countryName);
				//boolean locIdlimit = locobj.loclenLimit(locationId);
				//boolean locstrlimit = locobj.locstrNamelimit(streetAdd);
				
				Departments deptobj = new Departments("20","sales");
				DepaartmentsBiz deptbizobj = new DepaartmentsBiz();
				boolean deptid = deptbizobj.chkdeptId(deptobj.getdeptID());
				boolean deptname = deptbizobj.chkdeptName(deptobj.getdeptName());
				boolean deptnameoptions = deptbizobj.deptNameOptions(deptobj.getdeptName());
				boolean deptidoptions = deptbizobj.deptIdOptions(deptobj.getdeptID());
				
				Employees empobj = new Employees("5986",2,"jean","paul","manager");
				EmployeesBiz empbizobj = new EmployeesBiz();
				boolean empnum = empbizobj.chkEmployeeNolen(empobj.getEmployeeNo());
				boolean empnumlimit = empbizobj.EmpNumLimit(empobj.getEmployeeNo1());
				boolean empnumlen = empbizobj.chkEmployeeNoLength(empobj.getEmployeeNo());
				boolean emp1stnumlen = empbizobj.chkEmployeeFirstNamelen(empobj.getEmployeeNo());
				boolean empnthnumlen = empbizobj.chkEmployeeLastNamelen(empobj.getEmployeeNo());
				
				

				boolean allCondPass = false;
				
				if(regid == true & regname == true &  regsen == true & regopt == true & reglenlimit == true & regnamelimit == true &regNamevalid == true &
						
				counid == true & counname == true  & counsen == true & counopt == true & counlenlimit == true & counnamelimit == true &
			
				locid == true & streetadd == true & loccity == true & locstate == true & loczip == true &
				
				deptid == true & deptname == true & deptnameoptions == true & deptidoptions == true  &
				
				empnum == true & empnumlimit == true & empnumlen == true & emp1stnumlen == true & empnthnumlen == true	) {
					allCondPass = true;
					
					NetSalaryDiffEmpCon obj1 = new NetSalaryDiffEmpCon();
			            double net_salary = obj1.netSalarycommission(job,exp);
			            System.err.println(" \nNET SALARY of " + job+ " for " +exp+ " years experience  is " + net_salary);
						
				}else {
				
					
				}
			}

		}



