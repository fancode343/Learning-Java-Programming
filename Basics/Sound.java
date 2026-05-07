import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.File;

public class Sound {
    public static void downloadFile(String fileURL, String savePath) throws IOException {
        URL url = new URL(fileURL);
        try (InputStream in = url.openStream();
             FileOutputStream fos = new FileOutputStream(savePath)) {
            byte[] buffer = new byte[1024]; 
            int bytesRead;          
            while ((bytesRead = in.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
    }
    public static void get() {
        String fileURL = "https://admin.a.lmnet.cf/lmnet/fm-site/files/Music/running"; // Replace with your file URL
        String savePath = "sound.wav"; // Replace with your desired local path
        try {
            downloadFile(fileURL, savePath);
            System.out.println("File downloaded successfully to: " + savePath);
        } catch (IOException e) {
            System.err.println("Error downloading file: " + e.getMessage());
            e.printStackTrace();
        }
    }
    public static void Run() {
        try {
            File soundFile = new File("sound.wav");
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(soundFile);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.println("Playing WAV...");
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        get();
        System.out.println("Downloaded");
        Run();

    }
}