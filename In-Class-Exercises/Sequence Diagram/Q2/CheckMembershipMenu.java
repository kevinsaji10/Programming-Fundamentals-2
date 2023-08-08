import java.util.Scanner;

public class CheckMembershipMenu {
    private CheckMembershipCtrl ctrl;

    public CheckMembershipMenu(CheckMembershipCtrl ctrl) {
        this.ctrl = ctrl;
    }

    public void display() {
        System.out.println("== Team Management System ==");
        System.out.println("1. Check student's team enrolment");
        System.out.println("2. Quit Application");
        System.out.print("Please enter your choice: ");
    }

    public void readOption() {
        Scanner sc = new Scanner(System.in);

        int choice;
        do {
            display();
            choice = sc.nextInt();
            switch (choice) {
                case 1 :
                    checkMembershipDuration();
                    break;
                case 2 :
                    System.out.println("bye bye");
                    break;
                default :
                    System.out.println("Enter a choice between 1 to 2");
            }
        } while (choice != 2);
    }

    // complete the checkMembershipDuration method here
    public void checkMembershipDuration() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student name: ");
        String name = sc.nextLine();
        System.out.print("Enter the team's name: ");
        String team = sc.nextLine();
        ctrl = new CheckMembershipCtrl();
        int duration = ctrl.checkMembershipDuration(name, team);
        if (duration == 0) {
            System.out.println(name + " joined the team when the team is formed.");
        } else if (duration == -1) {
            System.out.println(name + " is not in the team " + team + ".");
        } else {
            System.out.println(name + " joined the team " + duration + " days after the team is formed.");
        }
        

    }
}