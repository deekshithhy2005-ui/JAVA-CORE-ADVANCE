import java.util.*;
public class automorphic10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt();
        int s=n*n;
        boolean flag=true;
        while(n>0){
            if((n%10)!=(s%10)){
                flag=false;
                break;
            }
            n=n/10;
            s=s/10;
        }
        if(flag){
            System.out.println("it is a automorphic");
        }else{
            System.out.println("it is not a automorphic");

        }
        }

            }
        
