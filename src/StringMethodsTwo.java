public class StringMethodsTwo {
    public static void main(String[] args) {
        String s="this is java code and java is powerful";
        int pos1=s.indexOf('i');
        System.out.println(pos1);
        
        int pos2=s.indexOf('i', 10);
        System.out.println(pos2);
    
        int pos3=s.indexOf("java");
        System.out.println(pos3);
        
        int pos4=s.indexOf("java", 12);
        System.out.println(pos4);
        
        int pos5=s.lastIndexOf('i');
        System.out.println(pos5);
        
        int pos6=s.lastIndexOf('i',25);
        System.out.println(pos6);
    }
}
/*
    int indexOf(char)   //starts search from index 0
    int indexOf(char,int) //starts search from given index
    int indexOf(String)
    int indexOf(String,int)
    
    int lastIndexOf(char)
    int lastIndexOf(char,int)
    int lastIndexOf(String)
    int lastIndexOf(String,int)


*/
