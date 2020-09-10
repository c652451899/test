import java.util.*;
public class Retirement
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      System.out.print("要攒多少钱");
      double goal = in.nextDouble();

      System.out.print("每年初存多少钱");
      double payment = in.nextDouble();

      System.out.print("银行利率 %: ");
      double interestRate = in.nextDouble();

      double balance = 0;
      int years = 0;
      while (balance < goal)
      {
         balance += payment;
         double interest = balance * interestRate / 100;
         balance += interest;
         years++;
      }

      System.out.println("要攒 " + years + " 年.");
   }
}
