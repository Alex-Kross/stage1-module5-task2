package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        Operation<Integer> oper = (x) -> {
            List<Integer> list = new ArrayList<>();
            for (int el: x) {
                list.add(el / divider);
            }
            return list;
        };
        return oper;
    }
}
