/*
Bank Account Management System

Concepts Used:
- Class and Object
- Constructor
- Methods
- Encapsulation
- Scanner
- Switch Case
- Do While Loop

Flow:
User Input -> Constructor -> Object Creation-> Menu Selection -> Method Call -> Output
*/

//bank account class
import java.util.Scanner;
public class bankaccount{ 

    //private variables
    private String accountholdername;
    private int accountnumber;
    //double-decimal values
    private double balance;

    //constructor
    public bankaccount(String name,int accNo,double bal){
        //name,accNo,bal-temp variables/parameters
        //this-current object
        this.accountholdername=name;
        this.accountnumber=accNo;
        this.balance=bal;
    }

    //methods
    public void deposit(double amount){
        balance += amount;
        System.out.println("deposit balance:" + balance);
    }

    public void withdraw(double amount){
    if(amount <= balance){
        balance -= amount;
        System.out.println("withdraw balance:" + balance);
    }
    else{
        System.out.println("Insufficient Balance");
    }
}

    public void checkbalance(){
        System.out.println("balance:" + balance);
    }
    
    public void displayaccountdetails(){
    System.out.println("name:" + accountholdername);
    System.out.println("account number:" + accountnumber);
    System.out.println("balance:" + balance);
}
//main method

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Holder Name:");
        String name=sc.nextLine();
        System.out.println("Enter Account Number:");
        int accNo=sc.nextInt();
        System.out.println("Enter Initial Balance:");
        double bal=sc.nextDouble();
        //object creation and constructor called
        bankaccount acc=new bankaccount(name, accNo, bal);
        int choice;

do {
    System.out.println("\n===== BANK MENU =====");
    System.out.println("1. Deposit");
    System.out.println("2. Withdraw");
    System.out.println("3. Check Balance");
    System.out.println("4. Account Details");
    System.out.println("5. Exit");

    System.out.print("Enter Choice: ");
    choice = sc.nextInt();
    
    //switch case
    switch(choice){

        case 1:
            System.out.print("Enter Deposit Amount: ");
            double dep = sc.nextDouble();
            acc.deposit(dep);
            break;

        case 2:
            System.out.print("Enter Withdraw Amount: ");
            double wit = sc.nextDouble();
            acc.withdraw(wit);
            break;

        case 3:
            acc.checkbalance();
            break;

        case 4:
            acc.displayaccountdetails();
            break;

        case 5:
            System.out.println("Thank You");
            break;

        default:
            System.out.println("Invalid Choice");
    }

} while(choice != 5);

sc.close();
    }
}
