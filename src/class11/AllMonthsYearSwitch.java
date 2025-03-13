package class11;

public class AllMonthsYearSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String monthname;
		for(int monthnum=1; monthnum<= 12;monthnum++) {
			
			switch(monthnum) {
			
			case 1:
				monthname = "January";
				break;
				
			case 2:
				monthname = "February";
				break;
				
			case 3:
				monthname = "March";
				break;
				
			case 4:
				monthname = "April";
				break;
			
			case 5:
				monthname = "May";
				break;
				
			case 6:
				monthname = "June";
				break;
				
			case 7:
				monthname = "July";
				break;
				
			case 8:
				monthname = "August";
				break;
				
			case 9:
				monthname = "September";
				break;
				
			case 10:
				monthname = "October";
				break;
				
			case 11:
				monthname = "November";
				break;
				
			case 12:
				monthname = "December";
				break;
				
			default:
				monthname = "Invalid month. Enter a number between 1-12 to get a month & TRY AGAIN ";
				break;
			}
			System.out.println("Month " + monthnum + ": " + monthname);
			
		}

	}

}
