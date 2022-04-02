package ru.job4j.function;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.Predicate;

public class StrategyUsage {
    public boolean empty(String s) {
        return check(str -> str.isEmpty(), s);
    }

    public boolean startWith(String s, String pref) {
        return check(str -> str.startsWith(pref), s);
    }

    public boolean contains(String s, String key) {
        return check(str -> str.contains(key), s);
    }

    public boolean check(Predicate<String> pred, String s) {
        return pred.test(s);
    }

    public String transform(Function<String, String> fun, String s) {
        return fun.apply(s);
    }

    public static void main(String[] args) {
        StrategyUsage usage = new StrategyUsage();
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.isEmpty(), ""
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.startsWith("Fun"), "Functional interface"
                )
        );
        System.out.println(
                "Результат работы: " + usage.check(
                        str -> str.contains("rn"), "Surname Name"
                )
        );
        System.out.println(
                "Результат работы function: " + usage.transform(
                        str -> str.toUpperCase(), "hello"
                )
        );
        System.out.println(
                "Result: " + usage.transform(
                        str -> str.concat("CONCAT"), "hello"
                )
        );
        System.out.println(
                "Result: " + usage.transform(
                        s -> s.trim(), "                 This is method return String without more space at begin"
                )
        );
    }
}
