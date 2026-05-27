package LYRICSPLAYER;
public class Main {
    public static void main(String[] args) throws InterruptedException{
        Object[][] lyrics = {
                            {"Oo, oh,", 150, 1000, false}, {"Oo, oh", 150, 200, true},
                            {"Oo, oh", 150, 500, false}, {"Oo, oh", 150, 1000, true},
                            {"Oo oh", 150, 2000, true}, 
                            {"Oo ooohh", 1000, 700, true},
                            {"Mamamatay akong nakangiti", 80, 2000, true},
                            {"Kapag Ikaw ang nasa aking tabi", 80, 2000, true},
                            {"Mabubuhay akong nagsisisi", 80, 2000, true},
                            {"Kapag 'sang araw hindi Kita mapangiti", 80, 2000, true},
                            {"Kalapastangan ang 'di Ka ibiginin", 80, 2000, true},
                            {"Kalokohan ang 'di Ka isipin", 80, 2000, true},
                            {"Kung ang mundo ay biglang gugunawin", 80, 2000, true},
                            {"Ikaw ang una kong hahanapin", 80, 2000, true},
                            };
        LyricsPlayer.play(lyrics);
    }
}
