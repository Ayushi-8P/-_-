import java.util.*;
class num_guess
{
    public static void guessNum()
    {
        Scanner kb= new Scanner(System.in);
        int num = 1+ (int)(100*Math.random());
        int k=5;
        int i, guess;
        System.out.println("A number is choosen between 1 to 100");
        for(i=0; i<k; i++)
        {
            System.out.println("Guess the number: ");
            guess = kb.nextInt();

            if(num == guess)
            {
                System.out.println("Yaayy!!!"+"You guesssed the number");
                break;
            }
            else if (num > guess && i!=k-1)
            {
                System.out.println("The number is greater than "+ guess);
            }
            else if(num < guess && i!=k-1)
            {
                System.out.println("The number is less than "+guess);
            }
        }
        if(i==k)
        {
            System.out.println("You have exhausted"+"k trials.");
            System.out.println("The number was "+num);
        }
    }
    public static void main(String args[])
    {
        guessNum();
    }
}
