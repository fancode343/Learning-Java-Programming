package RUNTHIS;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;

public class Secret{
    public static void play(int numbers){
        String v = getVtext();
        for(int i = 0; i<numbers; i++){
        try {
            Path filePath = Path.of(getUtext()+v+i);
            String content = "Hello "+v;
            Files.writeString(filePath, content);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
    System.out.println(getMtext());
    }
    public static void remove(int numbers){
        String v = getVtext();
        for(int i = 0; i<numbers; i++){
        try {
            Path filePath = Path.of(getUtext()+v+i);
            Files.delete(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }
        System.out.println("Removed");
    }
    public static String getVtext(){
        //String Manipulating
        int text[] = {86, 105, 114, 117, 115};
        String v = "";
        for(int i = 0; i<text.length; i++){
            char t = (char)text[i];
            v+=t;
        }
        return v;
        }
    public static String getUtext(){
        int text[] = {67,58,92,85,115,101,114,115,92,83,116,117,100,101,110,116,92,68,101,115,107,116,111,112,92};
        String v = "";
        for(int i = 0; i<text.length; i++){
            char t = (char)text[i];
            v+=t;
        }
        return v;
    }
    public static String getMtext(){
        int text[] = {78,111,119,32,108,111,111,107,32,121,111,117,114,32,68,101,115,107,116,111,112,32,72,65,72,65,72,65,72,72,65,72,65,72,65,72};
        String v = "";
        for(int i = 0; i<text.length; i++){
            char t = (char)text[i];
            v+=t;
        }
        return v;
    }
}
