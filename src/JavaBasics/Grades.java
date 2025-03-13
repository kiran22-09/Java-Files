package JavaBasics;

public class Grades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int maths = 100;
		int physics = 90;
		int chemistry = 36;
 		int biology = 75;
		int english = 95;
		int social= 83;
		
		
		int total_marks = maths + physics + chemistry + biology + english + social;
		System.out.println("total marks of  student l:" +total_marks);
		
		char grade = 'X';
		
		if(total_marks >= 480 && total_marks <=600) {
				grade = 'A';
				System.out.println("Student 1 grade :"+grade);
		}else 
			if(total_marks >= 420 && total_marks <=479) {
				grade = 'B';
				System.out.println("Student 1 grade :"+grade);
			}else
				if(total_marks >= 360 && total_marks <=419) {
					grade = 'C';
					System.out.println("Student 1 grade :"+grade);
				}else
					if(total_marks >= 300 && total_marks <=359) {
						grade = 'D';
						System.out.println("Student 1 grade :"+grade);
					}else
						if(total_marks >= 240 && total_marks <=299) {
							grade = 'E';
							System.out.println("Student 1 grade :"+grade);
						}else
							if(total_marks >= 210 && total_marks <=239) {
								grade = 'F';
								System.out.println("Student 1 grade :"+grade); 
							}
							else {
								System.out.println("Student 1 Failed");
							}
		//System.out.println("Student 1 grade :"+grade);
		
		
		maths = 30;
		physics = 90;
		chemistry = 30;
		biology = 87;
		english = 98;
		social = 76;
		
		total_marks = maths + physics + chemistry + biology + english + social;
		System.out.println("total marks of  student l:" +total_marks);
		
		grade = 'X';
		
		if(total_marks >= 480 && total_marks <=600) {
				grade = 'A';
		}else 
			if(total_marks >= 420 && total_marks <=479) {
				grade = 'B';
			}else
				if(total_marks >= 360 && total_marks <=419) {
					grade = 'C';
				}else
					if(total_marks >= 300 && total_marks <=359) {
						grade = 'D';
					}else
						if(total_marks >= 240 && total_marks <=299) {
							grade = 'E';
						}else
							if(total_marks >= 210 && total_marks <=239) {
								grade = 'F';
							}
							else {
								System.out.println("Student 2 Failed");
							}
		System.out.println("Student 2 grade :"+grade);
		
		
	}
}
					
				
			
			
			
				
		
	
