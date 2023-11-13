package opgaver.Opgave2;

import java.util.List;

public class Counter {
    public static int count(List<Integer> list) {
        return count(list, 0, list.size() - 1);
    }

    public static int count(List<Integer> list, int l, int h) {
        int countZero = 0;
        if (l == h) {
            if (list.get(h) == 0) {
                countZero++;
            }
        } else {
            int m = (l + h) / 2;
            int sum1 = count(list, l, m);
            int sum2 = count(list, m + 1, h);
            countZero = sum1 + sum2;
        }
        return countZero;
    }
}
