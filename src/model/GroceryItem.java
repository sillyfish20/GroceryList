package model;

public class GroceryItem {

    String storeName;
    String itemName;

    public GroceryItem(String storeName, String itemName) {
        this.storeName = storeName;
        this.itemName = itemName;
    }

    public String getStore() {
        return storeName;
    }

    public String getItem() {
        return itemName;
    }
}
