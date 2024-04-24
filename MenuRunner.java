import java.util.Scanner;

public class MenuRunner {
    private Menu menu;
    private Scanner cin;

    public MenuRunner(Menu menu) {
        this.menu = menu;
        this.cin = new Scanner(System.in);
    }

    public void run() {
        boolean exit = false;
        while (!exit) {
            menu.display();
            int choice = cin.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("You chose Option 1");
                    break;
                case 2:
                    System.out.println("You chose Option 2");
                    break;
                case 3:
                    System.out.println("You chose Option 3");
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
        cin.close();
    }
}