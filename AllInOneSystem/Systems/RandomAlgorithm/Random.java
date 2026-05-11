package AllInOneSystem.Systems.RandomAlgorithm;

import java.util.*;

public class Random {
    public static String getName() {
        return "Random Algorithm";
    }
    public static String getAuthor() {
        return "fancode343";
    }
    public static void main() {
        Scanner butang = new Scanner(System.in);
        int random = RandomNumber.randomNum(1, 10);
        System.out.print("Guest the number between 1 to 10: ");
        int guest = butang.nextInt();
        if (guest == random) {
            System.out.println("Congratulations, You Guessed The Number");
        } else {
            System.out.println("Wrong! The Number is " + random);
        }
        int a = 0;
        System.out.println("Random Numbers: ");
        while (a < 10) {
            System.out.print(RandomNumber.randomNum(1, 10) + ", ");
            a++;
        }
        System.out.println();
        butang.close();
    }
}
