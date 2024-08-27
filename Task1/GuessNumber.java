import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("press 1 to start Guess number game or 0 to exit");
            int n = sc.nextInt();
            if(n==1){
                System.out.println("You have 5 attempt to guess the magic  number");
                display(  game(5));
            }
            else{
                return;
            }
        }
    }

    //Game starts
    static int game(int attempt){
        Scanner st = new Scanner(System.in);
        Random rc = new Random();
        int magicNum = rc.nextInt(1,101);
        int count =10;

        while(count>0){
            System.out.println(" Enter your guess from 1 - 100 include both limit . you have "+ count + " attempt left  " );
            int guess = st.nextInt();

            if(magicNum > guess){
                System.out.println("your guess is less than magic number");
            }
            else if(magicNum < guess ) {
                System.out.println("your guess is greater than magic number");
            }

            if(magicNum == guess){
                System.out.println("Hurrah your guess is correct");
                return count;
            }
            count--;
        }
        System.out.println("Sorry,the magic number is "+magicNum);
        return 0;
    }

    //Display the points of player
    static void display(int n){
        System.out.println("Your score is "+ n*10);
    }
}

