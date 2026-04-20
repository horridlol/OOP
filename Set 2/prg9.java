import java.util.*;

class Rectangle{
    double width,height;
    void setvalue(double w,double h){
        width=w;
        height=h;
        System.out.println("Width : "+width+" Height : "+height);
    }
    double area(){
        return width*height;
    }
    double perimeter(){
        return 2*(width+height);
    }
}
public class prg9 {
    public static void main(String[] args) {
        System.out.println("Rectangle 1 : ");
        Rectangle r1=new Rectangle();
        r1.setvalue(4, 40);
        System.out.printf("Area : %.2f",r1.area());
        System.out.printf("\nPerimeter : %.2f",r1.perimeter());
        System.out.println("\n--------------------------------------------");
        System.out.println("Rectangle 2 :");
        Rectangle r2=new Rectangle();
        r2.setvalue(3.5, 35.9);
        System.out.printf("Area : %.2f",r2.area());
        System.out.printf("\nPerimeter : %.2f",r2.perimeter());
        System.out.println("\n--------------------------------------------");
        if (r1.area()>r2.area()){
            System.out.println("Rectangle 1 has larger area");
        }
        else if(r1.area()<r2.area()){
            System.out.println("Rectanlge 2 has larger area");
        }
        else{
            System.out.println("Both Rectangles have same area");
        }
    }
}
