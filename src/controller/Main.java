package controller;

import io.DataLoader;
import io.DataSaver;

public class Main {

    public static void main(String[] args) {
        setUpProgram();
        finishProgram();
    }

    private static void setUpProgram() {
        DataLoader.loadListData();
        SetUp.assembleShoppingList();
    }

    private static void finishProgram() {
        DataSaver.saveStoreAndItems();
    }
}
