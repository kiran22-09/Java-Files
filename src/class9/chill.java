package class9;

public class chill {

    public static void main(String[] args) {
        // Initialize student data
    	int [][] studentData = new int[3][7];
      
          studentData[0][0] = -9;
          studentData[0][1] = 98;
          studentData[0][2] = 77;
          studentData[0][3] = 35;
          studentData[0][4] = 68;
          studentData[0][5] = 75;
          studentData[0][6] = 98;
          
          studentData[1][0] = 10;   
          studentData[1][1] = 45;   
          studentData[1][2] = 56;   
          studentData[1][3] = 65;   
          studentData[1][4] = 70;   
          studentData[1][5] = 72;   
          studentData[1][6] = 85;
          
          studentData[2][0] = 10; 
          studentData[2][1] = 39;   
          studentData[2][2] = 40;   
          studentData[2][3] = 50;   
          studentData[2][4] = 60;   
          studentData[2][5] = 36;   
          studentData[2][6] = 80;

        for (int i = 0; i < studentData.length; i++) {
            int total_marks = 0;
            boolean allSubjectsPassed = true;

            System.out.println("\nStudent " + (i + 1));
            System.out.println("Roll no is ..... " + studentData[i][0]);

            if (studentData[i][0] > 0) {
                System.out.println("Valid Roll Number");
            } else {
                System.err.println("Invalid Roll Number");
            }

            for (int j = 1; j < studentData[i].length; j++) {
                // Math
                if (j == 1) {
                    System.out.println("\nMaths Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in Maths");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in Maths");
                        }
                    } else {
                        System.err.println("Invalid marks in Maths");
                    }
                }

                // Physics
                if (j == 2) {
                    System.out.println("\nPhysics Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in Physics");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in Physics");
                        }
                    } else {
                        System.err.println("Invalid marks in Physics");
                    }
                }

                // Chemistry
                if (j == 3) {
                    System.out.println("\nChemistry Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in Chemistry");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in Chemistry");
                        }
                    } else {
                        System.err.println("Invalid marks in Chemistry");
                    }
                }

                // Biology
                if (j == 4) {
                    System.out.println("\nBiology Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in Biology");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in Biology");
                        }
                    } else {
                        System.err.println("Invalid marks in Biology");
                    }
                }

                // History
                if (j == 5) {
                    System.out.println("\nHistory Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in History");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in History");
                        }
                    } else {
                        System.err.println("Invalid marks in History");
                    }
                }

                // English
                if (j == 6) {
                    System.out.println("\nEnglish Marks are ..... " + studentData[i][j]);
                    if (studentData[i][j] > 0 && studentData[i][j] <= 100) {
                        if (studentData[i][j] <= 34) {
                            System.err.println("Failed in English");
                            allSubjectsPassed = false;
                        } else {
                            System.out.println("Passed in English");
                        }
                    } else {
                        System.err.println("Invalid marks in English");
                    }
                }

                total_marks += studentData[i][j];
            }

            System.out.println("\nTotal marks: " + total_marks);

            char grade = 'X';
            if (allSubjectsPassed) {
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
        }
    }
}
