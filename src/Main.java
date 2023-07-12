public class Main {

    public static int[] reverseArray(int originalArray[]){
        int start = 0;
        int end = originalArray.length - 1;
        while (start < end){
            int temporary = originalArray[start];
            originalArray[start] = originalArray[end];
            originalArray[end] = temporary;
            start++;
            end--;
        }
        return originalArray;
    }

    public static void main(String[] args) {
        int reversedArray[] = reverseArray(new int[]{1,2,3});
        for (int iterator : reversedArray){
            System.out.print(iterator + " ");
        }
    }
}
