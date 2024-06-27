import java.util.ArrayList;
import java.util.List;
public class pallendromepartioning {
    public static void main(String[] args) {
            String input = "aab";
            List<List<String>> result = new ArrayList<>();
            hold(input, new ArrayList<>(), result);

            for (List<String> partition : result) {
                System.out.println(partition);
            }
        }

        public static boolean palindrome(String p) {
            int l = 0;
            int o = p.length() - 1;
            while (l < o) {
                if (p.charAt(o) != p.charAt(l)) {
                    return false;
                }
                l++;
                o--;
            }
            return true;
        }

        public static void hold(String k, List<String> current, List<List<String>> result) {
            if (k.length() == 0) {
                result.add(new ArrayList<>(current));
                return;
            }
            for (int i = 1; i <= k.length(); i++) {
                String p = k.substring(0, i);
                String l = k.substring(i);
                if (palindrome(p)) {
                    current.add(p);
                    hold(l, current, result);
                    current.remove(current.size() - 1); // backtrack
                }
            }
    }
}
