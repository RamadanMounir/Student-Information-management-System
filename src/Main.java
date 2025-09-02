import java.util.Scanner;

public class Main {

    // add new student
    // Display all students : (ID,NAME,GPA)
    // Find Student By ID


    // Array to Store Student Data
    private static final  int Max_Student_Number=50;
    // storing students IDs
    private static int[]Student_IDs = new int[Max_Student_Number];
    // storing students names
    private static String[] Student_names= new String[Max_Student_Number];
    //storing students GPAs
    private static double[] Student_GPAs = new double[Max_Student_Number];
    // student counter used to assign number of student were stored
    private static int student_counter=0;


    public static void main(String[] args)
    {

        Scanner input =new Scanner(System.in);
        int choice;

        do{
            // Menu
            System.out.println(" --- Welcome To Student Information Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students Information");
            System.out.println("3. Find Student By ID");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");

            choice=input.nextInt();

            switch (choice){
                case 1:
                    add_Student(input);
                    break;
                case 2:
                    DisplayAllStudentDetails();
                    break;
                case 3:
                    FindStudentByID(input);
                    break;
                case 4:
                    System.out.println("---Goodbye!---🙋‍♂️🙋‍♂️🙋‍♂️🙋‍♂️🙋‍♂️");
            }

        }while (choice!=4);
        input.close();

    }


    // add new student Method
    private static void add_Student(Scanner StudentData)
    {
        System.out.println("Enter student ID: ");
        int id = StudentData.nextInt();
        System.out.println("Enter student name");
        String Name = StudentData.next();
        System.out.println("Enter student GPA");
        double gpa = StudentData.nextDouble();

        Student_IDs[student_counter]=id;
        Student_names[student_counter]=Name;
        Student_GPAs[student_counter]=gpa;

        student_counter++;
        System.out.println("Student added successfully");
    }

    // Display all students  : (ID,NAME,GPA)
    private static void DisplayAllStudentDetails()
    {
        if(student_counter==0)
        {
            System.out.println("There is no student recorded yet");
        }
        else
        {
            System.out.println("Student Records: ");
            for (int i=0;i<student_counter;i++)
            {
                System.out.println("ID: "+Student_IDs[i]+
                        " ,Name: "+Student_names[i]+
                        " ,GPA:"+Student_GPAs[i]);
            }

        }
    }

    // find student by ID
    private static  void FindStudentByID(Scanner id)
    {
        System.out.println("Enter Student ID to Search");
        int studentID = id.nextInt();
        for (int i=0;i<student_counter;i++)
        {
            if(Student_IDs[i]==studentID)
            {
                System.out.println("Student Found ");
                System.out.println("ID: "+ Student_IDs[i]+
                        ", Name: "+Student_names[i]+
                        ", GPA: "+ Student_GPAs[i]);

            }
        }
    }




}