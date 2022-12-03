package com.example.gameoflife;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Table {

    public static int width = 800;
    public static int height = width;
    public static int rowsAmount = 400;
    public static int columnsAmount = rowsAmount;

    public static int fieldsize = width/columnsAmount;


    public static Rectangle[][]rectanglesField;



    public static void initializeTable(GraphicsContext graphicsContext){
        graphicsContext.setFill(Color.BLACK);
        for (int row = 0; row < rowsAmount; row++ ){
            for (int column = 0; column < columnsAmount; column++){
                Rectangle rectangle = new Rectangle();
                rectangle.setWidth(width/columnsAmount);
                rectangle.setHeight(height/rowsAmount);
                graphicsContext.fillRect(row*fieldsize,column*fieldsize,fieldsize,fieldsize);
                rectanglesField[row][column] = new Rectangle();

            }
        }
    }
}
