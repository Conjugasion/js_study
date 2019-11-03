import java.util.*;

/**
 * @author Lucas
 * @date 2019-11-03 14:52
 */
public class captain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int[] num = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            num[i] = Integer.parseInt(s[i]);
        }
        for (int i = 1; i < num.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (num[j+1]>num[j]) break;
                int temp = num[j+1];
                num[j+1] = num[j];
                num[j] = temp;
            }
        }
        System.out.println(Arrays.toString(num));
    }
}
