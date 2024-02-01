package com.example.aeroluxjavafx;

import com.example.aeroluxjavafx.utils.MyDatabase;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        MyDatabase db = MyDatabase.getInstance();
        MyDatabase db2 = MyDatabase.getInstance();
        System.out.println(db);
        System.out.println(db2);
        System.out.println("java: error: release version 21 not supported" );


    }
}
