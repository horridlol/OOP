import java.util.*;
class prg3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter a letter : ");
        char x=s.next().charAt(0);
        if(Set.of('a','e','i','o','u','A','E','I','O','U').contains(x)){
            System.out.println("The letter you entered is a Vowel");
        }
        else{
            System.out.println("The letter you entered is a Consonant");
        }
    }
}