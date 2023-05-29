package com.example.testduplicatechildren;

import javafx.scene.Node;
import javafx.scene.layout.Region;
import javafx.scene.shape.Sphere;

import java.util.Objects;

public class Test extends Region {
    Node node;
    Node n2;
    double charge = 1;

    public Test(Node node) {
        this.node = node;
        getChildren().add(this.node);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return Double.compare(test.charge, charge) == 0 && Objects.equals(node, test.node);
    }

    @Override
    public int hashCode() {
        return Objects.hash(node, charge);
    }
}
