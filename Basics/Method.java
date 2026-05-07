import java.util.*;

public class Method {
    public static int gab(int a) {

        int c = a / 2;
        return c;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        System.out.println(gab(b));
    }
}

// Basic Method Calling
