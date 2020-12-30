package io;

import controller.SetUp;

import java.io.*;

public class DataSaver {

    private static PrintWriter printWriter;

    static {
        try {
            printWriter = new PrintWriter("./data/output.txt", "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }


    //REQUIRES:
    //MODIFIES: output txt file
    //EFFECTS: saves each StoreList to output.txt file
    public static void saveStoreAndItems() {

        for (String key : SetUp.shoppingMap.keySet()) {
            String temp = key + ":" + SetUp.shoppingMap.get(key);
            printWriter.println(temp);
        }
        printWriter.close();
    }

}
