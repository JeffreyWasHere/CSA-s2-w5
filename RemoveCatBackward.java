import java.util.ArrayList;

public class RemoveCatBackward {
        public static void main(String[] args) {
            // What happen if you loop through the arraylist backwards?
            // Rewrite the code but now instead of i++, do i--
            // Does doing this solve the problem?
            ArrayList<String> ArrayList = new ArrayList<String>();
            ArrayList.add("cat");
            ArrayList.add("cat");
            ArrayList.add("dog");
            ArrayList.add("cat");
            ArrayList.add("cat");
            ArrayList.add("fish");

            for (int i = ArrayList.size() - 1; i >= 0; i--) {
                if ("cat".equals(ArrayList.get(i))) {
                    ArrayList.remove(i);
                    //i--;
                }
            }
            
            System.out.println("Buggy result: " + ArrayList);

        }
}
