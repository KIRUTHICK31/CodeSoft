import java.util.Scanner;

public class AtmMachine {
    private BankAccount user;
    //Giving account name to the atm first
    public AtmMachine(BankAccount user){
        this.user = user;
    }
    Scanner sc = new Scanner(System.in);
public void display(){
    System.out.println("Press 1: Deposit\t     Press 2: Withdrawal");
    System.out.println("Press 3: CheckBalance\t Press 4: Cancel");
    int option = sc.nextInt();
    if(option ==1){
        System.out.println("Enter the Deposit amount");
        int amount = sc.nextInt();
        user.deposit(amount);
    }
    else if(option == 2){
        System.out.println("Enter the withdraal amount");
        int amount = sc.nextInt();
        user.withDraw(amount);
    }
    else if(option == 3){
        user.getBalance();
    }
    else{
        return;
    }
}
}
