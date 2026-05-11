//OOP Problems
package AllInOneSystem.Systems.MovieSystem;

import java.util.*;

public class Main {
    public static String getName() {
        return "Movie System";
    }
    public static String getAuthor() {
        return "fancode343";
    }
    public static void main() {
        Scanner butang = new Scanner(System.in);
        System.out.print("Enter number of movies: ");
        int n = butang.nextInt();
        System.out.println();
        Movie[] movies = new Movie[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Movie " + (i + 1));

            System.out.print("Title: ");
            butang.nextLine();
            String title = butang.nextLine();

            System.out.print("Duration: ");
            int duration = butang.nextInt();
            butang.nextLine();

            System.out.print("Genre: ");
            String genre = butang.nextLine();

            System.out.print("TicketPrice: ");
            double ticketPrice = butang.nextDouble();

            System.out.println();
            movies[i] = new Movie(title, duration, genre, ticketPrice);
        }
        System.out.println("--- MOVIE DETAILS ---");
        for (int i = 0; i < n; i++) {
            movies[i].displayinfo();
            System.out.println();
        }
    }
}