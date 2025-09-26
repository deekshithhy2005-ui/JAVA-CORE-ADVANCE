import java.util.*;
public class strongnumber11 {
    public static void main(String[] args) {
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<=d;i++){
            prod=prod*i;
        }
        sum=sum+prod;
        n=n/10;
        }
        System.out.println("sum="+sum);
        if(sum==temp){
            System.out.println("strong num");

        }else{
            System.out.println("not a strong num");

        }
        }

    }
    
