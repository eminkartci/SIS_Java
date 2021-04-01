public class Course {

    // Attribute
    
    private int id;
    private String name;
    private int necessityCredit;
    private int maxCapacity;
    private Student[] students;


    // Constructor
    public Course(int id,String name,int necessityCredit,int maxCapacity){
        this.id                 =id;
        this.name               =name;
        this.necessityCredit    =necessityCredit;
        this.maxCapacity        =maxCapacity;

        // initialize array
        this.students = new Student[100];
    }

}
