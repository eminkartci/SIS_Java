
public class Student {

    // Attributes

    private int id;
    private String name;
    private String surname;
    private int credit;
    private Course[] courses;

    // Constructor

    public Student(int id,String name,String surname,int credit){

        this.id = id;
        this.name = name;
        this.surname = surname;
        this.credit = credit;

        // initialize array
        this.courses = new Course[10];
    }

    public String toString(){

        String content = "--------- Student ---------"+ "\n" 
                       + "| ID      : " + this.id   + "\n" 
                       + "| Name    : " + this.name + "\n" 
                       + "| Surame  : " + this.surname + "\n" 
                       + "| Credit  : " + this.credit + "\n" ;

        return content;
    }

}