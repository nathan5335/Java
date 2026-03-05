import java.util.Scanner;

class Student {
    protected String studentName;
    protected int rollNumber;
    protected double academicScore;

    public Student(String studentName, int rollNumber, double academicScore) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.academicScore = academicScore;
    }

    public Student() {
        this.studentName = "";
        this.rollNumber = 0;
        this.academicScore = 0.0;
    }

    public double getAcademicScore() {
        return academicScore;
    }

    public void displayAcademicInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Academic Score: " + academicScore);
    }
}

interface Sports {
    double getSportsScore();
    void displaySportsInfo();
}

class Result extends Student implements Sports {
    private double sportsScore;
    private String sportName;

    public Result(String studentName, int rollNumber, double academicScore,
                  double sportsScore, String sportName) {
        super(studentName, rollNumber, academicScore);
        this.sportsScore = sportsScore;
        this.sportName = sportName;
    }

    public Result() {
        super();
        this.sportsScore = 0.0;
        this.sportName = "";
    }

    @Override
    public double getSportsScore() {
        return sportsScore;
    }

    @Override
    public void displaySportsInfo() {
        System.out.println("Sport: " + sportName);
        System.out.println("Sports Score: " + sportsScore);
    }

    public void displayResult() {
        System.out.println("========== STUDENT RESULT ==========");
        displayAcademicInfo();
        displaySportsInfo();
        System.out.println("Total Score: " + (academicScore + sportsScore));
        System.out.println("===================================");
    }
}

public class exp15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        Result[] results = new Result[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\n--- Enter details for Student " + (i + 1) + " ---");

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            int rollNo = 0;
            boolean validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Roll Number: ");
                    rollNo = sc.nextInt();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid integer.");
                    sc.nextLine();
                }
            }

            double academicScore = 0.0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Academic Score: ");
                    academicScore = sc.nextDouble();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine();
                }
            }

            System.out.print("Enter Sport Name: ");
            String sportName = sc.nextLine();

            double sportsScore = 0.0;
            validInput = false;
            while (!validInput) {
                try {
                    System.out.print("Enter Sports Score: ");
                    sportsScore = sc.nextDouble();
                    sc.nextLine();
                    validInput = true;
                } catch (java.util.InputMismatchException e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    sc.nextLine();
                }
            }

            results[i] = new Result(name, rollNo, academicScore, sportsScore, sportName);
        }

        System.out.println("\n\n========== ALL STUDENTS RESULTS ==========\n");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i + 1) + ":");
            results[i].displayResult();
            System.out.println();
        }

        sc.close();
    }
}
