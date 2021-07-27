package selenium;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        int assignmentNum = 1;

        while (assignmentNum != 0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Which assignment would you like to run? ");
            String msg = scanner.nextLine();
            assignmentNum = Integer.valueOf(msg);

            switch (assignmentNum) {
                case 0:
                    return;
                case 1:
                    Assignment1 assignment1 = new Assignment1();
                    assignment1.run();
                    break;
                case 2:
                    Assignment2 assignment2 = new Assignment2();
                    assignment2.run();
                    break;
                case 3:
                    Assignment3 assignment3 = new Assignment3();
                    assignment3.run();
                    break;
                default:
                    System.out.println("Please enter a valid assignment number.");
                    break;
            }
        }
    }
}
