package app.product.subproduct;
import app.product.Product;

public class Drink extends Product {
    private boolean hasStraw;

    public Drink(int id, String name, int kcal, int price, boolean hasStraw) {
        super(id, name, kcal, price);
        this.hasStraw = hasStraw;
    }

    public boolean hasStraw() {
        return hasStraw;
    }

    public void setHasStraw(boolean hasStraw) {
        this.hasStraw = hasStraw;
    }
}
