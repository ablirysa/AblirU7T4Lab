import java.util.*;

public class RemovingElements {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jesse");
        names.add("Bart");
        names.add("David");
        names.add("Abigail");
        names.add("Frank");
        names.add("Steph");
        names.add("Tom");
        names.add("Jimmy");
        names.add("Joe");
        names.add("Klein");
        names.add("Daisy");

        System.out.println("BEFORE: " + names);

        for (int idx = 0; idx < names.size(); idx++) {
            if (names.get(idx).length() == 5) {
                names.remove(idx);
                idx--;
            }
        }

        System.out.println("AFTER: " + names);

    }
}
