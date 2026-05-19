package OOS;
public class FoodItem extends MenuItem{
    private int quantity;
    FoodItem(String name, double price, int quantity) {
        super(name, price);
        this.quantity = quantity;
    }
    public int getQuantity(){
        return quantity;
    }
    public void setQuantity(int quantity){
        if(quantity <= 0) {
            this.quantity = 0;
        }else{
            this.quantity = quantity;
        }
    }
    @Override
    public double getTotalPrice(){
        return getPrice()*quantity;
    }
}