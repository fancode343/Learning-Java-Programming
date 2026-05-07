//Code by Gab

import java.util.*;
public class Power {
    public static void main(String[] args){
       int[] data = new int[args.length];
        for (int i = 0; i < data.length;i++){
            data[i] = Integer.parseInt(args[i]);
        }
        int track = 1;
        int temp = 0;
        for (int i = 0; i < data.length-1; i++){
            for(int j = i+1; j < data.length;j++){
                if(data[i]>data[j]){
                    temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                    System.out.println("Swap "+track+": "+Arrays.toString(data));
                } 
            }
        }
    }
}