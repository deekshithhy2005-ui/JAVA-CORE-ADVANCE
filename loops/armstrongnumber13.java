import java.util.*;
public class armstrongnumber13 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a num");
    int n=sc.nextInt();
         int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<=n;i++)
            {
                prod=prod*d;

            }
            sum=sum+prod;
            n=n/10;
        }
        if(sum==temp){
        System.out.println("armstrongs num");
        }
        else{
            System.out.println("not armstrong num");
        }
    }
    

        }
    

