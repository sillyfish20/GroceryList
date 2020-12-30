package controller;

import model.GroceryItem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static io.DataLoader.listOfAllItems;

public class SetUp {

    //public static Map<String, String[]> shoppingMap;
    public static Map<String, String> shoppingMap;

    public static void assembleShoppingList() {
        shoppingMap = new HashMap<String, String>();
        for (int i=0; i<listOfAllItems.size(); i++) {
            GroceryItem gItem = listOfAllItems.get(i);
            String storeName = gItem.getStore();
            String itemName = gItem.getItem();
            //ArrayList<String> itemNameList = new ArrayList<String>();
            if (shoppingMap.containsKey(storeName) == false) {
                shoppingMap.put(storeName, itemName);
            } else {
                shoppingMap.put(storeName, shoppingMap.get(storeName)+", "+itemName);
            }
        }
    }

}
