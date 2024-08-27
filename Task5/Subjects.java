public class Subjects {
    private String course;
    private String courseCode;
    private String description;
    private final int capacity;
    private int seatfill = 0;

    public Subjects(String courseCode, String course, String description, int capacity,int seatfill) {
        this.courseCode = courseCode;
        this.course = course;
        this.description = description;
        this.capacity = capacity;
        this.seatfill = seatfill;
    }

    //To get the course
    public String getCourseCode(){
        return courseCode;
    }

    //To check available seats
    public int getSeatfill(){
        if(capacity-seatfill <=0){
            return 0;
        }
        return capacity -seatfill;
    }

    //To register one student in subject
    public void addSeat(){
        System.out.println("Registration successfull on "+course);
        seatfill= seatfill+1;

    }

    public void cancel(){
        --seatfill;
    }
}
