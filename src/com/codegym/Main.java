package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println("nhập số cần add vào đây bạn ơi");
        int number = scanner.nextInt();
        System.out.println("nhập vị trí muốn thêm vào đây bạn mình ơi");
        int viTri = scanner.nextInt();

        array = themPhanTu(array,viTri,number);
        for (int element: array) {
            System.out.println(element);
        }
    }
//    public static int timViTri(int[] array, int x){
//        int viTri = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == x){
//                viTri = i;
//                break;
//            }
//        }
//        return viTri;
//    }

    public static int[] themPhanTu(int[] array, int viTri, int value){
        int newArray[] = new int[array.length + 1];

        for (int j = 0; j < viTri; j++) {
            newArray[j] = array[j];
        }
        newArray[viTri] = value;
        for (int k = viTri+1; k < array.length+1; k++) {
            newArray[k]= array[k-1];
        }
        return newArray;
    }
}

