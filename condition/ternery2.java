import java.util.*;
public class ternery2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        String s=n%2==0?"even":"odd";
        System.out.println(s);
    }
    
}
