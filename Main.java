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
        int[][] multiArr = new int [11][11];
        for (int i = 0; i < 11; i++)
        {
          System.out.print(ConsoleColors.YELLOW + "\n");
          System.out.printf("%5d", i);
          System.out.print(ConsoleColors.RESET);
          for (int z = 1; z < 11; z++)
          {
            if (i == 0)
            {
              System.out.print(ConsoleColors.YELLOW);
              System.out.printf("%5d", z);
              System.out.print(ConsoleColors.RESET);
            }
            else
            {
              multiArr[i][z] = i*z;
              if (i == z)
              {
                System.out.print(ConsoleColors.RED);
                System.out.printf("%5d", multiArr[i][z]);
                System.out.print(ConsoleColors.RESET);
              }
              else
              {
                System.out.printf("%5d", multiArr[i][z]);
              }
            }
          }
        }
        break;
      case '2': // case for addition table
        for (int i = 0; i < 101; i = i+10)
        {
          System.out.print(ConsoleColors.YELLOW + "\n");
          System.out.printf("%5d", i);
          System.out.print(ConsoleColors.RESET);
          for (int z = 1; z < 11; z++)
          {
            if (i == 0)
            {
              System.out.print(ConsoleColors.YELLOW);
              System.out.printf("%5d", z);
              System.out.print(ConsoleColors.RESET);
            }
            else
            {
              System.out.printf("%5d", i+z);
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
        for (int i = 0; i < 11; i++)
        {
          System.out.print(ConsoleColors.YELLOW + "\n");
          System.out.printf("%5d", i);
          System.out.print(ConsoleColors.RESET);
          for (int z = 1; z < 11; z++)
          {
            if (i == 0)
            {
              System.out.print(ConsoleColors.YELLOW);
              System.out.printf("%5d", z);
              System.out.print(ConsoleColors.RESET);
            }
            else
            {
              if (i == z)
              {
                System.out.print(ConsoleColors.RED);
                System.out.printf("%5d", z%i);
                System.out.print(ConsoleColors.RESET);
              }
              else
              {
                System.out.printf("%5d", z%i);
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
