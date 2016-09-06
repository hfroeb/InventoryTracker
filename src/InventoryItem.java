/**
 * Created by halleyfroeb on 9/6/16.
 */
public class InventoryItem {
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    private String text;
    private int quantity;

    public InventoryItem(String text, int quantity) {
        this.text = text;
        this.quantity = quantity;

    }
}
