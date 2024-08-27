import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Make a DataBase for Available courses
        CourseDB data = new CourseDB();
       //Make a DataBase for StudentEnrollment
        StudentDB list = new StudentDB();
        //Standard Id generation
        int idGen =100;

        Scanner sc = new Scanner(System.in);
        //The display place
        while(true){
           Scanner inp = new Scanner(System.in);
            System.out.println("1.Register as Student   2.If you already Register  3.Exit");
            System.out.println("Enter 1 or 2 or 3");
            int option = sc.nextInt();
            if(option == 1){
                System.out.println("Enter your name ");
                String name = inp.nextLine();
                Student stu1 = new Student(++idGen,name);
                list.add(stu1);
            }
           else if(option == 2){
                System.out.println("Enter your Id");
                int tempID = sc.nextInt();
                //Get the student from Student database
                Student temp = list.get(tempID);
                //Choose for Register or withdraw
                System.out.println("Press 1 for Course Register");
                System.out.println("Press 2 for Course Withdraw");
                System.out.println("Press 3 for Course Availablilty");
                int press = inp.nextInt();
                //Register student with course
                if(press == 1){
                data.display();
                System.out.println("Enter the courseCode for your Course Registration");
                Scanner num = new Scanner(System.in);
                String courseCode = num.nextLine();
                temp.register(courseCode,data);

            }
                //Withdraw from registration
                else if(press == 2){
                    temp.withdraw();
                    
                }
                //Course Display
                else{
                    System.out.println();
                    data.display();
                }
            }
            //for exit
            else{
                return;
            }

        }



    }
}
