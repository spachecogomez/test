package com.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NoRepCharTest {

    NonRepChar noRepChar = new NonRepChar();

    @Test
    public void testDefaultString(){
        String nonRepChar = noRepChar.removeDuplicates("AABBCCD112233");
        Assertions.assertEquals("ABCD123" , nonRepChar);
    }

    @Test
    public void testEmptyString(){
        String nonRepChar = noRepChar.removeDuplicates("");
        Assertions.assertEquals("" , nonRepChar);
    }

    @Test
    public void testNullString(){
        Assertions.assertThrows(NullPointerException.class, () -> {
            noRepChar.removeDuplicates(null);
        });

    }
}
