import java.util.Objects;

public class Item {
    private String name;
    private int code;
    private double price;

    Item(String name, int code, double price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Name:" + name + ", " + "Price:" + price + ", " + "Code" + code;
    }

    public String getName() {
        return name;
    }

    public int getCode() {
        return code;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return code == item.code && Double.compare(item.price, price) == 0 && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, code, price);
    }

}
