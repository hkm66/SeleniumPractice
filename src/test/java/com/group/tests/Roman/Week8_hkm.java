package com.group.tests.Roman;

public class Week8_hkm {

    //Array - N unique integers that sum up to 0
    //Write a function that given an integer N (1 < N < 100), returns an array
    //containing N unique integers that sum up to 0. The function can return any
    //such array.
    //For example, given N = 4, the function could return [1,0, -3,2] or [-2,1, -4,5].
    //The answer [1, - 1,1,3] would be incorrect (because value 1 occurs twice).
    //For N = 3 one of the possible answers is [-1,0,1] (but there are many more
    //correct answers).

    public static int[] getIntegersWithSum0 (int length) {
        int[] array = new int[length];
        for (int i = 0, j = 1; i < array.length; i = i+2, j++) {
            if (i == array.length - 1) {
                array[i] = 0;
                continue;
            }
            array[i] = j;
            array[i+1] = -j;
        }
        return array;
    }

    //2- Array - Move Zeros to the End
    //Write a method that can move all the zeros to last indexes of the array (Do
    //Not Use Sort Method) Ex: input: {1,0,2,0,3,0,4,0}; output: [1, 2, 3, 4, 0, 0, 0,
    //0]


    //solution without additional array using two pointers technique
    //[2, 7, 0, 0, 0, 2, 3]
    //       ^^
    public static int[] moveZeroesToEnd (int[] array) {
        //after each iteration increment left pointer and moving right pointer back to the left
        for (int left = 0, right = 0; right < array.length; left++, right = left) {
            if (array[left] == 0) {
                //looking for non-zero
                while (right < array.length - 1 && array[right] == 0)
                    right++;
                //swapping
                array[left] = array[right];
                array[right] = 0;
            }
        }

        return array;
    }
}
