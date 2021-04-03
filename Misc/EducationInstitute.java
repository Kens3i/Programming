import java.util.Scanner;

class Staff {
    String  name;
    int code;
    Staff(String name, int code){
        this.name=name;
        this.code=code;
    }
//    void printStaff(){
//        System.out.println("Name: "+name);
//        System.out.println("Code: "+code);
//    }
}
class Officer extends Staff{
    String grade;
    Officer(String name, int code, String grade){
        super(name,code);
        this.grade=grade;
    }
    void printOfficer(){
        System.out.println("Name: "+name);
        System.out.println("Code: "+code);
        System.out.println("Grade: "+grade);
    }
}
class Teacher extends Staff{
    String subject;
    Teacher(String name, int code, String subject){
        super(name,code);
        this.subject=subject;
    }
    void printTeacher()
    {
        System.out.println("Name: "+name);
        System.out.println("Code: "+code);
        System.out.println("Subject: "+subject);
    }
}
class Typist extends Staff{
    int speed;
    Typist(String name, int code, int speed){
        super(name,code);
        this.speed=speed;
    }
//    void printTypist()
//    {
//        System.out.println("Name: "+name);
//        System.out.println("Code: "+code);
//        System.out.println("Speed: "+speed);
//    }
}
class CasualTypist extends Typist{
    int DailyWage;
    CasualTypist(String name, int code, int speed, int DailyWage){
        super(name,code,speed);
        this.DailyWage=DailyWage;
    }
    void printCasualTypist(){
        System.out.println("Name: "+name);
        System.out.println("Code: "+code);
        System.out.println("Speed: "+speed);
        System.out.println("Daily Wage: "+DailyWage);
    }
}
class RegularTypist extends Typist{
    int remuneration;
    RegularTypist(String name, int code, int speed, int remuneration){
        super(name,code,speed);
        this.remuneration=remuneration;
    }
    void printRegularTypist(){
        System.out.println("Name: "+name);
        System.out.println("Code: "+code);
        System.out.println("Speed: "+speed);
        System.out.println("Remuneration: "+remuneration);
    }
}
class EducationInstitute
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name: ");
        String name=sc.next();

        System.out.print("Enter Code: ");
        int code=sc.nextInt();

        System.out.print("Enter Grade: ");
        String grade=sc.next();

        System.out.print("Enter Subject: ");
        String subject=sc.next();

        System.out.print("Enter Speed: ");
        int speed=sc.nextInt();

        System.out.print("Enter Daily Wage: ");
        int DailyWage=sc.nextInt();

        System.out.print("Enter Remuneration: ");
        int remuneration=sc.nextInt();
        System.out.println();

        System.out.println("Officer");
        Officer[] o=new Officer[1];
        o[0]=new Officer(name,code,grade);
        o[0].printOfficer();
        System.out.println();

        System.out.println("Teacher");
        Teacher[] tch=new Teacher[1];
        tch[0]=new Teacher(name,code,subject);
        tch[0].printTeacher();
        System.out.println();

        System.out.println("Casual Typist");
        CasualTypist[] t=new CasualTypist[1];
        t[0]=new CasualTypist(name,code,speed,DailyWage);
        t[0].printCasualTypist();
        System.out.println();

        System.out.println("Regular Typist");
        RegularTypist[] r=new RegularTypist[1];
        r[0]=new RegularTypist(name,code,speed,remuneration);
        r[0].printRegularTypist();
        System.out.println();
    }
}