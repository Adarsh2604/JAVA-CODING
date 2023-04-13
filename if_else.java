import java.util.*;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // taking number as input by writing sc.nextInt()
        int age = sc.nextInt();
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Not adult");
        }

    }
}