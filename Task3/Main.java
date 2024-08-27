public class Main {
    public static void main(String[] args) {
        BankAccount user1 = new BankAccount("Kiruthick",3132001,200);
        BankAccount user2 = new BankAccount("Rahul",1522005,300);
        AtmMachine atm = new AtmMachine(user1);
        atm.display();
    }
}