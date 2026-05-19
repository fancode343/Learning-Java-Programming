package OOS;

public class MenuItem {
    private String name;
    private double price;
    MenuItem(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        if(price <= 0) {
            this.price = 0;
        }else{
            this.price = price;
        }
    }
    public double getTotalPrice(){
        return price;
    }
}