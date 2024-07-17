package realworld;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class OrderDataProcessing
{
   static class Order {
        String customerName;
        double totalPrice;

       public String getCustomerName() {
           return customerName;
       }

       public void setCustomerName(String customerName) {
           this.customerName = customerName;
       }

       public double getTotalPrice() {
           return totalPrice;
       }

       public void setTotalPrice(double totalPrice) {
           this.totalPrice = totalPrice;
       }

       public int getOrderDate() {
           return orderDate;
       }

       public void setOrderDate(int orderDate) {
           this.orderDate = orderDate;
       }

       public Order(String customerName, double totalPrice, int orderDate) {
           this.customerName = customerName;
           this.totalPrice = totalPrice;
           this.orderDate = orderDate;
       }

       int orderDate;

        // constructor, getters, and setters
    }

    static List<Order> orders = Arrays.asList(
            new Order("Alice", 45.0,1),
            new Order("Bob", 55.0, 10),
            new Order("Charlie", 60.0, 3),
            new Order("David", 30.0, 4)
    );

   //Given a list of customer orders, filter out orders that have a total price less than $50, sort the
   // remaining orders by order date, and collect the customer names into a list.
    public static void main(String[] args) {
        List<String> list = orders.stream().filter(order -> order.totalPrice>=50).
                sorted(Comparator.comparingInt(o -> o.orderDate))
                .map(Order::getCustomerName).collect(Collectors.toList());
        for (String s : list){
            System.out.println(s);
        }
    }
}
