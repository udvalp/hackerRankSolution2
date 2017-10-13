import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      while(testCases>0){
         String pattern = in.nextLine();
             //Write your code
          try{
              //Pattern.Compile() method would try to compile the incoming string, in case of error it will throw an exception which will be caught by the catch block further below
              Pattern.compile(pattern);
              System.out.println("Valid");
              continue;
              
          }
          catch (PatternSyntaxException e){
              System.out.println("Invalid");
          }
      }
   }
}