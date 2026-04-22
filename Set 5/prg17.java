import javax.sound.sampled.SourceDataLine;

interface Exam{
    boolean isPassed(int mark);
}
interface Classify{
    String getDivision(double Average);
}
class Result implements Exam,Classify{
    public boolean isPassed(int mark){
        if(mark>=33){
            return true;
        }
        else{
            return false;
        }
    }
    public String getDivision(double average) {
        if (average >= 75) {
            return "Distinction";
        } else if (average >= 60) {
            return "First Division";
        } else if (average >= 50) {
            return "Second Division";
        } else {
            return "Third Division";
        }
    }
}

public class prg17 {
    public static void main(String[] args) {
        Result r=new Result();
        int mark=55;
        boolean passed=r.isPassed(mark);
        System.out.println("Marks Obtained : "+mark+"\nPassed : "+passed);
        System.out.println("=========================================");
        double average=72;
        String div=r.getDivision(average);
        System.out.println("Average marks : "+average+"\nDivision : "+div);
    }
}
