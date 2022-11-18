package Education;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {

//        System.out.println(List.of(1, 2, 3, 4, 5).stream().map(e -> e * 2).filter(e -> e > 5).collect(Collectors.toList()));
        List<Integer> list = new ArrayList<>();
        List<Integer> listCopy = new ArrayList<>();
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }

        for (Integer number : list) {
            number = number * 2;
            if (number > 5) {
                listCopy.add(number);
//                System.out.println(number);
            }
        }

//        for (int i = 0; i < list.size(); i++) {
//            Integer b = list.get(i) * 2;
//            if (b > 5) {
//                listCopy.add(b);
//            }
//        }

//        for (int i: listCopy) {
//            System.out.println(i);
//        }

        listCopy.forEach(System.out::println);
    }
}
