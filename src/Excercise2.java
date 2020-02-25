import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise2 {
    public static boolean subset(boolean[] s, boolean[] t) {
        if (s.length > t.length) {
            for (int i = t.length; i < s.length; i++) {
                if (s[i]) {
                    return false;
                }
            }
        }

        for (int i = 0; i < s.length; i++) {
            if (s[i] && !t[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] union(boolean[] s, boolean[] t) {
        boolean[] booleans = new boolean[Math.max(s.length, t.length)];
        if (s.length > t.length) {
            for (int i = t.length; i < s.length; i++) {
                if (s[i]) {
                    booleans[i] = true;
                }
            }
        } else {
            for (int i = s.length; i < t.length; i++) {
                if (t[i]) {
                    booleans[i] = true;
                }
            }
        }

        for (int i = 0; i < Math.min(s.length,t.length); i++) {
            if (s[i] || t[i]) {
                booleans[i] = true;
            }
        }
        return booleans;
    }

    public static void main(String[] args) {
        boolean[] boo1 = {true, false, false, true, false, false, false, true, false, true, false};
        boolean[] boo2 = {true, false, false, true, true, false, true, true};

        System.out.println(subset(boo1, boo2));
        System.out.println(Arrays.toString(union(boo1,boo2)));
    }

}



