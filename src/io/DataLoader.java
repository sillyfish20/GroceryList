package io;

import model.GroceryItem;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DataLoader {

    public static List<GroceryItem> listOfAllItems = new ArrayList<>();

    public static void loadListData() {
/*        try {
            List<String> lines = Files.readAllLines(Paths.get("./data/input.txt"));
            makeListOfGroceryItem(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        try {
            Scanner scanner = new Scanner(Paths.get("./data/input.txt"));
            while (scanner.hasNextLine()) {
                makeListOfGroceryItem(Collections.singletonList(scanner.nextLine()));
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("fileNotFoundException is thrown!!!!");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOException is thrown!!!!");
            e.printStackTrace();
        }
    }

    public static void makeListOfGroceryItem(List<String> lines) {
        for (int i=0; i<lines.size(); i++) {
            String line = lines.get(i);
            //String[] temp = new String[2]();
            String[] temp = line.split(" ");
            GroceryItem tempItem = new GroceryItem(temp[0],temp[1]);
            listOfAllItems.add(tempItem);
        }
    }
}
