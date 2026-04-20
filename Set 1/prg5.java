import java.util.*;
public class prg5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter lenght of side A : ");
        double a=s.nextDouble();
        System.out.print("Enter lenght of side B : ");
        double b=s.nextDouble();
        System.out.print("Enter lenght of side C : ");
        double c=s.nextDouble();
        if((a+b>c) && (a+c>b) && (b+c>a)){
            double x=(a+b+c)/2;
            double area=Math.sqrt(x*(x-a)*(x-b)*(x-c));
            System.out.printf("The area of triangle is %.3f",area);
        }
        else{
            System.out.println("Given dimensions are not of a Triangle");
        }
    }
}