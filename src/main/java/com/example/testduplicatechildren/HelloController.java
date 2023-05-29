package com.example.testduplicatechildren;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Region;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

import java.util.ArrayList;
import java.util.List;

public class HelloController {
    @FXML private AnchorPane root;
    @FXML private Button deleteButton;

    private ArrayList<ChargedSphere> circleArrayList = new ArrayList<>();

    @FXML public void onClick(MouseEvent e) {
        /*
        ChargedSphere circle = new ChargedSphere(10, 10);

        circle.setCenter(e.getX(), e.getY());
        root.getChildren().add(circle);
        circle.setVisible(true);

        circleArrayList.add(circle);*/

        Test t = new Test(new Sphere(10));
        root.getChildren().add(t);

        System.out.println(e);
        t.setTranslateX(e.getX());
        t.setTranslateY(e.getY());


        /*
        t.sphere.setTranslateX(e.getX());
        t.sphere.setTranslateY(e.getY());
        root.getChildren().add(t.sphere);
        */

        t.setVisible(true);
    }

    @FXML void onDelete(MouseEvent event) {
        root.getChildren().removeIf(node -> node instanceof Region);
        circleArrayList.clear();
    }
}
