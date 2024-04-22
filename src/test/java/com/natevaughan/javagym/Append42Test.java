package com.natevaughan.javagym;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class Append42Test {

    @Test
    void testTransform() {
        String[] myStrings = new String[] { "foo", "bar", "baz" };
        String[] transformed = Append42.transform(myStrings);
        assertTrue(
                Arrays.asList(transformed).contains("foo42"),
            "It should append 42 to each string"
        );
    }
}
