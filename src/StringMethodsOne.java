public class StringMethodsOne {
public static void main(String[] args) {
   String s1=new String("indore");
   String s2=new String("Indore");
   boolean b1=s1.equals(s2);
   System.out.println("Equals : "+b1);
   boolean b2=s1.equalsIgnoreCase(s2);
   System.out.println("EqualsIgnoreCase : "+b2);
   String s3="indonasia";
   boolean b3=s3.startsWith("indo");
   System.out.println(b3);
    
   String s4="www.google.uk";
   boolean b4=s4.endsWith(".com");
   System.out.println(b4);
   
   String s5="chennai";
   String s6="chennai";
   int n=s5.compareTo(s6);
   System.out.println(n);
   
   
   
   
   
   
}
}
/*
    boolean equals(String)
    boolean equalsIgnoreCase(String)
    boolean startsWith(String)
    boolean endsWith(String)
    int compareTo(String)

        int n=s1.compareTo(s2)

        s1>s2       +ve
        s1<s2       -ve
        s1=s2       0



*/