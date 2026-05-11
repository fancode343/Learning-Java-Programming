package AllInOneSystem.Systems;

import java.util.*;

public class Random {

    public static String getName() {
        return "Random Algorithm V1";
    }
    public static String getAuthor() {
        return "Fancode343";
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
    }
}

class RandomNumber {
    public static int randomNum(int Start, int End) {
        if (Start > End) {
            System.out.println("Error, Please use valid Method Parameter. randomNum(Min, Max)");
            System.exit(0);
        }
        int start = Start;
        int end = End;
        if ((Start == 0 || Start == -1) && (End == 1 || End == 0)) {
            start = 1000;
            end = 1001;
        }
        end += 1;
        boolean stop = false;
        long random = 0;
        long random1 = end - start + 1;
        long seed = System.currentTimeMillis();
        int count = start;
        int Iteration = 0;
        while (stop == false) {
            long time = System.currentTimeMillis() ^ System.nanoTime();
            seed += Runtime.getRuntime().freeMemory() * time % random1 ^ time * time * (random1);
            random1 += end * time * time ^ System.nanoTime();
            random = seed % random1 - 1;
            if (random == 0 || random1 == 0) {
                random = 2 * seed % time;
            }
            // System.out.println("Seed: "+seed+" = "+random);
            if (count == end) {
                seed = time % random - random1 + end;
                random = seed % count;
                count = start;
            }
            // System.out.println("\nDebug1 : \nseed = "+seed+" \nRandom = "+random+"
            // \nRandom1 = "+random1+"\n");
            if (Iteration == 10000) {
                if (time % end == 0) {
                    random1 = time % start;
                    random = start + 1;
                    ;
                } else {
                    random = start + ((time % end) % 3);
                    while (random > end) {
                        random--;
                    }
                    // System.out.println("10,000 iteration and the number is "+ random);
                }
            }
            if ((random >= start) && (random <= end)) {
                if ((Start == 0 || Start == -1) && (End == 1 || End == 0)) {
                    if (Start == -1 && random == 1000) {
                        random = -1;
                    }
                    if (Start == 0 && random == 1000) {
                        random = 0;
                    }
                    if (End == 0 && random == 1001) {
                        random = 0;
                    }
                    if (End == 1 && random == 1001) {
                        random = 1;
                    }
                }
                stop = true;
                // System.out.println();
                // System.out.println("Random Number Generated.");
                // System.out.println();
            }
            if (Iteration == 20000) {
                System.out.println("Iteration Exceeded to 20,000, This Algorithm is Bad, The number now is " + random);
                stop = true;
            }
            count++;
            Iteration++;
        }
        int n = (int) random;
        return n;
    }
}