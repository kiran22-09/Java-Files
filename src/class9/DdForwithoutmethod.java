package class9;

public class DdForwithoutmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [][] studentData = new int[1][7];
   	 //int[][] studentData = {{-9},{101},{77},{35},{68},{75},{100} }; 
       studentData[0][0] = 999;
       studentData[0][1] = 98;
       studentData[0][2] = 77;
       studentData[0][3] = 35;
       studentData[0][4] = 68;
       studentData[0][5] = 75;
       studentData[0][6] = 98;
       
       int total_marks = 0;
       
      // for(int i=0;i < studentData[0].length;i++) {
       	
       	
       	System.out.println("Roll no is ..... " + studentData[0][0]);
       if(studentData[0][0] > 0) {
       	// System.out.println("Roll no is ..... " + studentData[0][0]);
       	System.out.println(" Valid Roll Number");
       }else {
       	System.err.println("Invalid Roll Number");
       }
       
       
       for(int i=1;i < studentData[0].length;i++) {
       	
      
       
       //Math
       if (i == 1) {
           System.out.println("\nMath marks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in Math");
               } else {
                   System.out.println("Passed in Math");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
   	
       //Physics
       if (i == 2) {
           System.out.println("\nPhysicsmarks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in Physics");
               } else {
                   System.out.println("Passed in Physics");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
       
       // Chemistry
       if (i == 3) {
           System.out.println("\nChemistry marks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in Chemistry");
               } else {
                   System.out.println("Passed in Chemistry");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
       
    // Biology
       if (i == 4) {
           System.out.println("\nBiology marks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in Biology");
               } else {
                   System.out.println("Passed in Biology");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
       
       // History
       if (i == 5) {
           System.out.println("\nHistory marks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in History");
               } else {
                   System.out.println("Passed in History");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
       
    // English
       if (i == 6) {
           System.out.println("\nEnglishmarks are ..... " + studentData[0][i]);
           if (studentData[0][i] > 0 && studentData[0][i] <= 100) {
               if (studentData[0][i] <=34) {
                   System.err.println("Failed in English");
               } else {
                   System.out.println("Passed in English");
               }
           } else {
               System.err.println("Invalid marks");
           }
       }
      
       
    }
     //  }else {
       //	System.out.println("Invalid Roll Number");
       //}
       
       
       char grade = 'x';
       if (studentData[0][0] >0) {
       	 total_marks = studentData[0][1] + studentData[0][2] + studentData[0][3] + studentData[0][4]+ studentData[0][5] + studentData[0][6];
            System.out.println("\nTotal marks: " + total_marks);
           if (studentData[0][1] >= 35 && studentData[0][2]>= 35 && studentData[0][3] >= 35 && studentData[0][4] >= 35 && studentData[0][5] >= 35 && studentData[0][6] >= 35) {
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
               System.err.println("Failed in one or more subjects, or invalid marks");
           }
       } else {
           System.err.println("Invalid roll number - Grade not calculated");
       }
}

}

		
				 
				 
			    	