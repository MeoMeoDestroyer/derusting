import java.util.HashSet;
import java.util.Set;

public class SetPractice {
  public static void main(String[] args) {
    // Create a HashSet of Strings and assign it to a variable of type Set
    Set<String> colors = new HashSet<>();
    // Add 3 elements to the set
    // (It's OK to do it one-by-one)
    colors.add("White");
    colors.add("Black");
    colors.add("Blue");
    // Check whether the Set contains a given String
    boolean hasBlue = colors.contains("Blue");
    System.out.println("We have blue right? " + hasBlue);
    // Remove an element from the Set
    colors.remove("White");
    System.out.println("After remove white " + colors);
    // Get the size of the Set
     int size = colors.size();
    System.out.println("Size: " + size);
    // Iterate over the elements of the Set, printing each one on a separate line
    for (String color : colors) {
      System.out.println(color);
    }
    /*
     * Warning!
     * 
     * The iteration order over the items in a HashSet is NOT GUARANTEED.
     * 
     * Even running the exact same program multiple times may give different results.
     * Do not use a HashSet if order is important! You can use a TreeSet if you
     * want items in sorted order, or an array or List if you want them in a specified
     * order.
     * 
     * Also remember that sets do NOT have duplicates.
     */
  }
}
