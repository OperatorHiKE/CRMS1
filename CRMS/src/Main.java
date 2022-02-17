import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Student stud = new Student();
        Admin admin = new Admin();
        Instructor instructor = new Instructor();


        System.out.println("------------------------------------------------------");
        System.out.println("Welcome to Course Registration and Management System");
        System.out.println("------------------------------------------------------");
        System.out.println("Please choose your profile:");


        int selection_of_user;
        do {
            selection_of_user = Menu();

            switch (selection_of_user)
            {
                case 1:
                    System.out.println("Welcome to Student Page");
                    selection_of_user = StudentMenu();
                    switch (selection_of_user)
                    {
                        case 1:
                            System.out.println("Available subjects");
                            break;
                        case 2:
                            System.out.println("Here is your profile");
                            break;
                        case 3:
                            System.out.println("Profile Creation");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Welcome to Teacher Page");
                    break;
                case 3:
                    System.out.println("Welcome to Admin Page");
                    break;
                default:
                    break;
            }
        }
        while(selection_of_user > 3);


    }
    public static int Menu()
    {
        int selector = 0;
        System.out.println("Profile 1: Student");
        System.out.println("Profile 2: Teacher");
        System.out.println("Profile 3: Admin");
        Scanner scanner = new Scanner(System.in);
        selector = scanner.nextInt();
        return selector;
    }
    public static int StudentMenu()
    {
        int student_selector;
        System.out.println("Please choose the action");
        System.out.println("Action 1: Add subject");
        System.out.println("Action 2: Check Profile");
        System.out.println("Action 3: Create Profile");
        Scanner student_scanner = new Scanner(System.in);
        student_selector = student_scanner.nextInt();
        return student_selector;
    }
}
