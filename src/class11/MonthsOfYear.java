package class11;

import java.util.Scanner;

public class MonthsOfYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number to display particulat month (1-12) \n");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		String month;
		switch(i) {
		
		case 1:
			 month = "January";
			break;
			
		case 2:
			 month = "February";
			break;
			
		case 3:
			 month = "March";
			break;
			
		case 4:
			 month = "April";
			break;
		
		case 5:
			 month = "May";
			break;
			
		case 6:
			 month = "June";
			break;
			
		case 7:
			 month = "July";
			break;
			
		case 8:
			 month = "August";
			break;
			
		case 9:
			 month = "September";
			break;
			
		case 10:
			 month = "October";
			break;
			
		case 11:
			 month = "November";
			break;
			
		case 12:
			 month = "December";
			break;
			
		default:
			month = "Invalid month. Enter a number between 1-12 to get a month & TRY AGAIN ";
			break;
		}
		
		System.err.println("Month of a particular number is " + month);

		
	}

}
