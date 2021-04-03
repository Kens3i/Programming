import java.util.Scanner;

class Stack
{
    int top, c=0,j=0;
    int maxsize = 100;
    int arr[] = new int[maxsize];
    int arr2[] = new int[maxsize];


    boolean push (Scanner sc)
    {
        if(top == maxsize-1)
        {
            System.out.println("Overflow !!");
            return false;
        }
        else
        {
            System.out.println("Enter Value");
            int val = sc.nextInt();
            top++;
            arr[top]=val;
            System.out.println("Item pushed");
            return true;
        }
    }
    boolean pop ()
    {
        if (top == 0)
        {
            System.out.println("Underflow !!");
            return false;
        }
        else
        {
            System.out.println("Item popped "+arr[top]);
            arr2[j++]=arr[top];
            top --;
            c++;
            return true;
        }
    }
    void display ()
    {
        System.out.println("Showing Elements In Stack");
        for(int i = top; i>0;i--)
        {
            System.out.println(arr[i]);
        }
    }
    void popdisp()
    {
        System.out.println("Printing Popped Elements .....");
        for(int i = 0; i<c;i++)
        {
            System.out.print(" "+arr2[i]+" ");
        }
    }
}

public class StackOperation {
    public static void main(String[] args) {
        int choice=0;
        Scanner sc = new Scanner(System.in);
        Stack s = new Stack();
        System.out.println("Stack Operations\n");
        while(choice != 4)
        {
            System.out.println("\nChose one\n");
            System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit\n5.Pop Display");
            System.out.println("\n Enter your choice \n");
            choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                {
                    s.push(sc);
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
                case 4:
                {
                    System.out.println("Exiting....");
                    System.exit(0);
                    break;
                }
                case 5:
                {
                    s.popdisp();
                    break;
                }
                default:
                {
                    System.out.println("Please Enter valid choice ");
                }
            }
        }
    }
}