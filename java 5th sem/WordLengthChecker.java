import java.util.Scanner;

public class WordLengthChecker {
  public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a word:");
      String word = sc.nextLine();

      if (word.length() == 5) {
        System.out.println("The word has a length of 5.");
      } else {
        System.out.println("The word does not have a length of 5.");
      }
    }
  }
}