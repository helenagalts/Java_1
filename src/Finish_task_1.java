import java.util.Scanner;

public class Finish_task_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = 0;
        String s = in.nextLine();
        for (int pos = 0; pos < s.length(); ++pos) {
            int i = s.length() - 1 - pos;
            char c = s.charAt(pos);
            if (c == '1') {
                res |= 1 << i;
            } else if (c != '0') {
                System.out.println("Incorrect symbol: " + c);
                return;
            }
        }

        System.out.println(res);
    }
}
