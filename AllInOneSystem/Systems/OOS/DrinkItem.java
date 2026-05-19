package OOS;

public class DrinkItem extends MenuItem{
    private int size;
    DrinkItem(String name, double price, int size) {
        super(name, price);
        this.size = size;
    }
    public int getSize(){
        return size;
    }
    public void setSize(int size) {
        if(size <= 0){
            this.size = 0;
        }else{
            this.size = size;
        }
    }
    public double getNumberSize(){
        switch(size){
            case 1:
                return 1.0;
           case 2:
                return 1.2;
            case 3:
                return 1.5;
            default:
                return 0;
        }
    }
    @Override
    public double getTotalPrice(){
        return getNumberSize() * getPrice();
    }

}
