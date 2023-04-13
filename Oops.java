
class Student {
    String name;
    int age;

    void printinfo() {
        // This is a keyword which is used to access the properties

        System.out.println(this.name);
        System.out.println(this.age);

    }

    Student() {
        System.out.println("Constructor called!!!");
    }

    // copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }

};

public class Oops {
    public static void main(String[] args) {
        // Student() is the constructor of the given class------> name is same as the
        // name of the class-->
        Student s1 = new Student();
        s1.name = "Adarsh";
        s1.age = 24;
        Student s2 = new Student(s1);
        s2.printinfo();

        // s1.printinfo();

    }

}
