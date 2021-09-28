import java.util.Scanner;

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
      int [][] multiplicationArray = {{1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}, {1,2,3,4,5,6,7,8,9,10}};
      System.out.print("  ");
      
      for (int i = 0; i < 10; i++)
      {
        System.out.print("   " + multiplicationArray[i][i]);
      }
      
      for (int x = 0; x < 10; x++)
      {
        System.out.print("\n " + multiplicationArray[x][x] + "  ");
        for (int i = 0; i < 10; i++)
        {
          if (x != 9)
          {
            if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 10)
            {
              System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  ");
            }
            else
            {
              System.out.print(" " + (multiplicationArray[x][x] * multiplicationArray[i][i]) + " ");
            }
          }
          else
          {
            if ((multiplicationArray[x][x] * multiplicationArray[i][i]) < 100)
            {
              System.out.print("" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  " );
            }
            else
            {
              System.out.print("" + (multiplicationArray[x][x] * multiplicationArray[i][i]) + "  " );
            }
          }
        
        }
      }
      
      
      
      



    }







  }
}
  
    