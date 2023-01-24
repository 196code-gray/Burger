package app.product.subproduct;
import app.product.Product;

public class Side extends Product {
    private int ketchup;

    public Side(int id, String name, int kcal, int price, int ketchup) {
        super(id, name, kcal, price);
        this.ketchup = ketchup;
    }

    public int getKetchup() {
        return ketchup;
    }

    public void setKetchup(int ketchup) {
        this.ketchup = ketchup;
    }
}
