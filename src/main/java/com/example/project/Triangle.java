package com.example.project;
import java.lang.Math;

public class Triangle {

    private double x0;
    private double y0;
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Triangle() {//constructs public object called Triangle with no parameters
        x0 = 0.0;
        y0 = 0.0;
        x1 = 0.0;
        y1 = 0.0;
        x2 = 0.0;
        y2 = 0.0;
    }

    public Triangle(double x0, double y0, double x1, double y1, double x2, double y2) { //constructs public object Triangle with six double parameters (x0,y0,x1,y1,x2,y2)
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getx0() {
        return x0;
    }
    public double gety0() {
        return y0;
    }
    public double getx1() {
        return x1;
    }
    public double gety1() {
        return y1;
    }
    public double getx2() {
        return x2;
    }
    public double gety2() {
        return y2;
    }

    public double perimeter(){
        double distance1 = Math.pow(x1-x0,2)+Math.pow(y1-y0,2);
        distance1 = Math.sqrt(distance1);
        double distance2 = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        distance2 = Math.sqrt(distance2);
        double distance3 = Math.pow(x0-x2,2)+Math.pow(y0-y2,2);
        distance3 = Math.sqrt(distance3);
        double totalDistance = distance1 + distance2 + distance3;
        return totalDistance;
    }

    public double area(){
        double a = Math.pow(x1-x0,2)+Math.pow(y1-y0,2);
        a = Math.sqrt(a);
        double b = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
        b = Math.sqrt(b);
        double c = Math.pow(x0-x2,2)+Math.pow(y0-y2,2);
        c = Math.sqrt(c);
        double s = (a+b+c)/2;
        double area = Math.sqrt((s)*(s-a)*(s-b)*(s-c));
        return area;
    }

    public void translateX(double translateValue){
        x0 = x0 + translateValue;
        x1 = x1 + translateValue;
        x2 = x2 + translateValue;
    }

    public void translateY(double translateValue){
        y0 = y0 + translateValue;
        y1 = y1 + translateValue;
        y2 = y2 + translateValue;
    }

    public double length(int point1, int point2){
        double distance;
        if (point1 == 0 && point2 == 1){
            distance = Math.pow(x1-x0,2)+Math.pow(y1-y0,2);
            distance = Math.sqrt(distance);
        }
        else if (point1 == 1 && point2 == 2){
            distance = Math.pow(x2-x1,2)+Math.pow(y2-y1,2);
            distance = Math.sqrt(distance);
        }
        else {
            distance = Math.pow(x0 - x2, 2) + Math.pow(y0 - y2, 2);
            distance = Math.sqrt(distance);
        }
        return distance;
    }

}
