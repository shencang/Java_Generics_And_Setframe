package Generics;

public class Circle {
    double area;
    double raduis;
    public Circle(double r){
        raduis=r;
    }

    @Override
    public String toString() {
        area=raduis*raduis*Math.PI;
        return ""+area;
    }
}
