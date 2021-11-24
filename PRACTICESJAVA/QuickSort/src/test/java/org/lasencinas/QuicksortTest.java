package org.lasencinas;

import org.junit.Assert;

import org.junit.Test;
import java.util.Arrays;

public class QuicksortTest {

    /* ---- Properties ---- */
    private int[] array = {1, 5, 76, 23, 54, 12, 89, 2};

    @Test
    public void quicksortTest() {
        int [] arrayOrdenada = {1, 2, 5, 12, 23, 54, 76, 89};

        Quicksort quicksort = new Quicksort();
        quicksort.sort(array);
        System.out.println(Arrays.toString(array));
    }}
