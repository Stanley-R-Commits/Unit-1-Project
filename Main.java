import java.util.Scanner;
import java.lang.Math;
//Wow factor: for table placeholers, i have colored them for better view
//Wow factor: for the using the spacing function like %5d for proper spacing instead of manually adding sapces
//Wow factor: I used a try and catch statement to prevent errors when inputing an answer

class ConsoleColors { // class for Colors
  public static final String RESET = "\033[0m"; // Text Reset
  public static final String RED = "\033[0;31m"; // RED
  public static final String YELLOW = "\033[0;33m"; // YELLOW
}
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean[] conditions1 = { true, true, false, false };// boolean arrays declaration and defintion for AND and OR table
    boolean[] conditions2 = { true, false, true, false };
    char userSelection;
    while (0 < 1) { //while loop for looping program
      System.out.print("\n");
      System.out.println(
          "Welcome to the Math/Engineering Information Centre: Would you like to view \n 1. Multiplication Table \n 2. Addition Table \n 3. Logic Table for AND Gate \n 4. Logic Table for OR Gate \n 5. Remainder Table \n 6. Pascal Triangle \n Enter '7' to exit the program");
      try // to prevent the error of having a 0 lengthed input
      {
        userSelection = input.nextLine().charAt(0);
      } catch (Exception e) {
        userSelection = 'Z';
      }
      switch (userSelection) {
        case '1': // Multiplication Table
          int[][] multiArr = new int[11][11]; //2D Array
          for (int i = 0; i < 11; i++) { //Starting Row Number Loop
            System.out.print(ConsoleColors.YELLOW + "\n");
            System.out.printf("%5d", i);
            System.out.print(ConsoleColors.RESET);
            for (int z = 1; z < 11; z++) { //Rest of Row Loop
              if (i == 0) { //if row 1
                System.out.print(ConsoleColors.YELLOW);
                System.out.printf("%5d", z);
                System.out.print(ConsoleColors.RESET);
              } else { //if not row 1
                multiArr[i][z] = i * z;
                if (Math.sqrt(i*z) == (int)Math.sqrt(i*z)) { //if perfect square
                  System.out.print(ConsoleColors.RED);
                  System.out.printf("%5d", multiArr[i][z]);
                  System.out.print(ConsoleColors.RESET);
                } else { //not perfect square
                  System.out.printf("%5d", multiArr[i][z]);
                }
              }
            }
          }
          break;
        case '2': // case for addition table
          for (int i = 0; i < 101; i = i + 10) {
            System.out.print(ConsoleColors.YELLOW + "\n");
            System.out.printf("%5d", i);
            System.out.print(ConsoleColors.RESET);
            for (int z = 1; z < 11; z++) {
              if (i == 0) {
                System.out.print(ConsoleColors.YELLOW);
                System.out.printf("%5d", z);
                System.out.print(ConsoleColors.RESET);
              } else {
                System.out.printf("%5d", i + z);
              }
            }
          }
          break;
        case '3': // case for AND table
          System.out.println();
          System.out.println(ConsoleColors.YELLOW + "Condition" + "   " + "Condition" + "   " + "AND"
              + ConsoleColors.RESET); // outputting table placeholders
          for (int i = 0; i < 4; i++) { // outputting values
            System.out.print("\n" + conditions1[i] + "\t\t" + conditions2[i] + "\t\t");
            if (conditions1[i] && conditions2[i]) { // and node
              System.out.print("true");
            } else {
              System.out.print("false");
            }
          }
          break;
        case '4': // case for OR table
          System.out.println();
          System.out.println(ConsoleColors.YELLOW + "Condition" + "   " + "Condition" + "   " + "OR"
              + ConsoleColors.RESET); // outputting table placeholders
          for (int i = 0; i < 4; i++) { // outputting values
            System.out.print("\n" + conditions1[i] + "\t\t" + conditions2[i] + "\t\t");
            if (conditions1[i] || conditions2[i]) { // or node
              System.out.print("true");
            } else {
              System.out.print("false");
            }
          }
          break;
        case '5': // remainder table
          System.out.print("Column = Dividend, Row = Divisor");
          for (int i = 0; i < 11; i++) {//loop for column
            System.out.print(ConsoleColors.YELLOW + "\n");
            System.out.printf("%5d", i);
            System.out.print(ConsoleColors.RESET);
            for (int z = 1; z < 11; z++) { //loop for row
              if (i == 0) { //if a placeholder row
                System.out.print(ConsoleColors.YELLOW);
                System.out.printf("%5d", z);
                System.out.print(ConsoleColors.RESET);
              } else { //if not a placeholder row
                if (z%i == 0) { //if perfect remainder
                  System.out.print(ConsoleColors.RED);
                  System.out.printf("%5d", z % i);
                  System.out.print(ConsoleColors.RESET);
                } else { //if not perfect remainder
                  System.out.printf("%5d", z % i);
                }
              }
            }
          }
          break;
        case '6': // pascal triangle
          int numofRows;
          int baseNum = 1;
          int counter = 0;
          System.out.println(" \nHow many rows would you like? ");
          numofRows = Integer.parseInt(input.nextLine());
          for (int i = 1; i < numofRows + 1; i++) // outputing row
          {
            baseNum = 1;
            for (int x = 0; x < numofRows + 1 - counter; x++) { //loop for column
              System.out.print("     "); // adding spacing
            }
            counter++;
            for (int x = 1; x < i + 1; x++) {
              System.out.printf("%10d", baseNum); //loop for row
              baseNum = baseNum * (i - x) / x; // calculating output for next number
            }
            System.out.print("\n");
          }
          break;
        case '7': //case for exiting program
          System.exit(0);
          break;
        default: //case for bad input
          System.out.println("ERROR: Bad Input");
          break;
      }
    }
  }
}
