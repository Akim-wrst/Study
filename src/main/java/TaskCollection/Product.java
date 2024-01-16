package TaskCollection;

import java.util.ArrayList;
import java.util.List;

class Product {
    int id;
    String name;
    int quantity;

    public Product(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    static void nullQuantity(List<Product> products) {
        for (Product product : products) {
            if (product.quantity == 0) {
                System.out.println(product);
            }
        }
    }

    static int quantityProduct(List<Product> products) {
        List<Integer> list = new ArrayList<>();
        for (Product product : products) {
            int i = product.quantity;
            list.add(i);
        }
        int sum = 0;
        for (int a : list) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        Product product = new Product(12, "Вазилин", 789);
        Product product2 = new Product(2, "Toxin", 0);
        Product product3 = new Product(456, "Носки", 3015);
        Product product4 = new Product(5, "NLAW", 0);
        List<Product> products = new ArrayList<>();
        products.add(product);
        products.add(product2);
        products.add(product3);
        products.add(product4);

        Product.nullQuantity(products);
        System.out.println("-----------------------------------------------");
        System.out.println(Product.quantityProduct(products));
    }
}
