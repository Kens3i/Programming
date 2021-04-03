import java.util.Scanner;

public class PrimeNo
{
    public static void main (String[] args)
    {
        int limit = new Scanner(System.in).nextInt();
        int i =0;
        int num =0;

        String  primeNumbers = "";

        for (i = 1; i <= limit; i++)
        {
            int c=0;
            for(num =i; num>=1; num--)
            {
                if(i%num==0)
                {
                    c = c + 1;
                }
            }
            if (c ==2)
            {
                //Appended the Prime number to the String
                primeNumbers = primeNumbers + i + " ";
            }
        }
        System.out.println("Nos. Are :");
        System.out.println(primeNumbers);
    }
}

