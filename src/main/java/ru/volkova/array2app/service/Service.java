package ru.volkova.array2app.service;

public class Service {

    public void ascending(int [] arr2) {
            int index = 0;
            while (index < arr2.length - 1) {
                int num1 = arr2[index];
                int num2 = arr2[index + 1];
                int i = index;
                int j = index + 1;
                if (num1<num2) {
                    index++;
                } else {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;
                    i++;
                    j--;
                }
            }
        }
    }
