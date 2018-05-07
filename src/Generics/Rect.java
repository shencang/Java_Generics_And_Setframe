package Generics;

public class Rect {
    double sideA;
    double sideB;
    double area;
    public  Rect(double a,double b){
        sideA=a;
        sideB=b;

    }

    @Override
    public String toString() {
        area=sideA*sideB;
        return ""+area;
    }
}
