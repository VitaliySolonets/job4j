package ru.job4j.array;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MergeArrayTest {
    @Test
    public void whenOneThreeAndTwoFourThenOneTwoThreeFour() {
        MergeArray array = new MergeArray();
        int[] left = new int[]{1, 3};
        int[] right = new int[]{2, 4};
        int[] result = array.merge(left, right);
        int[] expect = new int[]{1, 2, 3, 4};
        assertThat(result, is(expect));

    }
}
