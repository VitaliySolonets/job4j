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

    @Test
    public void whenArrayVarious() {
        MergeArray array = new MergeArray();
        int[] result = array.merge(new int[]{2, 3, 4, 6, 7, 8}, new int[]{1, 5, 9});
        int[] ex = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        assertThat(result, is(ex));
    }
}
