
public class Student {

    // Attributes

    private int id;
    private String name;
    private String surname;
    private int credit;
    private Course[] courses;
    private int courseAmount;

    // Constructor

    public Student(int id,String name,String surname,int credit){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.credit = credit;

        // initialize array
        this.courses = new Course[10];
        this.courseAmount = 0;
    }

    public String toString(){

        String content = "--------- Student ---------"+ "\n" 
                       + "| ID      : " + this.id   + "\n" 
                       + "| Name    : " + this.name + "\n" 
                       + "| Surame  : " + this.surname + "\n" 
                       + "| Credit  : " + this.credit + "\n" ;

        return content;
    }

    public void take_course(Course course){

        // Add to the array
        this.courses[this.courseAmount] = course;
        // increase course amount
        this.courseAmount ++;

        // Add the student to students array
        course.getStudents()[course.getStudentAmount()] = this;
        course.increaseStudentNumber();

        // Inform
        System.out.println(this.name + " took the course "+ course.getName() + " successfully !");
         
    }

    public void list_taken_courses(){

        System.out.println("--------------------------------");
        System.out.println(this.name+ " course list: ");

        for(int i = 0 ; i < this.courseAmount ; i++ ) {
            System.out.println(this.courses[i].toString()) ;
        }

    }

}