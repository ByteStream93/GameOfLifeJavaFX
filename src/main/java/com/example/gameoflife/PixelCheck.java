package com.example.gameoflife;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Rectangle;

public class PixelCheck {

    public static void checkingPixel(){

        int livingNeighbours[][] = new int[Table.columnsAmount][Table.rowsAmount];

        for(int row = 0; row < Table.rowsAmount; row++){
            for(int column = 0; column < Table.columnsAmount; column++){


                int rowAbove = row - 1;
                if (rowAbove < 0)
                {
                    rowAbove = Table.rowsAmount - 1;
                }

                int rowBelow = row + 1;
                if (rowBelow >= Table.rowsAmount)
                {
                    rowBelow = 0;
                }

                int columnLeft = column - 1;
                if (columnLeft < 0)
                {
                    columnLeft = Table.columnsAmount - 1;
                }

                int columnRight = column + 1;
                if (columnRight >= Table.columnsAmount)
                {
                    columnRight = 0;
                }

                int neighbour = 0;

                if(Table.rectanglesField[rowAbove][columnLeft].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[rowAbove][column].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[rowAbove][columnRight].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[row][columnLeft].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[row][columnRight].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[rowBelow][columnLeft].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[rowBelow][column].getFill() == Color.WHITE){
                    neighbour++;
                }
                if(Table.rectanglesField[rowBelow][columnRight].getFill() == Color.WHITE){
                    neighbour++;
                }
                livingNeighbours[row][column] = neighbour;

            }
        }
        for(int row = 0; row < Table.rowsAmount; row++) {
            for (int column = 0; column < Table.columnsAmount; column++) {

                if(livingNeighbours[row][column]<2 || livingNeighbours[row][column] > 3){
                    Table.rectanglesField[row][column].setFill(Color.BLACK);
                }else if (livingNeighbours[row][column] == 3){
                    Table.rectanglesField[row][column].setFill(Color.WHITE);
                }

            }
        }
    }
}
