import java.util.*;
class Shape{
    double d1,d2;
    void getData(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
}
class Triangle extends Shape{
    void TriangleArea(){
        System.out.printf("Area of Trianlge : %.2f",(0.5*super.d1*super.d2));
    }
}
class Rectangle extends Shape{
    void RecArea(){
        System.out.printf("\nArea of Rectanlge : %.2f",(super.d1*super.d2));
    }
}
public class prg13 {
    public static void main(String[] args) {
        Triangle s1=new Triangle();
        s1.getData(10,15);
        s1.TriangleArea();

        Rectangle s2=new Rectangle();
        s2.getData(10,15);
        s2.RecArea();
    }
}
