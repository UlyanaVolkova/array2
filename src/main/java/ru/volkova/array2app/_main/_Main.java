package ru.volkova.array2app._main;

import ru.volkova.array2app.service.Service;

import java.util.Arrays;

public class _Main {

    public static void main(String [] args) {
        int [] arr2 = {6, -2, 15, 4};
        Service service = new Service();
        service.ascending(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
