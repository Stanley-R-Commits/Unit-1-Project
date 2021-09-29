import java.util.Scanner;

class ConsoleColors {
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    // Regular Colors
    public static final String BLACK = "\033[0;30m";   // BLACK
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    public static final String WHITE = "\033[0;37m";   // WHITE
}

class Main
{
  public static void main(String[] args) 
  {
    Scanner input = new Scanner (System.in);
    System.out.println("Welcome to the Math/Engineering Information Centre: Would you like to view \n 1. Multiplication Table \n 2. Addition Table \n 3. Logic Table for AND Gate \n 4. Logic Table for OR Gate \n 5. Logarithmic Table \n 6. Pascal Triangle");
    int userSelection;
    userSelection = Integer.parseInt(input.nextLine());
    switch (userSelection)
    {
      case 1:
      //Creating 2D array (Challenge)
      int [][] multiplicationArray = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
      System.out.print("  ");
      //Horizontal Line Top Creation
      for (int i = 0; i < 10; i++)
      {
        System.out.print(ConsoleColors.YELLOW + "   " + multiplicationArray[i][i] + ConsoleColors.RESET);
      }
      // Vertical Line Creation
      for (int x = 0; x < 10; x++)
      {
        System.out.print(ConsoleColors.YELLOW + "\n " + multiplicationArray[x][x] + "  " + ConsoleColors.RESET);
        for (int i = 0; i < 10; i++) // Digits After placeholder
        {
          if (x != 9) //Check if not in 10s
          {
            if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 10) //check number of digits
            {
              if (multiplicationArray[x][x] == multiplicationArray[i][i])  //check for perfect square
              {
                System.out.print(ConsoleColors.RED + " " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  " + ConsoleColors.RESET);
              }
              else //if not perfect square
              {
                System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  ");
              }
            }
            else //check for number of digits
            {
              if (multiplicationArray[x][x] == multiplicationArray[i][i]) //check for perfect square
              {
                System.out.print(ConsoleColors.RED + " " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + " " + ConsoleColors.RESET);
              }
              else //if not perfect square
              {
                System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + " ");
              }
            }
          }
          else //not in 10s
          {
            if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 100) //check for perfect sqaure and less then 100
            {
              System.out.print("" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  " );
            }
            else // if equal to 100
            {
              System.out.print(ConsoleColors.RED + "" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  " + ConsoleColors.RESET);
            }
          }
        }
      }
      break;
      case 2: // case for addition table
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
          if (x+i < 10) //check for single digits
          {
            System.out.print("   " + (x+i) + "   ");
          }
          else if(x+i == 10 && i == 0) //check for space between 9 and 10
          {
            System.out.print("   " + (x+i) + "  ");
          }
          else if (x+i == 99) // check for space between 99 and 100
          {
            System.out.print("  " + (x+i) + "    ");
          }
          else if (x+i < 100 && x+i > 9) // check for double digits
          {
            System.out.print("  " + (x+i) + "   ");
          }
          else if (x+i > 99) // check for triple digits
          {
            if (i == 9) // check if in row 90
            {
              System.out.print("" + (x+i) + "");
            }
            else // if not in row 90
            {
              System.out.print(" " + (x+i) + "   ");
            }
          }
        }
      }
      break;
      case 3: // case for AND table

      

      
      
      
      



    }







  }
}
  
    