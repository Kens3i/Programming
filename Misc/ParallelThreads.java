class Thread1 extends Thread
{
    public void run()
    {
        System.out.println("Started Thread A");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread A " + i);
        }

        System.out.println("Exit Thread A !!!");
    }
}

class Thread2 extends Thread
{
    public void run()
    {
        System.out.println("Started Thread B");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread B " + i);
        }

        System.out.println("Exit Thread B !!!");
    }
}

class Thread3 extends Thread
{
    public void run()
    {
        System.out.println("Started Thread C");

        for(int i = 1; i <= 5; i++)
        {
            System.out.println("Thread C " + i);
        }

        System.out.println("Exit Thread C !!!");
    }
}

public class ParallelThreads
{
    public static void main(String[] args)
    {
        new Thread1().start();
        new Thread2().start();
        new Thread3().start();
    }
}