import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This program is a game in which the user has to guess what the number on a
 * dice is.
 *
 * @author Ioana Marinescu
 * @version 1.0
 * @since 2024-03-04
 */

public final class BoardFoot {
  /** Private constructor to prevent instantiation of this utility class. */
  private BoardFoot() {
    // 
  }

  /**
   * Calculates the length of a board foot
   * 
   * @param width  The width of the wood.
   * @param height The height of the wood.
   * @return The board foot length of wood.
   */
  public static float calcBoardFoot(float width, float height) {
    // constants
    final int VOLUME = 144;

    // calculation of length
    return (VOLUME) / (width * height);
  }

  /**
   * The main method prints a stylish greeting message.
   *
   * @param args Command-line arguments (not used in this program)
   */
  public static void main(final String[] args) {
    // introductory message
    System.out.println();
    System.out.print("Welcome to board foot program! This program");
    System.out.println(" will take a width and height (inches only) and tell you how");
    System.out.println("long the board should be.");
    System.out.println();
    // imports scanner
    final Scanner scanner = new Scanner(System.in);

    try {
      // gets user input for height
      System.out.print("Enter height: ");
      final float height = scanner.nextFloat();
      // gets user input for width
      System.out.print("Enter width: ");
      final float width = scanner.nextFloat();

      // close scanner
      scanner.close();

      // if user enters a negative input
      if (height <= 0 || width <= 0) {
        throw new Exception();
      }

      // calling the function that calculates the length
      final float length = calcBoardFoot(width, height);

      // display to user
      System.out.format("The length of the plank is %.2f inches", length);
      System.out.println();

      // exceptions (catching errors)
    } catch (InputMismatchException error) {
      System.out.println("Please enter a valid number.");
    } catch (Exception error) {
      System.out.println("Please enter a positive number.");
    }
  }
}
