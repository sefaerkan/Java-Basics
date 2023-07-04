package com.sefaerkan.javatemelleri;

public class Loops {
    public static void main(String[] args) {

        //for loops
        int[] numbers = {12,15,20,25,30,45,50};

        for(int i = 0; i<numbers.length ; i++){
            int x = numbers[i] / 3 * 5;
            //System.out.println(x);
        }

        for(int number : numbers) {
            //System.out.println(number / 3 * 5);
        }

        //While

        int j = 0;

        while(j<11) {
            int m = j * 8;
            System.out.println(m);
            j++;
        }


    }
}
