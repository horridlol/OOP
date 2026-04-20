public class prg6{
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
}
class Rectangle{
    double width=1, height=1;
    Rectangle(){
        return;
    }
    Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    double getArea(){
        return width*height;
    }
    double getPerimeter(){
        return 2*(width+height);
    }
}