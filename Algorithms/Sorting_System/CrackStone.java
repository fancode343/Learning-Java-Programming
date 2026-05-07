//Code By Regie Buo IT1b
//Name: CrackStone Sort
//This is similar on Selection Sort
//Selection Sort used swap instead, CrackStone Sort put the Smallest data to another array

public class CrackStone {
    public static void main(String[] args) {
      int arr[] = { //Data
    153, 87, 12, 4990, 64, 230, 7, 315, 98, 56,
    4021, 76, 14, 67, 289, 53, 903, 21, 45, 72,
    384, 19, 600, 48, 92, 1500, 37, 88, 426, 251,
    63, 77, 19, 5400, 331, 42, 18, 95, 804, 27,
    66, 73, 128, 450, 39, 258, 74, 1200, 16, 304,
    987, 22, 64, 38, 71, 480, 29, 356, 900, 47,
    5200, 14, 33, 627, 58, 71, 409, 68, 274, 203,
    45, 700, 36, 18, 55, 24, 93, 812, 69, 50,
    4190, 12, 85, 302, 61, 48, 78, 23, 557, 110,
    32, 640, 14, 73, 91, 460, 37, 284, 168, 57,
    905, 41, 66, 14, 702, 39, 58, 200, 4500, 33,
    120, 87, 17, 260, 55, 841, 98, 44, 67, 305,
    74, 87, 690, 12, 49, 270, 33, 528, 94, 310,
    4540, 27, 19, 84, 71, 48, 263, 520, 77, 40,
    812, 66, 35, 12, 580, 97, 33, 405, 702, 28,
    52, 1490, 44, 88, 262, 56, 97, 14, 845, 67,
    320, 45, 92, 684, 52, 38, 4090, 19, 73, 287,
    60, 500, 33, 48, 128, 23, 56, 947, 71, 54,
    603, 38, 17, 450, 67, 725, 35, 29, 782, 94,
    51, 360, 12, 48, 0, 670, 20, 59, 244, 98, 310, -1, -60
};
      int sort[] = new int[arr.length];
      boolean[] used = new boolean[arr.length];

        int Iteration = 0;
        int condtion = 0;
      for (int i = 0; i<arr.length; i++) {
          int SI = 0;
          for (int j = 0; j<arr.length;  j++) {
            Iteration++; 
             if (((arr[SI] > arr[j]) && (!used[j]) && (arr[SI] != arr[j])) || ((used[SI])) ) {
              SI = j;
              condtion++;
            }
          }
          sort[i] = arr[SI];
          used[SI] = true;
      }
      // arr.sort;
      for (int i = 0; i<sort.length; i++) { //Print
        System.out.print(sort[i]+" ");
     }
     System.out.println();
     System.out.println("----> "+condtion+" Condition");
     System.out.println("----> "+Iteration+" Iterations");
    }
}
//Quote: Na kita na nimo ang smallest pero ngano wala niya nakita ang imong love sa iya.