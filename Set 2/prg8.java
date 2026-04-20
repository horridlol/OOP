import java.util.*;
class point{
    int x,y;
    point(){
        int x=5,y=5;
    }
    point(point a){
        this.x=a.x;
        this.y=a.y;
    }
    point(int x,int y){
        this.x=x;
        this.y=y;
    }
    void display(){
        System.out.println("Coordinates : ("+x+","+y+")");
    }
}
public class prg8 {
    public static void main(String[] args) {
        point p1=new point();
        System.out.print("Default : ");
        p1.display();

        point p2=new point(21,12);
        System.out.print("Paramitarized : ");
        p2.display();
        
        point p3=new point(p1);
        System.out.print("Copy of default : ");
        p3.display();
    }
}