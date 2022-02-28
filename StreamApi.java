package StreamApi1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        ArrayList<Integer> newList = new ArrayList<>();
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0) {
                if (list.get(i) % 2 == 0) {
                    newList.add(list.get(i));
                }
            }
        }
        Collections.sort(newList);
        System.out.println(newList);
    }
}
