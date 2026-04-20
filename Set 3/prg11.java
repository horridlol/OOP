import java.util.*;

class College{
    String collegeName;
    College(String c){
        collegeName=c;
    }
    public class Admission{
        String studentName,studentCourse;
        void setdetails(String s,String sc){
            studentName=s;
            studentCourse=sc;
        }
        void displaydetails(){
            System.out.println("Admission Details");
            System.out.println("College name : "+collegeName);
            System.out.println("Student name : "+studentName);
            System.out.println("Student's course : "+studentCourse);
        }
    }
}

public class prg11 {
    public static void main(String[] args) {
        College c=new College("SSASIT");
        College.Admission a=c.new Admission(); 

        a.setdetails("Rajesh", "CSE");
        a.displaydetails();
    }
}
