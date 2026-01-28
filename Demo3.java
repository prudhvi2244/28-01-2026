
/*
  1)Find Length of a String without using length() method
  2)Find number of vowels and consonents 
  3)Remove Duplicate Characters from String : SET + StringBuilder|StringBuffer
*/
import java.util.HashSet;
import java.util.Set;

class Demo3 {
    public static void main(String[] args) {
        String s = "india";
        Set<Character> set = new HashSet<Character>();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                sb.append(s.charAt(i));
            }
        }

        System.out.println(new String(sb));
    }
}