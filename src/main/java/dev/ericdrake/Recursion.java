package dev.ericdrake;

public class Recursion {
    public static int recursiveSearch(String searchValue, String[] searchArray, int currentIndex){
        if(currentIndex < 0){
            currentIndex = 0;
        }
        if(currentIndex >= searchArray.length){
            return -1;
        } else if(searchValue == searchArray[currentIndex]){
            return currentIndex;
        } else {
            return recursiveSearch(searchValue, searchArray, ++currentIndex);
        }
    }
}
