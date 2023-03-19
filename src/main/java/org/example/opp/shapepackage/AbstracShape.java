package org.example.opp.shapepackage;

import java.awt.*;

abstract class AbstracShape {
    String color;
    String id;

    public AbstracShape(String color, String id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    abstract double getArea();
    abstract double getPerimeter();
    abstract void move(Point point);
    abstract void resize(double scale);
}
