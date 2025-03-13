package class9;

public class DdForUsingmethod {

			//chk Validmarks
			public boolean ChkValidmarks(int marks) {
				if(marks > 0 & marks<= 100 ) {
					System.out.println("Valid marks");
					return true;
				}else {
					System.err.println("Invalid marks");
					return false;
				}
			}
			
			//chkpassorfail
			public boolean Chkpassorfail(int marks){
				if(marks < 35) {
					System.err.println(" Failed");
					return false;
				}
				else {
					System.out.println(" Passed");
					return true;
				}
			}
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				DdForUsingmethod obj = new DdForUsingmethod();
				
				  int[][] marks = new int[1][7];

			        marks[0][0] = -9;   
			        marks[0][1] = 89;
			        marks[0][2] = 77;  
			        marks[0][3] = 55;  
			        marks[0][4] = 66;  
			        marks[0][5] = 39;  
			        marks[0][6] = 99; 
			       
			        
			        
			        boolean Maths_Pass= false , Maths_Valid = false;
			        boolean Physics_Pass = false,Physics_Valid = false;
			        boolean Chemistry_Pass = false,Chemistry_Valid=false;
			        boolean Biology_Pass = false,Biology_Valid= false;
			        boolean History_Pass = false,History_Valid=false;
			        boolean English_Pass = false,English_Valid=false;
			        
			        
			        if (marks[0][0] >= 0) {
	                    System.out.println("valid roll number");
	                } else {
	                    System.err.println("INValid roll number");
	                }
			        
			        for(int i=0;i <=marks[0].length;i++) {
			        	//System.out.println(" Values os an array are " +marks[i]);
			        	
			        	
			        	if (i == 0) {
			                System.out.println("Roll no is ..... " + marks[0][i]);

			                /*if (marks[0][0] >= 0) {
			                    System.out.println("valid roll number");
			                } else {
			                    System.err.println("INValid roll number");
			                } */
			            }
			        	
			        	//Maths
			        	if(i==1) {
			        		System.out.println("\nmaths marks is "+marks[0][i]);
			        		 if(Maths_Valid = obj.ChkValidmarks(marks[0][i]))
			        		 {
			        		  Maths_Pass = obj.Chkpassorfail(marks[0][i]);
			        		 }
			        		
			        	}
			        	
			        	if(i==2) {
			        		System.out.println("\nphysics marks is " + marks[0][i]);
			        		if(Physics_Valid = obj.ChkValidmarks(marks[0][i]))
			        		{
			        		Physics_Pass = obj.Chkpassorfail(marks[0][i]);	
			        		}
			        	}
			        	
			        	if(i==3) {
			        		System.out.println("\nChemistry marks is " + marks[0][i]);
			        		if(Chemistry_Valid = obj.ChkValidmarks(marks[0][i]))
			        		{
			        		Chemistry_Pass = obj.Chkpassorfail(marks[0][i]);
			        		}
			        		
			        	}
			        		
			        	if(i==4) {
			        		System.out.println("\nBiology marks is " + marks[0][i]);
			        		if(Biology_Valid = obj.ChkValidmarks(marks[0][i]))
			        		{
			        		Biology_Pass = obj.Chkpassorfail(marks[0][i]);	
			        		}
			        	}
			        	
			        	if(i==5) {
			        		System.out.println("\nSocial marks is " +marks[0][i]);
			        		if(History_Valid = obj.ChkValidmarks(marks[0][i]))
			        		{
			        		History_Pass = obj.Chkpassorfail(marks[0][i]);	
			        		}
			        	}
			        	
			        	if(i==6) {
			        		System.out.println("\nEnglish marks is " +marks[0][i]);
			        		if(English_Valid = obj.ChkValidmarks(marks[0][i]))
			        		{
			        			//System.out.println("Eng");
			        		English_Pass = obj.Chkpassorfail(marks[0][i]);	
			        		}
			        		
			        	}
			 
			        }
			        
			      
			        char grade ='x';
			        
			        int total_marks = marks[0][1] + marks[0][2] + marks[0][3] + marks[0][4] + marks[0][5] + marks[0][6];
		 	        System.out.println("\nTotal marks: " + total_marks);
			         
			         if(marks[0][0] > 0) {
			        	// int total_marks = marks[0][1] + marks[0][2] + marks[0][3] + marks[0][4] + marks[0][5] + marks[0][6];
			 	        //System.out.println("\nTotal marks: " + total_marks);
			 	        
			 	        // char grade ='x';
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
			                 System.out.println("\nGrade of the student is: " + grade);
			             } else {
			                 System.out.println("\nFailed in one or more subjects, or invalid marks");
			             }
			         } else {
			             System.out.println("\nInvalid roll number - Grade not calculated");
			         }
			     }
			}

			
			
			