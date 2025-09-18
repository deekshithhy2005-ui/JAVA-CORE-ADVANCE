public class static2 {
    static int i=2;
    public static void main(String[] args){
        static2.m1();
        static2.i=20;
        static2.m1();
    }
    public static void m1(){
        System.out.println("m1 starts");
        System.out.println(i);
        System.out.println("m1 ends");
        
    }

    }


