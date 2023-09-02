package ru.volkova.array2app.service;

public class Service {

    public void ascending(int [] arr2){
            int index = 0;
            while (index < 4) {
                int num1 = arr2[index];
                int num2 = arr2[index + 1];
                if (num1<num2) {
                    index++;
                } else {
                    num1 = arr2[index + 1];
                    num2 = arr2[index - 1];
                    if (index < 0){
                        index = 0;
                    }
                    index++;
                }
            }
            System.out.println(arr2);
        }
    }
