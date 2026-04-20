import java.util.*;
class Shapes{
    void calculateVolume(double l){
        System.out.printf("Volume of cube is : %.2f cm",(l*l*l));
    }
    void calculateVolume(double l,double w,double h){
        System.out.printf("\nVolume of Rectangular cube is : %.2f cm",(l*w*h));
    }
    void calculateVolume(float r){
        System.out.printf("\nVolume of Sphere is : %.2f cm",((4/3)*3.14*r*r));
    }
}
public class prg12 {
    public static void main(String[] args) {
        Shapes cube=new Shapes();
        Shapes cuboid=new Shapes();
        Shapes sphere=new Shapes();
        cube.calculateVolume(15);
        cuboid.calculateVolume(15, 6, 8);
        sphere.calculateVolume(16);
    }
}
