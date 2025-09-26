public class Gcd15 {
    public static void main(String[] args) {
    int a=18;
    int b=12;
    int d=a<b?a:b;
    while(true){
        if(a%d==0 && b%d==0){
            break;
        }
        d--;
        }
        System.out.println(d);
    }
    
}


