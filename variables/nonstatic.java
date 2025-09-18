public class nonstatic {
    int i;
    public static void main(String[] args){
        nonstatic a1=new nonstatic();
        a1.i=10;
        System.out.println(a1.i);
        a1.i=20;
        System.out.println(a1.i);
        
        

    }
    
}
