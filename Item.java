public class Item {
    
    private String name;
    private Double price;

    public Item (String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void setName (String name) {
        this.name = name;
    }

    public String getName () {
        return name;
    }

    public void setPrice (Double price) {
        this.price = price;
    }

    public Double getPrice () {
        return price;
    }
}