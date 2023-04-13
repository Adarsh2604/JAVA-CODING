interface animal {
    public void walk();
}

class horse implements animal {
    public void walk() {
        System.out.println("Walks on 4 legs");
    }
}

public class Interface {
    public static void main(String args[]) {
        horse h1 = new horse();
        h1.walk();

    }

}
