//import java.util.*;
class Atm
{
    public static void displayBal(int balance)
    {
        System.out.println("Current Balance : "+balance);
        System.out.println();
    }
    public static int amtWithDraw(int balance,int withdrawAmount)
    {
        System.out.println("Withdrawn Operation: ");
        System.out.println("Withdrawing Amount: "+withdrawAmount);
        if (balance >= withdrawAmount)
        {
            balance = balance - withdrawAmount;
            System.out.println("Please collect your money and collect the card");
            displayBal(balance);
        }
        else {
            System.out.println("Sorry! Insufficient Funds");
            System.out.println();
        }
        return balance;
     }
     public static int amountDeposit(int balance, int depositAmt)
     {
         System.out.println("Deposit Operation:");
         System.out.println("Depositing Amount : "
                 + depositAmt);
         balance = balance + depositAmt;
         System.out.println(
                 "Your Money has been successfully deposited");
         displayBal(balance);
         return balance;
     }
    public static void main(String[] args)
    {
        int balance = 10000;
        int withdrawAmount = 5000;
        int depositAmount = 2000;

        displayBal(balance);

        balance = amtWithDraw(balance, withdrawAmount);

        balance = amountDeposit(balance, depositAmount);
    }
}
