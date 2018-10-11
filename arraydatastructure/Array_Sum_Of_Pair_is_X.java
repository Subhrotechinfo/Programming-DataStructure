package arraydatastructure;

import java.util.HashMap;

public class Array_Sum_Of_Pair_is_X {
//find sum = 9 all such pairs

    private static int max = 8;
    static int arr[] = {1, 4, 3, 3, 5, 2, 6, -1,5,5,4,4,-1,-1};
                     
    public static void main(String args[]) {
        int arrLength = arr.length;
        int sum = 4;
        //sumOfPair(arr,sum);
        //getPairsCount(arr, sum);
        System.out.println(getPairsCountHashMap(arrLength, sum));
    }

    public static void sumOfPair(int arr[], int sum) {

        int size = arr.length;
        int index, temp;
        int hash[] = new int[max];    //hash table define to sum 
        for (index = 0; index < size; ++index) {
            temp = sum - arr[index];       // 
            if (temp >= 0 && hash[temp] == 1) {
                System.out.println("All such pairs with " + sum + " is [" + arr[index] + "," + temp + "]");
            }
            hash[arr[index]] = 1;
        }
    }

    public static void getPairsCount(int arr[], int sum) {
        //can consist of both positive & negaive elements but no repeated values
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                }

            }
        }
        System.out.println("All such positive pairs are : " + count);
    }

    public static int getPairsCountHashMap(int arrLength, int sum) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {

            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], (hm.get(arr[i]) + 1));
            } else {
                hm.put(arr[i], 1);
            }
        }
        for (int i = 0; i < arrLength; i++) {
            int num = sum - arr[i];
                if (hm.get(num) != null && hm.get(num) > 0) {
                    if (num == arr[i]) {
                        count=count+hm.get(num)-1;
                    } else {
                        count=count+hm.get(num);
                    }
                hm.put(arr[i], hm.get(arr[i] - 1));
            }
        }

        return count;
    }
}