package learn.himanen;


public class Item {


    private String size = "medium";
    private String type;
    private double price;
    private String name;

    public Item(double price, String type, String name) {
        this.price = price;
        this.type = type.toLowerCase();
        this.name = name.toLowerCase();
    }

    public static void printItem(String name, double price) {

        System.out.printf("%20s:%6.2f%n", name, price);

    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getAdjustedPrice() {
        return switch (size) {
            case "small" -> getPrice() - 1;
            case "large" -> getPrice() + 2.0;
            default -> getPrice();
        };

    }

    public void printItem() {
        printItem(getName(), getAdjustedPrice());
    }


}

class Burger extends Item {
    private Item extra1;
    private Item extra2;
    private Item extra3;

    public Burger(double price, String name) {
        super(price, "BURGER", name);

    }

    public void addToppings(String extra1, String extra2, String extra3) {

        this.extra1 = new Item(getExtraPrice(extra1), extra1, "TOPPING");
        this.extra2 = new Item(getExtraPrice(extra2), extra2, "TOPPING");
        this.extra3 = new Item(getExtraPrice(extra3), extra3, "TOPPING");
    }

    @Override
    public double getAdjustedPrice() {
        return getPrice() + ((extra1 == null ? 0 : extra1.getAdjustedPrice()) +
                (extra2 == null ? 0 : extra2.getAdjustedPrice()) + (extra3 == null ? 0 : extra3.getAdjustedPrice()));
    }

    @Override
    public String getName() {
        return super.getName() + "BURGER";
    }


    public double getExtraPrice(String toppingName) {

        return switch (toppingName.toLowerCase()) {
            case "avocado", "cheese" -> 1.0;
            case "bacon", "calabresa" -> 4.0;
            default -> 0.00;
        };
    }


    public void printItemizedList() {
        printItem("BASE BURGER", getPrice());

        if (extra1 != null) {
            extra1.printItem();
        }

        if (extra2 != null) {
            extra2.printItem();
        }
        if (extra3 != null) {
            extra3.printItem();
        }
    }

}

