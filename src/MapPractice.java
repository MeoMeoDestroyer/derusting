import java.util.HashMap;
import java.util.Map;

public class MapPractice {
  public static void main(String[] args) {
    // Create a HashMap with String keys and Integer values and
    // assign it to a variable of type Map
    Map<String, Integer> ages = new HashMap<>();
    // Put 3 different key/value pairs in the Map
    // (it's OK to do this one-by-one)
    ages.put("Kate", 25);
    ages.put("Le", 23);
    ages.put("Meomeo", 5);
    // Get the value associated with a given key in the Map
    int kateAge = ages.get("Kate");
    System.out.println("Kate's age: " + kateAge);
    // Find the size (number of key/value pairs) of the Map
    int size = ages.size();
    System.out.println("Size: " + size);
    // Replace the value associated with a given key (the size of the Map shoukld not change)
    ages.put("Le", 24);
    System.out.println("Le's updated age: " + ages.get("Le"));
    // Check whether the Map contains a given key
    boolean hasMeomeo = ages.containsKey("Meomeo");
    System.out.println("Contains meomeo': " + hasMeomeo);
    // Check whether the Map contains a given value
    boolean hasAge50 = ages.containsValue(50);
    System.out.println("Contains 30: " + hasAge50);
    // Iterate over the keys of the Map, printing each key
    for (String key : ages.keySet()) {
      System.out.println("Key: " + key);
    }
    // Iterate over the values of the map, printing each value
    for (int value : ages.values()) {
      System.out.println("Value: " + value);
    }
    // Iterate over the entries in the map, printing each key and value
    for (Map.Entry<String, Integer> entry : ages.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
    /*
     * Usage tip!
     * 
     * Maps are great when you want a specific key to value mapping.
     * Example: The key could be a person's name, and the value could be their phone number
     * 
     * However if your keys are simple ascending 0-indexed integers with no gaps
     * (0, 1, 2, 3, 4...) then an array or List is likely a better choice.
     * Example: If you want to store the order of songs in a playlist.
     * 
     * If you're finding that you're just wanting to store unordered values and the keys
     * are unimportant, a Set may be a better choice.
     * Example: If you want to hold the student ID numbers of everyone in a course,
     * and you don't care about any ordering.
     */
  }
}
