public class StringMethodsFour {
public static void main(String[] args) {

    String s1="indore";
    String s2=s1.toUpperCase();
    System.out.println(s2);
    
    String s3="THIS IS JAVA";
    String s4=s3.toLowerCase();
    System.out.println(s4);
    
    String s5="  this is java  ";
    System.out.println(s5.length());
    String s6=s5.trim();
    System.out.println(s6.length());
    
    String s7="indore-bhopal-mumbai-delhi-chennai";
    String s8=s7.replace('-', ',');
    System.out.println(s8);

    String s9="hello";
    String s10="user";
    String s11=s9.concat(s10);  //s9+s10
    System.out.println(s11);

    String s12="java-program";
    String s13=s12.substring(5);
    System.out.println(s13);
    
    String s14=s12.substring(5, 9);
    System.out.println(s14);
    
    String s15="indore-bhopal-mumbai-delhi-chennai";
    String sarr[]=s15.split("-");
    System.out.println("_____________________________");
    for(String tmp:sarr){
        System.out.println(tmp);
    }
    System.out.println("_____________________________");
    
    boolean b=s15.contains("bhopal");
    System.out.println(b);
            
    int pos=s15.indexOf("pune");
    System.out.println(pos);
    
            

    
}
}
/*
    String toUpperCase()
    String toLowerCase()
    String trim()
    String replace(char,char)
    String concat(String)
    String substring(int)
    boolean contains(String)


*/
