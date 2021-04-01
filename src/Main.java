public class Main {

    public static void main(String [] args) {


        // Students
        Student s1 = new Student(1,"Yusuf","Demir",40);
        Student s2 = new Student(2,"Ada","Ozarslan",40);

        // Courses
        Course c1 = new Course(1,"IE246",6,60);
        Course c2 = new Course(2,"EE350",6,65);

        System.out.println(s2.toString());
        System.out.println(c1.toString());

    }
    
}
