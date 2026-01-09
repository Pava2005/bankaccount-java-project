/*cover-class,object,constructor,methods,encapsulation and stimulations#
flow-class,variables,constructor,methods,object,method calling,output#
public(class,constructor,method,object), private(variables)#
user values -->main method collects -->calls constructor -->store in the class# */

//create class(public allows access from outside the class)
public class bankaccount{ 

    //create variables(private is used to protect data)
    private String accountholdername;
    private int accountnumber;
    //double-decimal values
    private double balance;

    //create constructor
    public bankaccount(String name,int accNo,double bal){
        //name,accNo,bal-temp variables/parameters
        //this-current object
        this.accountholdername=name;
        this.accountnumber=accNo;
        this.balance=bal;
    }

    //create method(functions)
    public void deposit(double amount){
        balance += amount;
        System.out.println(" deposit balance:" + balance);
    }
    public void withdraw(double amount){
        balance -= amount;
        System.out.println("withdraw balance:" + balance);
    }
    public void checkbalance(){
        System.out.println("balance:" + balance);
    }
    public void displayaccountdetails(){
        System.out.println("name:" + accountholdername);
        System.out.println("balance:" + balance);
    }
//main function

    public static void main(String args[]){
        //object creation and constructor called
        bankaccount acc=new bankaccount("pavatharani",123456,100);
        //method calling
        acc.deposit(1000); //add amount
        acc.withdraw(500); //remove 500
        acc.checkbalance(); //current balance
        acc.displayaccountdetails(); //account details
    }
}
