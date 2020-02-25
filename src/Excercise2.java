import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Excercise2 {
    public boolean subset(Boolean[] s, Boolean[] t) {
        for (int i = 0; i < s.length; i++) {
            if (s[i] && !t[i]) {
                return false;
            }
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Boolean[] boo1 = {true, false, false, true, false, false, false, true};
        Boolean[] boo2 = {true, false, false, true, true, false, true, false};


        System.out.println();
    }
}




