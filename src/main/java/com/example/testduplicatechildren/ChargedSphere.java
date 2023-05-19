package com.example.testduplicatechildren;

import javafx.scene.input.MouseEvent;

import java.util.Objects;

public class ChargedSphere extends javafx.scene.shape.Sphere {
    double charge;

    public ChargedSphere(double charge) {
        this.charge = charge;
    }

    public double getCharge() {
        return charge;
    }

    public void setCharge(double charge) {
        this.charge = charge;
    }

    public void update(){
        this.setCenter(this.getLayoutX() + 0.5, this.getLayoutY() + 0.5);
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

    public void setCenter(double x, double y){
        this.setTranslateX(x);
        this.setTranslateY(y);
    }

    @Override
    public String toString() {
        return "ChargedSphere{" +
                "charge=" + charge +
                '}';
    }
}
