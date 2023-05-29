package com.example.testduplicatechildren;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Region;
import javafx.scene.shape.Sphere;

import java.util.Objects;

public class ChargedSphere extends Sphere {
    double charge;

    public ChargedSphere(double charge) {
        this.charge = charge;
    }

    public ChargedSphere(double v, double charge) {
        super(v);
        this.charge = charge;
    }

    public void setCenter(double x, double y){
        setTranslateX(x);
        setTranslateX(y);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ChargedSphere that = (ChargedSphere) o;
        return Double.compare(that.charge, charge) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(charge);
    }
}
