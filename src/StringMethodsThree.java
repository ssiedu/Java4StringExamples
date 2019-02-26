public class StringMethodsThree {
public static void main(String[] args) {
    String s1="java program for testing string";
    for(int i=5; i<=15; i++){
    char ch=s1.charAt(i);
    System.out.println(ch);
    }
    System.out.println("____________________________");
    String s2="ABCDE";
    char c[]=s2.toCharArray();
    for(char tmp:c){
        System.out.println(tmp);
    }
    System.out.println("____________________________");
    byte b[]=s2.getBytes();
    
    for(byte var:b){
        System.out.println(var);
    }
    
    System.out.println("__________________________________");
    char ar[]={'a','b','c','d','e','f','g','h'};
    
    String str=new String(ar);
    
    byte btar[]=str.getBytes();
    for(byte bval:btar){
        System.out.println(bval);
    }
    System.out.println("____________________________");
    int len=s1.length();
    System.out.println(len);
    
    
}
}
/*
    char charAt(int)
    char[] toCharArray()
    byte[] getBytes()
    int length()
*/
