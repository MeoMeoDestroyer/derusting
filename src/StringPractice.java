import java.util.ArrayList;
import java.util.List;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable
    String word = "Kate";
    // Find the length of the string
    int length = word.length();
    System.out.println("Length are " + length);
    // Concatenate (add) two strings together and reassign the result
    word = word + " Nguyen";
    System.out.println("Concatenated: " + word);
    // Find the value of the character at index 3
    char charAtThree = word.charAt(3);
    System.out.println("Char at index 3: " + charAtThree);
    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)
    boolean haveAte = word.contains("ate");
    System.out.println("Contains 'ate': " + haveAte);
    // Iterate over the characters of the string, printing each one on a separate line
    for (int i = 0; i < word.length(); i++) {
      System.out.println(word.charAt(i));
    }
    // Create an ArrayList of Strings and assign it to a variable
    List<String> words = new ArrayList<>();
    // Add multiple strings to the List (OK to do one-by-one)
    words.add("milk");
    words.add("banana");
    words.add("chicken");
    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joined = String.join(", ", words);
    System.out.println("Joined here " + joined);
    // Check whether two strings are equal
    String s1 = "hehe";
    String s2 = "hehe";
    boolean areEqual = s1.equals(s2);
    System.out.println("Are equal: " + areEqual);
    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
