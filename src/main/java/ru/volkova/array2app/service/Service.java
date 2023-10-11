package ru.volkova.array2app.service;

public class Service {
    public void sortAscending(int[] arr2) {
        boolean isSorted = false;
        int index = 0;
        while (!isSorted) {
            isSorted = true;
            for (index = 0; index < arr2.length - 1; index++) {
                int i = index;
                int j = index + 1;
                if (arr2[i] > arr2[j]) {
                    isSorted = false;
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                }
            }
        }
    }
}
