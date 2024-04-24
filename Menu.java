import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<Integer, String> options;

    public Menu() {
        this.options = new HashMap<>();
    }

    public void addOption(int key, String value) {
        this.options.put(key, value);
    }

    public void display() {
        System.out.println("Please select an option:");
        for (Map.Entry<Integer, String> entry : options.entrySet()) {
            System.out.println(entry.getKey() + ". " + entry.getValue());
        }
    }
}