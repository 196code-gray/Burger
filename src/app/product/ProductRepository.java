package app.product;

import app.product.subproduct.Drink;
import app.product.subproduct.Hamburger;
import app.product.subproduct.Side;



public class ProductRepository {
    private final Product[] products = {
            new Hamburger(1, "새우버거", 500, 3500, false, 4500),
            new Hamburger(2, "치킨버거", 600, 4500, false, 4500),
            new Side(3, "감자튀김", 300, 1000, 1),
            new Side(4, "어니언링", 300, 1000, 1),
            new Drink(5, "코카콜라", 200, 1000, true),
            new Drink(6, "제로콜라", 0, 1000, true),
    };

    public Product[] getAllProducts() {
        return products;
    }

    public Product findById(int productId) {
        for (Product product : products) {
            if (product.getId() == productId) return product;
        }
        return null;
    }

}
