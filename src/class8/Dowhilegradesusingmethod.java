package class8;

public class Dowhilegradesusingmethod {

    // Check Valid Marks
    public boolean ChkValidmarks(int marks) {
        if (marks > 0 && marks <= 100) {
            System.out.println("Valid marks");
            return true;
        } else {
            System.err.println("Invalid marks");
            return false;
        }
    }

    // Check Pass or Fail
    public boolean Chkpassorfail(int marks) {
        if (marks < 35) {
            System.err.println("Failed");
            return false;
        } else {
            System.out.println("Passed");
            return true;
        }
    }

    public static void main(String[] args) {
    	Dowhilegradesusingmethod obj = new Dowhilegradesusingmethod();

        int[] marks = new int[7];

        marks[0] = 9;  // Roll number
        marks[1] = 29; // Maths
        marks[2] = 77; // Physics
        marks[3] = 55; // Chemistry
        marks[4] = 66; // Biology
        marks[5] = 39; // History
        marks[6] = 90; // English

        boolean Maths_Pass = false, Maths_Valid = false;
        boolean Physics_Pass = false, Physics_Valid = false;
        boolean Chemistry_Pass = false, Chemistry_Valid = false;
        boolean Biology_Pass = false, Biology_Valid = false;
        boolean History_Pass = false, History_Valid = false;
        boolean English_Pass = false, English_Valid = false;

        int i = 0;
        do {
            if (i == 0) {
                System.out.println("Roll no is ..... " + marks[i]);

                if (marks[i] <= 0) {
                    System.err.println("Invalid roll number");
                } else {
                    System.out.println("Valid roll number");
                }
            }

            // Maths
            if (i == 1) {
                System.out.println("\nMaths marks are " + marks[i]);
                Maths_Valid = obj.ChkValidmarks(marks[i]);
                if (Maths_Valid) {
                    Maths_Pass = obj.Chkpassorfail(marks[i]);
                }
            }

            // Physics
            if (i == 2) {
                System.out.println("\nPhysics marks are " + marks[i]);
                Physics_Valid = obj.ChkValidmarks(marks[i]);
                if (Physics_Valid) {
                    Physics_Pass = obj.Chkpassorfail(marks[i]);
                }
            }

            // Chemistry
            if (i == 3) {
                System.out.println("\nChemistry marks are " + marks[i]);
                Chemistry_Valid = obj.ChkValidmarks(marks[i]);
                if (Chemistry_Valid) {
                    Chemistry_Pass = obj.Chkpassorfail(marks[i]);
                }
            }

            // Biology
            if (i == 4) {
                System.out.println("\nBiology marks are " + marks[i]);
                Biology_Valid = obj.ChkValidmarks(marks[i]);
                if (Biology_Valid) {
                    Biology_Pass = obj.Chkpassorfail(marks[i]);
                }
            }

            // History (Social)
            if (i == 5) {
                System.out.println("\nHistory marks are " + marks[i]);
                History_Valid = obj.ChkValidmarks(marks[i]);
                if (History_Valid) {
                    History_Pass = obj.Chkpassorfail(marks[i]);
                }
            }

            // English
            if (i == 6) {
                System.out.println("\nEnglish marks are " + marks[i]);
                English_Valid = obj.ChkValidmarks(marks[i]);
                if (English_Valid) {
                    English_Pass = obj.Chkpassorfail(marks[i]);
                }
            }
            i++;
        } while(i < marks.length);

        char grade = 'x';

        if (marks[0] > 0) {
            int total_marks = marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6];
            System.out.println("\nTotal marks: " + total_marks);

            if (Maths_Pass && Maths_Valid && Physics_Pass && Physics_Valid &&
                Chemistry_Pass && Chemistry_Valid && Biology_Pass && Biology_Valid &&
                History_Pass && History_Valid && English_Pass && English_Valid) {

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
