package AllInOneSystem.Systems.OOS;
import java.util.Scanner;
public class Main {
    public static String getSystemName() {
        return "Order Online System";
    }
    public static String getSystemAuthor() {
        return "fancode343";
    }
    public static void main(){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter number of orders: ");
    int n = input.nextInt();
    MenuItem[] mi = new MenuItem[n];
    for(int i = 0; i<n; i++){
        System.out.println();
        System.out.println("Order"+(i+1));
        System.out.print("Type (1-Food, 2-Drink): ");
        int type = input.nextInt();
        input.nextLine();
        System.out.print("Name: ");
        String name = input.nextLine();
        System.out.print("Price: ");
        double price = input.nextDouble();
        int size = 0;
        int quantity = 0;
        switch(type){
            case 1:
                System.out.print("Quantity: ");
                quantity = input.nextInt();
                mi[i] = new FoodItem(name, price, quantity);
                break;
            case 2:
                System.out.print("Size (1-Small, 2-Medium, 3-Large): ");
                size = input.nextInt();
                mi[i] = new DrinkItem(name, price, size);
                break;
        }
    }
    System.out.println();
    double total = 0;
    for(int i = 0; i<n; i++){
        System.out.println(mi[i].getName()+" --> "+mi[i].getTotalPrice());
        total += mi[i].getTotalPrice();
    }
    double discount = 0;
    if(n >= 3){
        discount = total*0.05;
        total = total - (discount);
    } 
    System.out.println();
    System.out.println("TOTAL BILL: "+total);
    }
}
