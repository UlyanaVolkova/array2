package ru.volkova.array2app._main;

import ru.volkova.array2app.service.Service;

import java.util.Arrays;

public class _Main {
    public static void main(String[] args) {
        int[] arr2 = {6, -2, 15, 4, 25, -8, 12, 1, -15};
        Service service = new Service();
        service.sortAscending(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
