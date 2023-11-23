package org.example.Week6;

import java.util.Arrays;
import java.util.Scanner;

public class week6Lab {
    public static int smallest(int[] array){
        int temp=array[0];
        for(int i = 0; i<array.length;i++){
            if(temp>array[i]){
                temp = array[i];
            }
        }
        return temp;
    }
    public static int indexOfTheSmallest(int [] array){
        int index=0;
        for(int i=0; i<array.length; i++){
            if(array[index]>=array[i]){
                index = i;
            }
        }
        return index;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int indexOfSmallest = index;
        for(int i = index; i<array.length; i++){
            if(array[indexOfSmallest]>array[i]){
                indexOfSmallest=i;
            }
        }
        return indexOfSmallest;
    }
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1]=array[index2];
        array[index2]=temp;
    }

    public static void printElegently(int[] array){
        System.out.println();
    }

    public static void main(String[] args){
       /* int[] array = {6, 5, 8, 7, 11};
        System.out.println("Smallest: "+ smallest(array));
        System.out.println("Index of the smallest: "+ indexOfTheSmallest(array));
        System.out.println(indexOfTheSmallestStartingFrom(array, 1));
        System.out.println(indexOfTheSmallestStartingFrom(array, 2));
        System.out.println(indexOfTheSmallestStartingFrom(array, 4));
        int[] values={3, 2, 5, 4, 8};
        swap(values, 1, 0);
        System.out.println(Arrays.toString(values));
        swap(values, 0, 3);
        System.out.println(Arrays.toString(values));
        */
        int array[] = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader =new Scanner(System.in);
        System.out.println("Values of the array: "+ Arrays.toString(array));
        System.out.println();

        System.out.println("Entered searched number: ");
        String searchedValue= reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        System.out.println(result);
    }
}
