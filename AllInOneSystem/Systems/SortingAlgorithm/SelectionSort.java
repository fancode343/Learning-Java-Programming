package AllInOneSystem.Systems.SortingAlgorithm;

public class SelectionSort {

    public static String getSystemName() {
        return "Selection Sort Algorithm";
    }
    public static String getSystemAuthor() {
        return "fancode343";
    }
    public static void main(String[] args) {
        int data[] = {40, 50, 20, 2, 5, 7, 9};
        AllInOneSystem.Systems.SO.P_arr(data);
        for (int i = 0; i<data.length; i++) {
            int temp = 0;
            for (int j = 0; j<data.length; j++) {
                if (data[j] > data[i]) {
                    temp = data[j];
                    data[j] = data[i];
                    data[i] = temp; 
                }
            }
        }
        for(int i = 0; i<data.length; i++) {
            System.out.println(data[i]);
        }
    }
}
