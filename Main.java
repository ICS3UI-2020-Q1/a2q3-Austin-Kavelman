import java.util.Scanner;

/**
 * This program corrects the order of multiple numbers
 * @author Austin Kavelman
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Enter line that asks the user to enter an interger
    System.out.println("Please enter an interger:");
    int a = input.nextInt();

    //Enter line that asks the user to enter another interger
    System.out.println("Please enter another interger:");
    int b = input.nextInt();

    //Sorts the numbers in acending order
    if (a > b) {
    System.out.println("Your numbers in ascending order are " + b + ", " + a); 
    } else if (a < b) {
    System.out.println("Your numbers in ascending order are " + a + ", " + b);
    }
  }
}
