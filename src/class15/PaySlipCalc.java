package class15;

public class PaySlipCalc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicSalaryCalculator Fulltimeempobj = new BasicSalaryCalculator();
		Fulltimeempobj.setEmpID("11111");
		Fulltimeempobj.setFname("Krishna");
		Fulltimeempobj.setLname("Gundra");
		Fulltimeempobj.setExperience(14);
		Fulltimeempobj.setJobID("manager");
		
		double basicSalary = Fulltimeempobj.calculateBasicSalary();
		System.out.println("Basic salary is " +basicSalary);
		System.out.println("Basic salary is from objects" +Fulltimeempobj.getBasicSalary());
		
		double total_allowances = Fulltimeempobj.calculateAllowances();
		System.out.println("Total_allowances are " +total_allowances);
		
		double totalDeductions = Fulltimeempobj.calculateDeductions();
        System.out.println("Total deductions are: " + totalDeductions);
		
		

	}

}
