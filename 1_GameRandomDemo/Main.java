import java.util.*;

public class Main {
  public static void main(String[] args_not_in_use) {
    try (Scanner keyboard = new Scanner(System.in)) {
      System.out.print(
          "\n--Game random demo. Please, input an integer from 1 to 2147483646: ");

      int received_number;
      int result_number;
      received_number = keyboard.nextInt();
      result_number = received_number + 1;

      System.out.print("\n  You number is: " + received_number
          + "\n  My number is: " + result_number
          + "\n  Sorry, you lost. I won. The game is over.\n");
    }
  }
}