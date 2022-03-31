package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaUsage {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("eeeee", "a",  "ccc", "dddd", "bb");
        Comparator<String> comparator = (left, right) -> {
            System.out.println("Длина " + left + " : " + left.length());
            System.out.println("Длина " + right + " : " + right.length());
            String res = left.length() > right.length() ? left + " > " + right : left + " < " + right;
            System.out.println(res);
            System.out.println("*******************");
            return Integer.compare(right.length(), left.length());
        };
        strings.sort(comparator);
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
