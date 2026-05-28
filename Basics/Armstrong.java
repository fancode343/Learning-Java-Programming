//Armstrong
//EX. Userinput = 153
// The output is true
// An Armstrong number is a number that equals the sum of its own digits each raised to the power of the number of digits
// 153 = 3 digit
// 1³ + 5³ + 8³ = 153

import java.util.Scanner;
public class Armstrong{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number: ");
    int userinput = input.nextInt();
    String newUnserInput = Integer.toString(userinput);
    int total = 0;
    for(int i = 0;i<newUnserInput.length(); i++){
      String temp = Character.toString(newUnserInput.charAt(i));
      total += Math.pow(Integer.parseInt(temp), newUnserInput.length());
    }
    System.out.println(total);
    if(total == userinput){
      System.out.println(true+" "+userinput+" is an Armstrong number.");
    }else{
      System.out.println(false+" "+userinput+" is not an Armstrong number.");
    }
  input.close();
  }
}
