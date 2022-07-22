import java.util.ArrayList;
import java.util.Objects;

public class priceList {
    ArrayList<Item> list = new ArrayList<>();

    public priceList(Item newItem) {
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
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == itemCode) {
                list.get(i).setName(newName);
            }
        }
    }

    void remove(Item i) {
        list.remove(i);
    }

    double purchasePrice(int itemCode, int quantity) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode() == itemCode) {
                return list.get(i).getPrice() * quantity;
            }
        }
        throw new NullPointerException("Product not found");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        priceList priceList = (priceList) o;
        return Objects.equals(list, priceList.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
