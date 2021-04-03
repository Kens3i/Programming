import java.util.Scanner;

class Insertion
{
    void Sort(int a[])
    {
        int i,j,p,temp;
        int n=a.length;
        for (i = 1;i < n; i++)
        {

            for (j=i-1; j >=0 ; j--)
            {
                if(a[j+1]<a[j])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    void printarray(int a[])
    {
        for(int i=0; i < a.length; i++)
        {
            System.out.print(a[i]+" ");
        }
    }

}

public class InsertionSort
{
    public static void main(String[] args)
    {
        Insertion ins = new Insertion();
        int n, res,i;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements in the array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" elements ");
        for( i=0; i < n; i++)
        {
            a[i] = s.nextInt();
        }

        System.out.println( "Elements in array ");
        ins.printarray(a);
        ins.Sort(a);

        System.out.println( "\nElements After Applying Insertion Sort");
        ins.printarray(a);

    }
}
