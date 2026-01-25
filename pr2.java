import java.util.*;
public class pr2 {
    public static void main(String[] args) {
        int n;
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a 5 digit no. : ");
        n=s.nextInt();
        int place=1;
        int result=0;
        while (n>0) {
            int digit=(n%10)+1;
            result+=(digit*place);
            place*=10;
            n/=10;
        }
        System.out.println(result);
    }
}