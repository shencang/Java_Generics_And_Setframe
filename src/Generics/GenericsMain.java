package Generics;

public class GenericsMain {
    public GenericsMain(){
        Circle circle =new Circle(10);
        Cone<Circle> coneOne =new Cone<Circle>(circle);
        coneOne.setHeight(16);
        System.out.println(coneOne.computerVolume());

        Rect rect = new Rect(15,23);
        Cone<Rect> coneTwo =new Cone<Rect>(rect);
        coneTwo.setHeight(98);
        System.out.println(coneTwo.computerVolume());


    }
}
