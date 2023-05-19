package com.example.testduplicatechildren;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

import java.util.ArrayList;

public class HelloController {
    @FXML private AnchorPane root;
    private int i = 0;
    @FXML private Button deleteButton;

    private ArrayList<ChargedSphere> circleArrayList = new ArrayList<>();

    @FXML public void onClick(MouseEvent e) {
        ChargedSphere circle = new ChargedSphere(5 + i);
        i++;
      //  circle.setFill(Color.BLUE);
        circle.setRadius(10);

        circle.setTranslateX(e.getX());
        circle.setTranslateY(e.getY());

        root.getChildren().add(circle);
        circleArrayList.add(circle);
    }

    @FXML void onDelete(MouseEvent event) {
        root.getChildren().removeIf(node -> node instanceof Sphere);
        circleArrayList.clear();
    }
}
