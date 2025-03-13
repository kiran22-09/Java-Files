package class9;

public class GradesDDForUsingMethod {


			public int[][] storeData() {
				int[][] marks = new int[3][7];

		        marks[0][0] = 9;  
		        marks[0][1] = 98;
		        marks[0][2] = 77;
		        marks[0][3] = 35;
		        marks[0][4] = 68;
		        marks[0][5] = 75;
		        marks[0][6] = 98;

		        marks[1][0] = 10;
		        marks[1][1] = 45;
		        marks[1][2] = 56;
		        marks[1][3] = 65;
		        marks[1][4] = 70;
		        marks[1][5] = 72;
		        marks[1][6] = 85;

		        marks[2][0] = -10;
		        marks[2][1] = 39;
		        marks[2][2] = 40;
		        marks[2][3] = 50;
		        marks[2][4] = 60;
		        marks[2][5] = 39;
		        marks[2][6] = 99;
		        
		        return marks;
				
			}
		
			//chkrollnumber
			public boolean CkkRollnum(int rollnumber) {
				if(rollnumber > 0) {
					System.out.println("Roll Number is " +rollnumber);
					System.out.println("Valid roll number");
					return true;
				}else {
					System.out.println("Roll Number is " +rollnumber);
					System.err.println("Invalid roll number");
					return false;
				}
			}
			
			//chk Validmarks
			public boolean ChkValidmarks(int marks) {
				if(marks > 0 & marks <= 100 ) {
					System.out.println("Valid marks");
					return true;
				}else {
					System.err.println("Invalid marks");
					return false;
				}
			}
			
			//chkpassorfail
			public boolean Chkpassorfail(int marks){
				if(marks <  35) {
					System.err.println(" Failed");
					return false;
				}	
				else {
					System.out.println(" Passed");
					return true;
				}
			}
			
			
			//sowArray
			public void showArray(int[][] marks) {
				
				boolean Maths_Pass= false , Maths_Valid = false;
		        boolean Physics_Pass = false,Physics_Valid = false;
		        boolean Chemistry_Pass = false,Chemistry_Valid=false;
		        boolean Biology_Pass = false,Biology_Valid= false;
		        boolean History_Pass = false,History_Valid=false;
		        boolean English_Pass = false,English_Valid=false;
		        boolean valid_rollnumber = false;
		       
		        
		        for(int i=0;i < marks.length;i++) {
		       
		        	
		        	System.err.println("\n STUDENT " + (i + 1));
		        	
		        	valid_rollnumber = CkkRollnum(marks[i][0]);
		        	//if(valid_rollnumber) {
		        		int total_marks = 0;
		        	
		        		for(int j=1;j < marks[i].length;j++) {
		        	//Maths
		        	if(j==1) {
		        		System.out.println("\nmaths marks is "+ marks[i][j]);
		        		 if(Maths_Valid = ChkValidmarks(marks[i][j]))
		        		 {
		        		  Maths_Pass = Chkpassorfail(marks[i][j]);
		        		 }
		        		
		        	}
		        	
		        	//physics
		        	if(j==2) {
		        		System.out.println("\nphysics marks is " + marks[i][j]);
		        		if(Physics_Valid = ChkValidmarks(marks[i][j]))
		        		{
		        		Physics_Pass = Chkpassorfail(marks[i][j]);	
		        		}
		        	}
		        	
		        	//chemistry
		        	if(j==3) {
		        		System.out.println("\nChemistry marks is " + marks[i][j]);
		        		if(Chemistry_Valid = ChkValidmarks(marks[i][j]))
		        		{
		        		Chemistry_Pass = Chkpassorfail(marks[i][j]);
		        		}
		        		
		        	}
		        	
		        	//
		        	if(j==4) {
		        		System.out.println("\nBiology marks is " + marks[i][j]);
		        		if(Biology_Valid = ChkValidmarks(marks[i][j]))
		        		{
		        		Biology_Pass = Chkpassorfail(marks[i][j]);	
		        		}
		        	}
		        	
		        	if(j==5) {
		        		System.out.println("\nSocial marks is " + marks[i][j]);
		        		if(History_Valid = ChkValidmarks(marks[i][j]))
		        		{
		        		History_Pass = Chkpassorfail(marks[i][j]);	
		        		}
		        	}
		        	
		        	if(j==6) {
		        		System.out.println("\nEnglish marks is " + marks[i][j]);
		        		if(English_Valid = ChkValidmarks(marks[i][j]))
		        		{
		        		English_Pass = Chkpassorfail(marks[i][j]);	
		        		}
		        		
		        	}
		        	
		        	total_marks = total_marks+marks[i][j];
		        	
		 
		        		}
		        
		        		System.out.println("\nTotal marks: " + total_marks);	
		        char grade ='x';
		         
		 	       if(marks[i][0] > 0) {
		 	        
		        	 if(Maths_Pass==true && Maths_Valid == true && Physics_Pass == true && Physics_Valid  && Chemistry_Pass == true && Chemistry_Valid==true &&
		        			 Biology_Pass == true && Biology_Valid==true && History_Pass == true && History_Valid==true && English_Pass == true && English_Valid==true) {
		        		 
		        		 if (total_marks >= 480 && total_marks <= 600) {
		                     grade = 'A';
		                 } else if (total_marks >= 420 && total_marks <= 479) {
		                     grade = 'B';
		                 } else if (total_marks >= 360 && total_marks <= 419) {
		                     grade = 'C';
		                 } else if (total_marks >= 300 && total_marks <= 359) {
		                     grade = 'D';
		                 } else if (total_marks >= 240 && total_marks <= 299) {
		                     grade = 'E';
		                 } else if (total_marks >= 210 && total_marks <= 239) {
		                     grade = 'F';
		                 }
		                 System.out.println("Grade of the student is: " + grade);
		             } else {
		                 System.err.println("\nFailed in one or more subjects, or invalid marks");
		             }
		         } else {
		             System.err.println("\nInvalid roll number - Grade not calculated");
		         }
		        	 
		        }
				
			}
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				GradesDDForUsingMethod obj = new GradesDDForUsingMethod();
				int[][] Marks = obj.storeData();
				obj.showArray(Marks);
				
			}
}	
