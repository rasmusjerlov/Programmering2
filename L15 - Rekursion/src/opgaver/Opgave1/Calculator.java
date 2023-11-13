package opgaver.Opgave1;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    public int sum(List<Integer> list) {
        return sum (list, 0, list.size() - 1);
    }

    private int sum (List<Integer> list, int l, int h) {
        int result = 0;
        if (l == h) {
            result = list.get(l);
        } else {
            int m = (l + h) / 2;
            int sum1 = sum(list, l, m);
            int sum2 = sum(list, m + 1, h);
            result = sum1 + sum2;
        }
        return result;
    }
}
