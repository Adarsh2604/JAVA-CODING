class Student {
    String name;
    int age;

    void printinfo(String name) {
        System.out.println(this.name);

    }

    void printinfo(int age) {
        System.out.println(this.age);

    }

    Student() {
        System.out.println("Constructor called!!!");
    }

};

public class Polymorphism {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Adarsh Gupta ";
        s1.age = 22;
        s1.printinfo(s1.age);

    }

}
