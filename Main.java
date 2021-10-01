import java.util.Scanner;
//Wow factor: for table placeholers, i have colored them for better view
//Wow factor: for the pascal triangle, I found 
class ConsoleColors { //class for Colors
  // Reset
  public static final String RESET = "\033[0m"; // Text Reset

  // Regular Colors
  public static final String BLACK = "\033[0;30m"; // BLACK
  public static final String RED = "\033[0;31m"; // RED
  public static final String GREEN = "\033[0;32m"; // GREEN
  public static final String YELLOW = "\033[0;33m"; // YELLOW
  public static final String BLUE = "\033[0;34m"; // BLUE
  public static final String PURPLE = "\033[0;35m"; // PURPLE
  public static final String CYAN = "\033[0;36m"; // CYAN
  public static final String WHITE = "\033[0;37m"; // WHITE
}

class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean[] conditions1 = { true, true, false, false };// boolean/char arrays declaration and defintion for AND and OR tables
    boolean[] conditions2 = { true, false, true, false };
    char[] sign1 = { 'T', 'T', 'F', 'F' };
    char[] sign2 = { 'T', 'F', 'T', 'F' };
    char userSelection;
    while (0<1)
    {
    System.out.print("\n");
    System.out.println(
        "Welcome to the Math/Engineering Information Centre: Would you like to view \n 1. Multiplication Table \n 2. Addition Table \n 3. Logic Table for AND Gate \n 4. Logic Table for OR Gate \n 5. Remainder Table \n 6. Pascal Triangle \n Press '7' to exit the program");
    try //to prevent the error of having a 0 lengthed input
    {
      userSelection = input.nextLine().charAt(0);
    }
    catch (Exception e)
    {
      userSelection = 'Z';
    }
    switch (userSelection) {
      case '1': // Multiplication Table
        // Creating 2D array (Challenge)
        int[][] multiplicationArray = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 },{ 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }, { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };
        System.out.print("  ");
        // Horizontal Line Top Creation
        for (int i = 0; i < 10; i++) {
          System.out.print(ConsoleColors.YELLOW + "   " + multiplicationArray[i][i] + ConsoleColors.RESET);
        }
        // Vertical Line Creation
        for (int x = 0; x < 10; x++) {
          System.out.print(ConsoleColors.YELLOW + "\n " + multiplicationArray[x][x] + "  " + ConsoleColors.RESET);
          for (int i = 0; i < 10; i++){ // Digits After placeholder
            if (x != 9) // Check if not in 10s
            {
              if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 10) // check number of digits
              {
                if (multiplicationArray[x][x] == multiplicationArray[i][i]) // check for perfect square
                {
                  System.out.print(ConsoleColors.RED + " " + (multiplicationArray[x][x] * multiplicationArray[i][i])
                      + "  " + ConsoleColors.RESET);
                } else // if not perfect square
                {
                  System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  ");
                }
              } else // check for number of digits
              {
                if (multiplicationArray[x][x] == multiplicationArray[i][i]) // check for perfect square
                {
                  System.out.print(ConsoleColors.RED + " " + (multiplicationArray[x][x] * multiplicationArray[i][i])
                      + " " + ConsoleColors.RESET);
                } else // if not perfect square
                {
                  System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + " ");
                }
              }
            } else // not in 10s
            {
              if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 100) // check for perfect sqaure and less then 100
              {
                System.out.print("" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  ");
              } else // if equal to 100
              {
                System.out.print(ConsoleColors.RED + "" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  "
                    + ConsoleColors.RESET);
              }
            }
          }
        }
        break;
      case '2': // case for addition table
        System.out.println();
        System.out.print("   ");
        for (int i = 0; i < 11; i++) // printing horziontal top line
        {
          System.out.print(ConsoleColors.YELLOW + "   " + i + "   " + ConsoleColors.RESET);
        }

        for (int i = 0; i < 101; i = i + 10) // pritning vertical side line
        {
          System.out.print(ConsoleColors.YELLOW + "\n " + i + " " + ConsoleColors.RESET);
          for (int x = 0; x < 11; x++) // printing inner values
          {
            if (x + i < 10) // check for single digits
            {
              System.out.print("   " + (x + i) + "   ");
            } else if (x + i == 10 && i == 0) // check for space between 9 and 10
            {
              System.out.print("   " + (x + i) + "  ");
            } else if (x + i == 99) // check for space between 99 and 100
            {
              System.out.print("  " + (x + i) + "    ");
            } else if (x + i < 100 && x + i > 9) // check for double digits
            {
              System.out.print("  " + (x + i) + "   ");
            } else if (x + i > 99) // check for triple digits
            {
              if (i == 9) // check if in row 90
              {
                System.out.print("" + (x + i) + "");
              } else // if not in row 90
              {
                System.out.print(" " + (x + i) + "   ");
              }
            }
          }
        }
        break;
      case '3': // case for AND table
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "Condition 1" + "        " + "Condition 2" + "        " + "AND"
            + ConsoleColors.RESET); //outputting table placeholders
        for (int i = 0; i < 4; i++) { //outputting values
          System.out.print("\n     " + sign1[i] + "                  " + sign2[i] + "              ");
          if (conditions1[i] == true && conditions2[i] == true) { //or node
            System.out.print("T");
          } else {
            System.out.print("F");
          }
        }
        break;
      case '4': // case for OR table
        System.out.println();
        System.out.println(ConsoleColors.YELLOW + "Condition 1" + "        " + "Condition 2" + "        " + "OR"
            + ConsoleColors.RESET); //outputing table placeholders
        for (int i = 0; i < 4; i++) { //outputing values
          System.out.print("\n     " + sign1[i] + "                  " + sign2[i] + "              ");
          if (conditions1[i] == true || conditions2[i] == true) { //or node
            System.out.print("T");
          } else {
            System.out.print("F");
          }
        }
        break;
      case '5': // remainder table
        System.out.println();
        System.out.print("    ");
        for (int i = 1; i < 11; i++) { // outputting top row placeholder
          System.out.print(ConsoleColors.YELLOW + " " + i + "   " + ConsoleColors.RESET);
        }
        for (int i = 1; i < 11; i++) { // outputting vertical row placeholder
          System.out.print(ConsoleColors.YELLOW + "\n " + i + " " + ConsoleColors.RESET);
          for (int x = 1; x < 11; x++) { // outputting
            if (i == 10) { // if in 10 row
              if (x == i) { // if perfect remainder
                System.out.print(ConsoleColors.RED + " " + x % i + "   " + ConsoleColors.RESET);
              } else { // if not perfect remainder
                System.out.print(" " + x % i + "   ");
              }
            } else { // if not in 10 row
              if (x == i) { // if perfect remainder
                System.out.print(ConsoleColors.RED + "  " + x % i + "  " + ConsoleColors.RESET);
              } else { // if not perfect remainder
                System.out.print("  " + x % i + "  ");
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
          for (int x = 0; x < numofRows + 1 - counter; x++) {
            System.out.print("     "); // adding spacing
          }
          counter++;
          for (int x = 1; x < i + 1; x++) {
            System.out.printf("%10d", baseNum);
            baseNum = baseNum * (i - x) / x; // calculating output for next number
          }
          System.out.print("\n");
        }
        break;
      case '7':
        System.exit(0);
        break;
      default:
        System.out.println("ERROR: Bad Input");
      break;

    }

  }
  }

}
