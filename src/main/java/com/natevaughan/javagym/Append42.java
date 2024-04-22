package com.natevaughan.javagym;

import java.util.Arrays;

public class Append42 {

    static String[] transform(String[] strs) {
        return Arrays.stream(strs)
            .map((String str) -> str + "42")
            .toArray(String[]::new);
    }
}
