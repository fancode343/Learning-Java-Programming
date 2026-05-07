//Code By: RedstoneProTech
//Name: Decimal to Binary

//Enter your Number then type 10 then 2

import java.util.Scanner ;
public class Converter {
	public
	 static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter an integer");
	int a = input.nextInt() ;
	System.out.println("What number system is it currently in? (Only support 2, 4, 8, and 10.)");
	int b = input.nextInt();
	System.out.println("Convert it to what nunber system?");
	int c = input.nextInt();
	int d ;
	int e = a ;
	String f = "";
	String g = "" ;
	if (b == 10 || c <= 9) {
		if (a < c) {
			System.out.println(a) ;
			}
		while (e >= c) {
		d = e%c ;
		e = e/c ;
		f = f + d ;
		if (e < c) {
		f = f + e ;	
			}		
		}
		}	
			for (int i = f.length() - 1; i >= 0; i--) {
                g += f.charAt(i);
            }
            System.out.println(g);						
		input.close();
	}
}