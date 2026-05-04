public class App {
    public static void main(String[] args) throws Exception {
        
        Student s2 = new Student(7);
        System.out.println(s2.age);
        Student s3 = new Student("Rauf");
        System.out.println(s3.name);

        //copying s2 info into s1
        Student s1 = new Student(s2);
        System.out.println("s1 age : "+s1.age);
    }
}

class Student{
    int age;
    String name;

    //constructor
    //if we dont make this constructor and make other 2 than it will give error as java wont make it by default in this case
    Student(){
        System.out.println("student is created");
    }

    //parametarized Constructor
    Student(int age){ 
        this.age = age;
    }

    Student(String name){
        this.name = name;
    }

    //copy constructor
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
    }
}
