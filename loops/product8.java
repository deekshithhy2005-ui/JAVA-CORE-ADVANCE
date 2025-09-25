import java.util.*;
public class product8 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
    int n=sc.nextInt();
    int prod=1;
    for( int i=1;i<=n;i++)
    {
        prod=prod+i;
    }
    System.out.println(prod);

    }

    
}
