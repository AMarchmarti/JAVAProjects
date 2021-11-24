package org.lasencinas;


import java.util.*;

public class Quicksort {

    /* ---- Behaviours ---- */
    public void sort(int[] array) {
        Stack<Tarea> stack = new Stack<>();

        int start = 0;
        int end = array.length - 1;

        stack.push(new Tarea(start, end));

        while (!stack.isEmpty()) {
            Tarea tarea = stack.pop();
            start = tarea.getInitPos();
            end = tarea.getFinalPos();

            int pivot = partition(array, start, end);

            if (pivot - 1 > start) {
                stack.push(new Tarea(start, pivot - 1));
            } else if (pivot + 1 < end) {
                stack.push(new Tarea(pivot + 1, end));
            }
        }
    }

    public static int partition(int array[], int start, int end) {
        int pivot = array[end];
        int izq = start;
        int der = end - 1;
        while (izq != der){
            if(array[izq] < pivot){
                izq ++;
            }else if (array[der] > pivot){
                der --;
            }else{
                swap(array, izq, der);
            }
        }
        swap(array, end, izq);
        return izq;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
