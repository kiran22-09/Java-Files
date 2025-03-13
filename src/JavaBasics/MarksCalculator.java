package JavaBasics;

public class MarksCalculator {

		public boolean checkPass(int subject) {
			if(subject < 35) {
				return false;
			}else {
				return true;
			}
		}
		char grade = 'x';
		public char calc_grades(int total_marks) {
			if(total_marks >= 480 & total_marks <= 600) {
				grade = 'A';
			}else if(total_marks >= 420 & total_marks <= 479) {
				grade = 'B';
			}else if(total_marks >= 360 & total_marks <= 419) {
				grade = 'C';
			}else if(total_marks >= 300 & total_marks <= 359) {
				grade = 'D';
			}else if(total_marks >= 240 & total_marks <= 299) {
				grade = 'E';
			}else if(total_marks >= 210 & total_marks <= 239) {
				grade = 'F';
			}else {
				System.out.println("failed in one or more than one subject, No grade ");
			}
			System.out.println("Final_grade  = "+grade);
			return grade;
		}
		public static void main(String[] args) {
		int maths = 100;
		int physics = 90;
		int chemistry = 77;
 		int biology = 75;
		int english = 55;
		int social= 35;
		
		MarksCalculator obj = new MarksCalculator();
		boolean maths_Pass = obj.checkPass(maths);
		boolean physics_Pass = obj.checkPass(physics);
		boolean chemistry_Pass = obj.checkPass(chemistry);
		boolean biology_Pass = obj.checkPass(biology);
		boolean english_Pass = obj.checkPass(english);
		boolean social_Pass = obj.checkPass(social);
		
		
		boolean allsubjects_passed = true;
		int total_marks = maths+physics+chemistry+biology+english+social;
		
		if(maths_Pass == true & physics_Pass == true & chemistry_Pass == true & biology_Pass == true & english_Pass == true & social_Pass == true) {
			allsubjects_passed = true;
			 total_marks = maths + physics + chemistry + biology + english + social;
			System.out.println("passeed in all subjects");
			char total_grade = obj.calc_grades(total_marks);
			System.out.println("total marks .................."+total_marks);
			System.out.println("FINAL_GRADE IS ........... = " +total_grade);
			
		}else {
			allsubjects_passed = false;
			System.out.println("Failed in one or more than one subject, No grade");
		}	

	}

}
