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
//    Multilevel_inheritance ----------->
class EquilateralTriangle extends Triangle {
    public void area(int b, int h) {
        System.out.println(1 / 2 * b * h);
    }
}

public class Multilevel_inheritance {

}
