import java.util.*;

class Prime
{
    void PrimePrint(int n)
    {
        for(int i=1;i<=n;i++)
        {
            int cou = 0;
            //for(int j=i;j>=1;j--)
            for(int j=1;j<=i/2;j++)
            {
                if (i % j == 0)
                {
                    cou += 1;
                }
            }
            if(cou==1)
            {
                System.out.print(i + " ");
            }
        }
    }
}



class DoubleClassPrime extends Prime
{
    public static void main(String[] args)
    {
        Prime x=new Prime();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        x.PrimePrint(n);
    }
}