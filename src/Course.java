public class Course {

    // Attribute
    
    private int id;
    private String name;
    private int necessityCredit;
    private int maxCapacity;
    private Student[] students;
    private int studentAmount;


    // Constructor
    public Course(int id,String name,int necessityCredit,int maxCapacity){
        this.id                 =id;
        this.name               =name;
        this.necessityCredit    =necessityCredit;
        this.maxCapacity        =maxCapacity;

        // initialize array
        this.students = new Student[100];
        this.studentAmount = 0;
    }

    // To String
    public String toString(){

        String content = "--------- Course ---------"+ "\n" 
                       + "| ID          : " + this.id   + "\n" 
                       + "| Name        : " + this.name + "\n" 
                       + "| Credit      : " + this.necessityCredit + "\n" 
                       + "| Capacity    : " + this.maxCapacity + "\n" ;

        return content;
    }

    public void list_students(){

        System.out.println("--------------------------------");
        System.out.println(this.name + " student list: ");

        for(int i = 0 ; i < this.studentAmount ; i++ ) {
            System.out.println(this.students[i].toString()) ;
        }

    }

    public void increaseStudentNumber(){
        this.studentAmount ++ ;
    }

    // GETTERS 
    public String getName(){
        return this.name;
    }

    public Student[] getStudents(){
        return this.students;
    }

    public int getStudentAmount(){
        return this.studentAmount;
    }

    // SETTERS
    public void setStudentAmount(int amount){
        this.studentAmount = amount;
    }

}
