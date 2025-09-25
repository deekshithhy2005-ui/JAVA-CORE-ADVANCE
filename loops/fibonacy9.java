import java.util.*;
public class fibonacy9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num");
        int l=20;
        int u=1000;
        int a=0;
        int b=1;
        int c=0;
        while(a<=u){
            if(a>=l)
            System.out.println(a+"");
            c=a+b;
            a=b;
            b=c;
           
        }
    }
    
}
