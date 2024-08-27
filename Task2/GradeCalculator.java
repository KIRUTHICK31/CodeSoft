import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
       gradeFind();
    }
    public static void gradeFind(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of subjects");
        int num = sc.nextInt();
        int total = 0;
        int i =0;

        while(i<num){
            System.out.println("Enter mark obtain in Subject"+(i+1));
            total += sc.nextInt();
            i++;
        }

        System.out.println("your totalmark is "+total+"/"+(num*100));
        int grade =(total/num);
        System.out.println("Your average percentage is  "+grade+"%");

        if(grade>35 && grade <= 50) System.out.println("Your grade is 'C'");
        else if(grade>50 && grade <=70) System.out.println("Your grade is 'B'");
        else if(grade>70 && grade <=90) System.out.println("Your grade is 'A'");
        else if(grade>90) System.out.println("Your grade is 'O'");
        else System.out.println("You are failed");

            }
}
