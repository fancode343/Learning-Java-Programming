public class BubleSort {
    public static void main(String[] args) {
        int data[] = {40, 50, 20, 2, 5, 7, 9};
        for (int i = 0; i<data.length; i++) {
            int temp = 0;
            for (int j = 0; j<data.length-1-i; j++) {
                if (data[j] > data[j+1]) {
                    temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp; 
                }
            }
        }
        for(int i = 0; i<data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
