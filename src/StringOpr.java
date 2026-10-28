import java.util.Arrays;

public class StringOpr {
    public static boolean AnagramCheck(String s, String t){
        char[] s2 = s.toCharArray();
        char[] t2 = t.toCharArray();

        if(s2.length!=t2.length){
            return false;
        }
        // 1st Bubble sorting
        for(int i=0; i< s2.length-1; i++){
            for(int j=0; j< s2.length -1-i; j++){
                if(s2[j+1]<s2[j]){
                    char temp = s2[j];
                    s2[j] = s2[j+1];
                    s2[j+1] = temp;
                }
            }
        }
        // 2nd Bubble sorting
        for(int i=0; i< t2.length-1; i++){
            for(int j=0; j< t2.length -1-i; j++){
                if(t2[j+1]<t2[j]){
                    char temp = t2[j];
                    t2[j] = t2[j+1];
                    t2[j+1] = temp;
                }
            }
        }

        return Arrays.equals(s2, t2);

    }
}
