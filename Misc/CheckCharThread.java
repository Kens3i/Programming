import java.util.Scanner;
class Upper extends Thread
{
    char a;
    Upper(char a)
    {
        this.a = a;
    }
    public void run()
    {
        if (a>=65 && a<=90)
            System.out.println(a+" is Upper Case Character");
    }
}
class Lower extends Thread
{
    char a;
    Lower(char a)
    {
        this.a = a;
    }
    public void run()
    {
        if (a>=97 && a<=122)
            System.out.println(a+" is Lower Case Character");
    }
}

class Digit extends Thread
{
    char a;
    Digit(char a)
    {
        this.a = a;
    }
    public void run()
    {
        if (a>=48 && a<=57)
            System.out.println(a+" is Digit");
    }
}
class Symbol extends Thread
{
    char a;
    Symbol(char a)
    {
        this.a = a;
    }
    public void run()
    {
        if (a>=32 && a<=47)
            System.out.println(a+" is Special Chracter/Symbol");
    }
}

public class CheckCharThread {
    public static void main(String[] args)
    {
        char c;
        Scanner in = new Scanner(System.in);
        c = in.next().charAt(0);
        new Upper(c).start();
        new Lower(c).start();
        new Digit(c).start();
        new Symbol(c).start();
    }
}
