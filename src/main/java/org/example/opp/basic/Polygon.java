package org.example.opp.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point [] vertices;
    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public Point[] getVertices() {
        return vertices;
    }

    public void setVertices(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount(){
        return vertices.length;
    }

    public double getPerimeter(){
        double perimeter = 0;
        for(int i = 0; i < this.vertices.length - 1; i++){
            perimeter += this.vertices[i].distance(vertices[i + 1]);
        }
        perimeter += this.vertices[0].distance(vertices[vertices.length - 1]);
        return perimeter;
    }

    public double getDouble(){
        double firstArea = 0, secondArea = 0;
        for(int i = 0; i < vertices.length - 2; i++){
            firstArea += this.vertices[i].x * this.vertices[i + 1].y;
            secondArea += this.vertices[i + 1].x * this.vertices[i].y;
        }
        firstArea += this.vertices[vertices.length - 1].x * this.vertices[0].y;
        secondArea += this.vertices[0].x + this.vertices[vertices.length - 1].y;
        return 0.5 * Math.abs(firstArea - secondArea);
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
