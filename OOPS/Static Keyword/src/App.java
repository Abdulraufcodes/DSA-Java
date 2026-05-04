public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.schoolName = "THHS";

        Student s2 = new Student();
        //even though we have not definded schoolname for s2 it will still print as schoolName is static and wont change if set by another Student
        System.out.println(s2.schoolName);

        Student s3 = new Student();
        s3.schoolName = "abc";  //now schoolname will become abc for all student objects

        System.out.println(s2.schoolName); //schoolname changed for s2
    }
}

class Student{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
