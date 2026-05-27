package LYRICSPLAYER;
public class LyricsPlayer {
    public static void play(Object[][] lyrics) throws InterruptedException{ //{text},{charDeley},{Afterdeley},{ifNextLine}
        System.out.println();
        System.out.println("-");
        for(int i = 0; i<lyrics.length; i++){
            for(int k = 0; k<((String)lyrics[i][0]).length(); k++) {
                System.out.print(((String)lyrics[i][0]).charAt(k));
                Thread.sleep((int)lyrics[i][1]);
            }
            if((boolean)lyrics[i][3]){
                System.out.println();
            } else {
                System.out.print(" ");
            }
            Thread.sleep((int)lyrics[i][2]);
        }
    }
}
