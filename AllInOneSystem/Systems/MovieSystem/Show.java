package AllInOneSystem.Systems.MovieSystem;

public class Show {
    private String title;
    private int duration;

    public Show(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getter
    public String getTitle() {
        return title;
    }

    // Setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void displayinfo() {
        System.out.println("Title: " + title + "\nDuration: " + duration + " minutes");
    }
}