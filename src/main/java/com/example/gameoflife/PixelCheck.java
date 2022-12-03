package com.example.gameoflife;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class PixelCheck {

    public static void checkingPixel(){

        Color black = new Color(255,255,255,255);

        for(int checkrow = 0; checkrow < Table.rowsAmount; checkrow++){
            for(int checkcolumn = 0; checkcolumn < Table.columnsAmount; checkcolumn++){

                Rectangle rectangle = new Rectangle();
                rectangle.setWidth(Table.width/Table.columnsAmount);
                rectangle.setHeight(Table.height/Table.rowsAmount);


            }
        }
    }
}
