public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4
    String[] favFruit = new String[4];
    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    favFruit[0] = "Pineapple";
    favFruit[1] = "Strawberry";
    favFruit[2] = "Mango";
    favFruit[3] = "Watermelon";
    // Get the value of the array at index 2
    String valuetwo = favFruit[2];
    System.out.println("value at index 2 are " + valuetwo);
    // Get the length of the array
    int length = favFruit.length;
    System.out.println("array length " + length);
    // Iterate over the array using a traditional for loop and print out each item
    for (int i =0; i < favFruit.length; i++) {
      System.out.println(favFruit[i]);
    }
    // Iterate over the array using a for-each loop and print out each item
    for (String fruit : favFruit) {
      System.out.println(fruit);
    }
    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
