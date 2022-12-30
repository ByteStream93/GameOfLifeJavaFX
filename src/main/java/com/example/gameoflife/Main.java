package com.example.gameoflife;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public static GraphicsContext graphicsContext;
    @Override
    public void start(Stage primaryStage) {
        
        Group group = new Group();
        Scene scene = new Scene(group);
        Canvas canvas = new Canvas(Table.width,Table.height);
        group.getChildren().add(canvas);
        graphicsContext = canvas.getGraphicsContext2D();

        primaryStage.setWidth(Table.width);
        primaryStage.setHeight(Table.height);
        primaryStage.setTitle("Game of life");
        primaryStage.setScene(scene);
        primaryStage.show();
        Step.nextStep();
    }
}
