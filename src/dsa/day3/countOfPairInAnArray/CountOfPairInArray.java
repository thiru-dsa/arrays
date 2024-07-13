package src.dsa.day3.countOfPairInAnArray;

// Question :- 
// Given a string of lower case letter, return the count of (i, j) such that i < j 

// Time Complexity  : O(N)
// Space Complexity : O(1)

class CountOfPairInArray {

    public static void main(String[] args) {
        
        char[] arr = {'a', 'b', 'g', 'a', 'g', 'a', 'f', 'g'};
        char firstPairElement = 'a';
        char secondPairElement = 'g';
        int countOfPair;

        countOfPair = findCountOfPair(arr, firstPairElement, secondPairElement);
        System.out.println(countOfPair);

    }

    public static int findCountOfPair(char[] arr, char firstPair, char secondPair) {

        int firstPairCount = 0, countOfPairs = 0;
        for(int iterator = 0; iterator < arr.length; iterator++) {
            if(arr[iterator] == firstPair) {
                firstPairCount++;
            }
            else if(arr[iterator] == secondPair) {
                countOfPairs += firstPairCount;
            }
        }

        return countOfPairs;
    }
}
