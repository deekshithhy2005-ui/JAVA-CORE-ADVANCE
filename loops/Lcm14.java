public class Lcm14 {
    public static void main(String[] args) {
        int a=4;
        int b=7;
        int n=a>b?a:b;
        int i=n;
        while(true){
            if(n%a==0 && n%b==0){
                break;
                n=n+i;
            }
            System.out.println(i);
            }
        }
    }
    
