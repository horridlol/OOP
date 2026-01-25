import java.util.*;
public class pr1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the amount : ");
        int x=s.nextInt();
        int n[]={100,50,10,5,2,1};
        for (int i:n){
            if((x/i)>0){
                System.out.println("We need "+(x/i)+" notes of "+i);
                x=x%i;
            }
        }
        s.close();
    }
}