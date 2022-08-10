import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class PriceList {
    private final ArrayList<Item> list = new ArrayList<>();

    PriceList(Item... b) {
        Collections.addAll(list, b);
    }

    void add(Item i) {
        list.add(i);
    }

    void changePrice(int itemCode, double newPrice) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == itemCode) {
                list.get(i).setPrice(newPrice);
            }
        }
    }

    void changeName(int itemCode, String newName) {
        for (Item item : list) {
            if (item.getCode() == itemCode) {
                item.setName(newName);
            }
        }
    }

    void remove(Item i) {
        list.remove(i);
    }

    double purchasePrice(int itemCode, int quantity) {
        for (Item item : list) {
            if (item.getCode() == itemCode) {
                return item.getPrice() * quantity;
            }
        }
        throw new NullPointerException("Item not found");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PriceList priceList = (PriceList) o;
        return Objects.equals(list, priceList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
