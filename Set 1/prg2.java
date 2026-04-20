import java.util.*;
public class prg2 {
    public static void main(String[] args) {
        double a,b,c,d,e,f,x,y;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter value of a : ");
        a=s.nextDouble();
        System.out.print("Enter value of b : ");
        b=s.nextDouble();
        System.out.print("Enter value of c : ");
        c=s.nextDouble();
        System.out.print("Enter value of d : ");
        d=s.nextDouble();
        System.out.print("Enter value of e : ");
        e=s.nextDouble();
        System.out.print("Enter value of f : ");
        f=s.nextDouble();
        double da=(a*d)-(b*c);
        double dx=(e*d)-(b*f);
        double dy=(a*f)-(c*e);
        x=dx/da;
        y=dy/da;
        System.out.println("Value of x is "+x);
        System.out.println("Value of y is "+y);
    }
}
