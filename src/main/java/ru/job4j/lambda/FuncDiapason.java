package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FuncDiapason {

    public static List<Double> diapason(int start, int end, Function<Double, Double> function) {
        List<Double> res = new ArrayList<>();
        for (int i = start; i < end; i++) {
            res.add(function.apply((double) i));
        }
        return res;
    }

}
