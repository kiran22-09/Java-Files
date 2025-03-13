package class13_Static_NonStatic;

public class StaticPaySlipCommission {


		public static void main(String[] args) {
					
			
			String[] jobs = {"Clerk", "Manager", "SalesRep", "Programmar", "Analyst", "SalesManager"};
	        int[] exprnce = {10, 12, 11, 5, 3, 2};
	        
	        for(int i=0;i<jobs.length;i++) {
	        	String job = jobs[i];
	        	int exp = exprnce[i];
			
	        	RgionsStatic regobj = new RgionsStatic("ASA","North America");
	        	RegionsBizStatic regbizobj = new RegionsBizStatic();
					boolean regid = regbizobj.chkregId(regobj.getregionID());
					boolean regname = regbizobj.chkregName(regobj.getregionName());
					boolean regsen = regbizobj.chkSen(regobj.getregionName());
					boolean regopt = regbizobj.regOptions(regobj.getregionID());
					boolean reglenlimit = regbizobj.reglenLimit(regobj.getregionID());
					boolean regnamelimit = regbizobj.regNamLimit(regobj.getregionName());
					boolean regNamevalid = regbizobj.regNamechk(regobj.getregionName());
					
					
				/*	Countrys counobj = new Countrys("C440","USA");
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
					
					*/

					boolean allCondPass = false;
					
					if(regid == true & regname == true &  regsen == true & regopt == true & reglenlimit == true & regnamelimit == true &regNamevalid == true 
							
				/*  & counid == true & counname == true  & counsen == true & counopt == true & counlenlimit == true & counnamelimit == true &
				
					locid == true & streetadd == true & loccity == true & locstate == true & loczip == true &
					
					deptid == true & deptname == true & deptnameoptions == true & deptidoptions == true  &
					
					empnum == true & empnumlimit == true & empnumlen == true & emp1stnumlen == true & empnthnumlen == true*/	) {
						allCondPass = true;
						
						StaticNetSakaryCommission obj = new StaticNetSakaryCommission();
				            double net_salary = obj.netSalarycommission(job,exp);
				            System.err.println(" \nNET SALARY of " + job+ " for " +exp+ " years experience  is " + net_salary);
							
					}else {
						/*System.out.println("One or more conditions not met." );
						System.out.println("region" +regid);
						System.out.println("region" +regname);
						System.out.println("region" +regsen);
						System.out.println("region" +regopt);
						System.out.println("region" +reglenlimit);
						System.out.println("region" +regnamelimit);
						System.out.println("region" +regNamevalid);
						System.out.println("Country" +counid);
						System.out.println("Country" +counname);
						System.out.println("Country" +counsen);
						System.out.println("Country" +counopt);
						System.out.println("Country" +counlenlimit);
						System.out.println("Country" +counnamelimit);   */
						
					}
				}

			}

	}

