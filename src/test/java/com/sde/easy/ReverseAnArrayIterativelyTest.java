package com.sde.easy;

import com.sde.easy.code_ds.ReverseAnArrayIteratively;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReverseAnArrayIterativelyTest {

    @Test
    public void testReverse_emptyArray() {
        int[] array = {};
        ReverseAnArrayIteratively.reverse(array);
        assertArrayEquals(new int[] {}, array);

    }

    @Test
    public void testReverse_oneElementArray() {
        int[] array= {1};
        ReverseAnArrayIteratively.reverse(array);
        assertArrayEquals(new int[] {1}, array);

    }

    @Test
    public void testReverse_oddLengthArray() {
        int[] array= {1,2,3};
        ReverseAnArrayIteratively.reverse(array);
        assertArrayEquals(new int[] {3,2,1}, array);

    }

    @Test
    public void testReverse_evenLengthArray() {
        int[] array= {1,2,3,4};
        ReverseAnArrayIteratively.reverse(array);
        assertArrayEquals(new int[] {4,3,2,1}, array);

    }
}
