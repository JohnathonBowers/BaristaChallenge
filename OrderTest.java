public class OrderTest {
    public static void main (String[] args) {
        
        // Creating Order objects
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Cindhuri");
        Order order4 = new Order("Jimmy");
        Order order5 = new Order("Noah");

        // Creating Item objects
        Item dripCoffee = new Item("Drip Coffee", 1.99);
        Item latte = new Item ("Latte", 2.99);
        Item cappuccino = new Item ("Cappuccino", 2.99);
        Item mocha = new Item("Mocha", 3.99);

        // Adding items to Order 1
        order1.addItem(dripCoffee);
        order1.addItem(latte);
        
        // Adding items to Order 2
        order2.addItem(dripCoffee);
        order2.addItem(cappuccino);

        // Adding items to Order 3
        order3.addItem(dripCoffee);
        order3.addItem(mocha);

        // Adding items to Order 4
        order4.addItem(latte);
        order4.addItem(cappuccino);

        // Adding items to Order 5
        order5.addItem(cappuccino);
        order5.addItem(mocha);

        // Calling display method on each order
        order1.display();
        order2.display();
        order3.display();
        order4.display();
        order5.display();

        // Setting ready status for orders
        order1.setIsReady(false);
        order2.setIsReady(true);
        order3.setIsReady(true);
        order4.setIsReady(false);
        order5.setIsReady(true);

        //  Printing ready status for orders
        order1.getStatusMessage();
        order2.getStatusMessage();
        order3.getStatusMessage();
        order4.getStatusMessage();
        order5.getStatusMessage();

        // Printing the return value of the getOrderTotal method
        System.out.println(order1.getOrderTotal());
        System.out.println(order2.getOrderTotal());
        System.out.println(order3.getOrderTotal());
        System.out.println(order4.getOrderTotal());
        System.out.println(order5.getOrderTotal());
    }
}