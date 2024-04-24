public class Main {
    public static void main(String[] args) {

        Menu menu = new Menu();
        menu.addOption(1, "Option 1");
        menu.addOption(2, "Option 2");
        menu.addOption(3, "Option 3");
        menu.addOption(0, "Exit");

        MenuRunner menuRunner = new MenuRunner(menu);
        menuRunner.run();
    }
}