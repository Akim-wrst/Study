package TaskCollection;

import java.util.ArrayList;
import java.util.List;

class Order {
    int id;
    String customer;
    int totalAmount;

    Order(int id, String customer, int totalAmount) {
        this.id = id;
        this.customer = customer;
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", customer='" + customer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }

    static void maxOrder(List<Order> list) {
        List<Integer> l = new ArrayList<>();
        for (Order ord : list) {
            int i = ord.totalAmount;
            l.add(i);
        }
        int sum = l.stream().max((x, y) -> x - y).get();
        for (Order ord : list) {
            if (sum == ord.totalAmount) {
                System.out.println(ord);
            }
        }
    }

    static int amountOfOrders(List<Order> list) {
        List<Integer> l = new ArrayList<>();
        for (Order ord : list) {
            int i = ord.totalAmount;
            l.add(i);
        }
        int sum = 0;
        for (int a : l) {
            sum += a;
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> customers = new ArrayList<>();
        Order customer = new Order(23, "Akim", 8998);
        Order customer2 = new Order(565, "Zelensky", 1023);
        Order customer3 = new Order(3434, "Putin", 5453);
        Order customer4 = new Order(23, "Tramp", 6342);
        List<Order> list = new ArrayList<>();
        list.add(customer);
        list.add(customer2);
        list.add(customer3);
        list.add(customer4);

        Order.maxOrder(list);
        System.out.println("----------------------------------------------------");
        System.out.println(Order.amountOfOrders(list));
    }
}
