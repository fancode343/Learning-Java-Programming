
//Code by Gab IT1A
import java.util.Arrays;
public class Quake {
    public static void main(String[] args){
        int data[] = new int[args.length];
        int track = 1;
        for (int i = 0;i<data.length;i++){
            data[i] = Integer.parseInt(args[i]);
        }
        int temp = 0;
        for(int i = 0;i<data.length/2;i++){
            for(int j = 0;j<data.length-1;j+=2){
                System.out.println("Iteration: "+track++);
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j]=data[j+1];
                    data[j+1] = temp;
                }
            }
            for(int j = 1;j<data.length-1;j+=2){
                System.out.println("Iteration: "+track++);
                if(data[j]>data[j+1]){
                    temp = data[j];
                    data[j]=data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("\n"+Arrays.toString(data));
    }
}
