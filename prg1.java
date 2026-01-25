import java.util.*;
public class prg1 {
    public static void main(String[] args) {
        double f,m;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter distance in meter :");
        m=s.nextDouble();
        f=m*3.28084;
        System.out.printf("The distance in feet is %.2f",f);
    }
}