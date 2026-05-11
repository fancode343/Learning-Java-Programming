package AllInOneSystem.Systems.MovieSystem;

public class Movie extends Show {
    private String genre;
    private double ticketPrice;

    public Movie(String title, int duration, String genre, double ticketPrice) {
        super(title, duration);
        this.genre = genre;
        this.ticketPrice = ticketPrice;
    }

    // Getter
    public String getGenre() {
        return genre;
    }

    // Setter
    public void setGenre(String title) {
        this.genre = genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double TicketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public void displayinfo() {
        super.displayinfo();
        System.out.println("Genre: " + genre + "\nTicketPrice: " + ticketPrice);
    }
}