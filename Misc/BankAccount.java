import java.util.Scanner;

class Account{
    String name , acc_type;
    long acc_no;
    double interest , balance;

//    Account(String name , long acc_no , String acc_type){
//        this(name , acc_no , acc_type , 0);
//    }

    Account(String name , long acc_no , String acc_type , double interest){
        this.name     = name;
        this.acc_no   = acc_no;
        this.acc_type = acc_type;
        this.interest = interest;
        this.balance  = 0;
    }

    void balance(){
        System.out.println("Your current balance is : "+this.balance);
    }

    void deposit(double amount){
        this.balance += amount;
        System.out.println("Deposit is done successfully !");
    }

    void addInterest(){
        this.balance = this.balance + (this.balance * (this.interest / 100));
        System.out.println("Interest is added!");
    }

    void details(){
        System.out.printf("User details:\n===========================\nName : %s\nAccount no : %d\nAccount type : %s\nInterest Rate : %.2f %%\n",this.name,this.acc_no,this.acc_type,this.interest);
    }
}

class Savings extends Account{
    double penalty , min_balance;
    Savings(String name , long acc_no , String acc_type ){
        this(name , acc_no , acc_type , 10 , 100 , 1000);
    }

//    Savings(String name , long acc_no , String acc_type , double interest){
//        this(name , acc_no , acc_type , interest , 100 , 1000);
//    }
    Savings(String name , long acc_no , String acc_type , double interest , double penalty , double min_amount){
        super(name , acc_no , acc_type , interest);
        this.penalty     = penalty;
        this.min_balance = min_amount;
    }

    boolean have_min_balance(){
        if(super.balance < this.min_balance){
            //System.out.println("You don't have enough balance , please deposit money!");
            return false;
        }
        return true;
    }

    void withdrawl(double amount){
        if(this.have_min_balance() == false){
            System.out.println("You don't have enough balance to withdrawal!");
            return;
        }
        if(super.balance - amount < 0){
            System.out.println("You don't have enough balance to withdrawal!");
            return;
        }

        super.balance -= amount;
        System.out.println("Withdrawal successful!");
    }

    void check_min_balance(){
        if(this.have_min_balance() == false){
            System.out.println("You don't have enough balance , please deposit money!");
            super.balance -= this.penalty;
        }
        else{
            System.out.println("You have enough balance , don't worry !");
        }
    }
    void details(){
        super.details();
        System.out.printf("Min amount : %.2f\nPenalty : %.2f\nBalance : %.2f\n\n",this.min_balance , this.penalty , super.balance);
    }
}

class Current extends Account{
//    Current(String name , long acc_no , String acc_type ){
//        this(name , acc_no , acc_type , 2);
//    }

    Current(String name , long acc_no , String acc_type , double interest){
        super(name , acc_no , acc_type , interest);
    }
    void details(){
        super.details();
        System.out.printf("Current Balance : %.2f\n\n",super.balance);
    }

    void withdrawl(double amount){
        if(super.balance - amount < 0){
            System.out.println("You don't have enough balance to withdrawal!");
            return;
        }

        super.balance -= amount;
        System.out.println("Withdrawal successful!");
    }
}

class BankAccount
{
    public static void main(String[] args) {
        Savings a1 = new Savings("Koustav" , 65412 , "Savings");
        a1.details();

        int dep1, dep2, wid1, wid2;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Deposit amount:");
        dep1=sc.nextInt();

        a1.deposit(dep1);

        System.out.println("Enter Withdrawal amount:");
        wid1=sc.nextInt();
        a1.withdrawl(wid1);
        a1.balance();
        a1.addInterest();
        a1.balance();
        a1.check_min_balance();
        a1.balance();

        System.out.println("\n************************\n\n");

        Current a2 = new Current("Elon" , 59874 , "Current" , 3.5);
        a2.details();

        System.out.println("Enter Deposit amount:");
        dep2=sc.nextInt();
        a2.deposit(dep2);
        System.out.println("Enter Withdrawal amount:");
        wid2=sc.nextInt();
        a2.withdrawl(wid2);
        a2.balance();
    }
}