package org.example.Week6;

public class BinarySearch {
    private int[] array;
    private int searchedValue;
    public BinarySearch(int[] array, int searchedValue) {
        this.array = array;
        this.searchedValue = searchedValue;
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getSearchedValue() {
        return searchedValue;
    }

    public void setSearchedValue(int searchedValue) {
        this.searchedValue = searchedValue;
    }
    public static boolean search(int[] array, int searchedValue) {
        int start = 0;
        int end = array.length-1;
        while(start<=end){
            int mid = (start+end)/2;
            if(array[mid]==searchedValue){
                return true;
            } else if (array[mid]>searchedValue) {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return false;
    }

}
