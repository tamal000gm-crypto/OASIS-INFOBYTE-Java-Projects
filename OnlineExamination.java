import java.util.Scanner;

public class OnlineExamination {

    static String username = "admin";
    static String password = "1234";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== ONLINE EXAMINATION SYSTEM =====");

        // LOGIN
        System.out.print("Enter Username: ");
        String user = sc.nextLine();

        System.out.print("Enter Password: ");
        String pass = sc.nextLine();

        if (user.equals(username) && pass.equals(password)) {
            System.out.println("Login Successful!\n");
            menu(sc);
        } else {
            System.out.println("Invalid Login!");
        }

        sc.close();
    }

    public static void menu(Scanner sc) {
        int choice;

        do {
            System.out.println("\n1. Update Profile & Password");
            System.out.println("2. Start Exam");
            System.out.println("3. Logout");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    updateProfile(sc);
                    break;
                case 2:
                    startExam(sc);
                    break;
                case 3:
                    System.out.println("Logged Out Successfully!");
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);
    }

    public static void updateProfile(Scanner sc) {
        System.out.print("Enter new username: ");
        username = sc.nextLine();

        System.out.print("Enter new password: ");
        password = sc.nextLine();

        System.out.println("Profile Updated Successfully!");
    }

    public static void startExam(Scanner sc) {

        int score = 0;
        int answer;

        System.out.println("\nExam Started! You have limited time.");
        System.out.println("(Timer simulation: 30 seconds)");

        // Question 1
        System.out.println("\n1. Java is?");
        System.out.println("1. Programming Language");
        System.out.println("2. Coffee");
        System.out.println("3. Both");
        answer = sc.nextInt();
        if (answer == 3) score++;

        // Question 2
        System.out.println("\n2. OOP stands for?");
        System.out.println("1. Object Oriented Programming");
        System.out.println("2. Only One Program");
        System.out.println("3. None");
        answer = sc.nextInt();
        if (answer == 1) score++;

        // Question 3
        System.out.println("\n3. Which keyword is used to inherit class?");
        System.out.println("1. implement");
        System.out.println("2. extends");
        System.out.println("3. inherit");
        answer = sc.nextInt();
        if (answer == 2) score++;

        System.out.println("\nExam Finished!");
        System.out.println("Your Score: " + score + "/3");
    }
}