package class8;

public class whilegradewithotmethod {

    public static void main(String[] args) {
        int total_marks;
        int[] marks = new int[7];

        marks[0] = -9;   // Roll number
        marks[1] = 100; // Math
        marks[2] = 77;  // Physics
        marks[3] = 35;  // Chemistry
        marks[4] = 68;  // Biology
        marks[5] = 75;  // History
        marks[6] = 101;  // English

        int i = 0;

        while (i < marks.length) {
            if (i == 0) {
                System.out.println("Roll no is ..... " + marks[i]);

                if (marks[i] <= 0) {
                    System.out.println("Invalid roll number");
                } else {
                    System.out.println("Valid roll number");
                }
            }

            // Math
            if (i == 1) {
                System.out.println("\nMath marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in Math");
                    } else {
                        System.out.println("Passed in Math");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            // Physics
            if (i == 2) {
                System.out.println("\nPhysics marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in Physics");
                    } else {
                        System.out.println("Passed in Physics");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            // Chemistry
            if (i == 3) {
                System.out.println("\nChemistry marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in Chemistry");
                    } else {
                        System.out.println("Passed in Chemistry");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            // Biology
            if (i == 4) {
                System.out.println("\nBiology marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in Biology");
                    } else {
                        System.out.println("Passed in Biology");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            // History
            if (i == 5) {
                System.out.println("\nHistory marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in History");
                    } else {
                        System.out.println("Passed in History");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            // English
            if (i == 6) {
                System.out.println("\nEnglish marks are ..... " + marks[i]);
                if (marks[i] > 0 && marks[i] <= 100) {
                    if (marks[i] <=34) {
                        System.out.println("Failed in English");
                    } else {
                        System.out.println("Passed in English");
                    }
                } else {
                    System.out.println("Invalid marks");
                }
            }

            i++;
        }

        total_marks = marks[1] + marks[2] + marks[3] + marks[4] + marks[5] + marks[6];
        System.out.println("\nTotal marks: " + total_marks);

        char grade = 'X';

        if (marks[0] > 0) {
            if (marks[1] > 35 && marks[2] > 35 && marks[3] > 35 && marks[4] >= 35 && marks[5] >= 35 && marks[6] >= 35) {
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
                System.out.println("Failed in one or more subjects, or invalid marks");
            }
        } else {
            System.out.println("Invalid roll number - Grade not calculated");
        }
    }
}
