package q2;

/**
 *  Rev question 1.
 */
public class Sa {

    public static void main(String ... args) {
        System.out.println(isReverse("CIaaaaO", "OAAAAIC"));
    }

    public static boolean isReverse(String s1, String s2) {
        boolean rev = false;
        System.out.println("s1 is " + s1 + " and s2 is " + s2);
        if (s1.length() != s2.length()) return false;
        if (s1.length() == 0 && s2.length() == 0) return true;
        if (s1.toLowerCase().charAt(0) != s2.toLowerCase().charAt(s2.length() -1)) return false;
        return isReverse(s1.substring(1,s1.length()), s2.substring(0, s2.length() -1));
    }
}
