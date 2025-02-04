package ecommerce;
import java.util.List;


public class Item {
    private String itemName;
    private int itemCategory;
    private int itemId;
    private List<String> keywords;
    private boolean condition; // true for new, false for used
    private double salePrice;

    private int sellerId;

    public Item(String itemName, int itemCategory, int itemId, List<String> keywords, boolean condition, double salePrice, int sellerId) {
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemId = itemId;
        this.keywords = keywords;
        this.condition = condition;
        this.salePrice = salePrice;
        this.sellerId = sellerId;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemCategory(int itemCategory) {
        this.itemCategory = itemCategory;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public void setKeywords(List<String> keywords) {
        this.keywords = keywords;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemCategory() {
        return itemCategory;
    }

    public int getItemId() {
        return itemId;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public boolean isCondition() {
        return condition;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public int getSellerId() {
        return sellerId;
    }
}
