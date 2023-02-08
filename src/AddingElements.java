import java.util.*;

public class AddingElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jessica");
        names.add("Abby");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");
        names.add("Sofia");
        names.add("Tim");
        names.add("James");
        names.add("Jim");

        System.out.println("BEFORE: " + names);

        for (int idx = 0; idx < names.size(); idx++) {
            if (names.get(idx).contains("i")) {
                names.add(idx + 1, "hi!");
                idx++;
            }
        }

        System.out.println("AFTER: " + names);
    }
}
