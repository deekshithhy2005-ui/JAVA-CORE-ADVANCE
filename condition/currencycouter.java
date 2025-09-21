import java.util.*;
public class currencycouter {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a amount(in multiple by 100)");
        int a=sc.nextInt();
        if(a>=2000){
            System.out.println("2000 x"+(a/2000));
            a=a%2000;
        }
            if(a>=500){
            System.out.println("500 x"+(a/500));
            a=a%500;
        }
        if(a>=200){
            System.out.println("200 x"+(a/200));
            a=a%200;

    }
    if(a>=100){
            System.out.println("100 x"+(a/100));
            a=a%100;
    }
    
}
}
