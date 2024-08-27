public class Student {


  private int id;
  private String name;
  private Subjects subjects;

  public Student(int id, String name) {
    this.id = id;
    this.name = name;
    System.out.print(name+" Your id is "+id);
  }

  //Course Registration
  public void register(String str,CourseDB data){
    if(str.charAt(0)=='1'){
      subjects = data.getSubject(0);
      subjects.addSeat();
    }
    if(str.charAt(0)=='2'){
      subjects = data.getSubject(1);
      subjects.addSeat();
    }
    if(str.charAt(0)=='3'){
      subjects = data.getSubject(2);
      subjects.addSeat();
    }
  }

  //Cancel the Register course
  public void withdraw(){
    subjects.cancel();
    subjects = null;
    System.out.println("Course withdraw Successfully");
  }

}
