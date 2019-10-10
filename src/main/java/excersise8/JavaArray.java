package excersise8;

public class JavaArray {
    public static void main(String[] args) {
        String[] javaWord = new String[4];
        javaWord[0] = "   J    a   v     v  a   ";
        javaWord[1] = "   J   a a   v   v  a a  ";
        javaWord[2] = "J  J  aaaaa   V V  aaaaa ";
        javaWord[3] = " JJ  a     a   V  a     a";
        for (int i = 0; i<javaWord.length; i++){
            System.out.println(javaWord[i]);
        }
    }
}
