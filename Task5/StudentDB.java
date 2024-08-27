import java.util.ArrayList;

public class StudentDB {
    ArrayList<Student>stdList ;
   public  StudentDB(){
       stdList = new ArrayList<>();
   }
   public void add(Student std){
       stdList.add(std);
       System.out.println(" Added Successfully");
   }
   public Student get(int id){
      return stdList.get(id-101);
   }
}
