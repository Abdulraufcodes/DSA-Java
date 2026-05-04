public class App {
    public static void main(String[] args) throws Exception {
        Student s1 = new Student();
        s1.age = 11;
        s1.name = "Rauf";
        s1.marks[0] = 90;
        s1.marks[1] = 95;
        s1.marks[2] = 99;

        Student s2 = new Student(s1);
        s1.marks[2] = 87;
        for(int i=0; i<3; i++){
            System.out.println(s2.marks[i]);
        }
    }
}

class Student{
    int age;
    String name;
    int marks[] = new int[3];

    Student(){
        System.out.println("construction is called...");
    }

    //copy constructor
    Student(Student s){
        this.age = s.age;
        this.name = s.name;
        // this.marks = s.marks;  //shalow copy
        for(int i=0; i<3; i++){   //Deep copy
            this.marks[i] = s.marks[i];
        }
    }
}
