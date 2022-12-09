package com.example.gameoflife;

public class Step {

    public static void nextStep(){

        Table.initializeTable(Main.graphicsContext);
        PixelCheck.checkingPixel();
    }
}
