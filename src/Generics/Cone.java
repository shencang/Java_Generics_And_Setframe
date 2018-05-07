package Generics;

public class Cone<Gen> {
    double height;
    Gen bootom;
    public Cone (Gen bootom){
        this.bootom=bootom;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public  double computerVolume(){
        String s=bootom.toString();
        double area=Double.parseDouble(s);
        return 1.0/3.0*area*height;
    }
}
