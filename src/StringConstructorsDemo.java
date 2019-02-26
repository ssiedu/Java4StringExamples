public class StringConstructorsDemo {
    
public static void show(String s){
    System.out.println(s);
}    
    
public static void main(String[] args) {
   
    
    char ch[]={'a','b','c','d','e','f','g','h'};
    byte b[]={65,66,67,68,69,70,71,72,73,74};
    
    String s1=new String("indore");
    String s2=new String(ch);
    String s3=new String(ch,0,3);
    String s4=new String(b);
    String s5=new String(b,4,2);
    String s6=new String();
    
    show(s1);
    show(s2);
    show(s3);
    show(s4);
    show(s5);
}
}

/*
    String(String)
    String(char[])
    String(char[],int,int)
    String(byte[])
    String(byte[],int,int)
    String()

*/
