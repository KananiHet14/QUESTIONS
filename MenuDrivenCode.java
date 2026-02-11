/* 
    Make a menu driven program. The user can enter 2 numbers, either 1 or 0.
If the user enters 1 then keep taking input from the user for a student’s
marks(out of 100).
If they enter 0 then stop.
If he/ she scores :
Marks >=90 -> print “This is Good”
89 >= Marks >= 60 -> print “This is also Good”
59 >= Marks >= 0 -> print “This is Good as well”
Because marks don’t matter but our effort does
*/ 

import java.util.*; 


public class MenuDrivenCode {

    public static void main(String[] args) {
        // Code for menu driven program will go here

        Scanner sc = new Scanner(System.in);
        int choise;
        int marks;

        do {
            System.out.println("Enter 1 to Continue and 0 to Stop");
            choise = sc.nextInt();

            if(choise == 1) {
                System.out.println("Enter marks between 0 to 100");
                marks = sc.nextInt();

                if(marks >= 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if(marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if(marks >= 0 && marks <= 59) {
                    System.out.println("This is Good as well");
                } else {
                    System.out.println("Invalid Marks");
                }
            } else if(choise == 0) {
                System.out.println("Stopping the program");
            } else {
                System.out.println("Invalid Choise");
            }
        }while(choise != 0);

    }
}