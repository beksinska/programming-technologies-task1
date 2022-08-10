import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class priceListTest {

    @Test
    public void add() {
        Item newItem = new Item("Cheese", 7128723, 199.90);
        PriceList expected = new PriceList(newItem);
        PriceList fact = new PriceList();
        fact.add(newItem);
        assertEquals(expected, fact);
    }

    @Test
    public void changePrice() {
        Item item = new Item("Cheese", 7128723, 199.90);
        Item changedItem = new Item("Cheese", 7128723, 249.90);
        PriceList expected = new PriceList(changedItem);
        PriceList fact = new PriceList(item);
        fact.changePrice(7128723, 249.90);
        assertEquals(expected, fact);
    }

    @Test
    public void changeName() {
        Item item = new Item("Cheese", 7128723, 199.90);
        Item changedItem = new Item("Maasdam", 7128723, 199.90);
        PriceList expected = new PriceList(changedItem);
        PriceList fact = new PriceList(item);
        fact.changeName(7128723, "Maasdam");
        assertEquals(expected, fact);
    }

    @Test
    public void purchasePrice() {
        Item item = new Item("Cheese", 7128723, 199.90);
        int quantity = 5;
        double expected = item.getPrice() * quantity;
        PriceList list = new PriceList(item);
        assertEquals(expected, list.purchasePrice(7128723, 5));
    }

    @Test
    public void remove() {
        Item newItem = new Item("Cheese", 7128723, 199.90);
        PriceList expected = new PriceList();
        PriceList fact = new PriceList(newItem);
        fact.remove(newItem);
        assertEquals(expected, fact);
    }

}
