package opgaver.Opgave2;

import java.util.List;

public class Counter {
    public int count(List<Integer> list) {
        return count(list, 0, list.size() - 1);
    }

    private int count(List<Integer> list, int l, int h) {
        int result = 0;
        if (l == h) {
            result = list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = count(list, l, m);
            int sum2 = count(list, m + 1, h);
            result = sum1 + sum2;
        }
        return result;
    }
}
