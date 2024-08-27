public class BankAccount {
    //creating account
    private String accName;
    private int accno;
    private int balance;
    public BankAccount(String accName,int accno,int balance){
        this.accName = accName;
        this.accno = accno;
        this.balance = balance;
    }

    public void deposit(int money){
        balance += money;
        System.out.print("Rupees "+money+" added sucessfully. Total = "+balance);
        return;
    }

    public void withDraw(int money){
        if(balance-money >=100){
            balance -= money;
            System.out.print("Rupees "+money+" is taken. Remaining "+balance);
        }
      else{
            System.out.println("Insufficient balance. 100 is margianal amount");
        }
        return;
    }

    public void getBalance(){
        System.out.print("Your account balance is "+balance);
        return;
    }
}
