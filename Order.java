import java.util.ArrayList;

public class Order {

    private String name;
    private boolean ready;
    private ArrayList<Item> items = new ArrayList<Item>();

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<Item>();
    }

    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setIsReady (boolean ready) {
        this.ready = ready;
    }

    public boolean getIsReady () {
        return ready;
    }

    // I used StackOverflow for help with writing getters for ArrayLists
    public ArrayList<Item> getItems () {
        return items;
    }

    public void addItem (Object Item) {
        getItems().add((Item) Item);
    }

    public void getStatusMessage () {
        if (ready == true) {
            System.out.println("\nYour order is ready.");
        } else {
            System.out.println("\nThank you for waiting. Your order will be ready soon.");
        }
    }

    public Double getOrderTotal () {
        Double total = 0.0;
        ArrayList<Item> items = getItems();
        for (Item Item : items) {
            total += Item.getPrice();
        }
        return total;
    }

    public void display () {
        ArrayList<Item> items = getItems();
        System.out.printf("\nCustomer Name: %s\n", name);
        for (Item Item : items) {
            System.out.printf("%s - $%.2f\n", Item.getName(), Item.getPrice());
        }
        System.out.printf("Total: $%.2f\n", getOrderTotal());
    }

}