class Add extends Thread
{
    int a, b;
    Add(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Addition Of 2 No=" + (a + b));
    }
}

class Subtract extends Thread
{
    int a, b;
    Subtract(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Subtraction Of 2 No=" + (a - b));
    }
}

class Multiply extends Thread
{
    int a, b;
    Multiply(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Multiplication Of 2 No=" + (a * b));
    }
}

class Division extends Thread
{
    int a, b;
    Division(int a, int b)
    {
        this.a = a;
        this.b = b;
    }
    public void run()
    {
        System.out.println("Division of 2 No.=" + (a / b));
    }
}

public class CalculatorThread
{
    public static void main(String[] args)
    {
        new Subtract(2, 1).start();
        new Add(1, 4).start();
        new Multiply(2, 1).start();
        new Division(10, 5).start();
    }
}
