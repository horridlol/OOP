import java.util.*;
public class prg4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter your weight(in Pounds) : ");
        double p=s.nextDouble();
        System.out.print("Enter your height(in Inches) : ");
        double i=s.nextDouble();
        double w=p*0.45359237;
        double h=i*0.0254;
        double bmi=(w/(h*h));
        System.out.printf("Your Body Mass Index is %.2f",bmi);
    }
}
