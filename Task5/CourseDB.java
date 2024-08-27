import javax.security.auth.Subject;
import java.util.ArrayList;

public class CourseDB {
    public ArrayList<Subjects> subject;
    Subjects Ece = new Subjects("1ECE","ECE","This course is based on electrical circuit and their action",50,0);
    Subjects Cse = new Subjects("2CSE","CSE","This course is based on computer and softwares",70,0);
    Subjects Civil = new Subjects("3MECH","Mechanical","It is based on machine and mechanical devices",60,0);

    public CourseDB(){
        subject= new ArrayList<Subjects>();
        subject.add(Ece);
        subject.add(Cse);
        subject.add(Civil);
    }

    //check avail courses
    public void display(){
        for(int i =0;i<subject.size();i++){
            System.out.println("CourseCode : "+subject.get(i).getCourseCode() +" Seatleft - "+subject.get(i).getSeatfill());
        }
    }
    //get specific course
    public Subjects getSubject(int i){
         return subject.get(i);
    }

    //for testing purpose
    public void specific(int i){
        System.out.println(  subject.get(i).getSeatfill());
    }


}
