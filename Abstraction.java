abstract class Animal {
    abstract void walk();
}

class horse extends Animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

class chicken extends Animal {
    public void walk() {
        System.out.println("Walks on 2 legs");
    }
}

public class Abstraction {
    public static void main(String args[]) {
        horse h1 = new horse();
        h1.walk();
        chicken c1=new chicken();
        c1.walk();
    }
}
