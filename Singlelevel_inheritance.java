class shape {
    public void area() {
        System.out.println("Displays Area");
    }
}

class Triangle extends shape {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

public class Singlelevel_inheritance {
    public static void main(String args[]){
        Triangle T1 =new Triangle();
        T1.area();

        
    }
}
