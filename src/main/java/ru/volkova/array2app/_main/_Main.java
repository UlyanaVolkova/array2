package ru.volkova.array2app._main;

import ru.volkova.array2app.service.Service;

public class _Main {

    public static void main(String [] args) {
        int [] arr2 = new int[4];
        arr2[0]= 6;
        arr2[1]= -2;
        arr2[2]= 15;
        arr2[3]= 4;

        Service service = new Service();
        service.ascending(arr2);
    }
}
