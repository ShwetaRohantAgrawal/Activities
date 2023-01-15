package activities;

public class Activity4 {
    public static void main(String[] args) {
        int unsortedArray[] ={4,3,2,10,12,1,5,6};
        int[] sortedArray;

        System.out.println("Unsorted Array : ");
        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);

        }
        sortedArray=insertionSort(unsortedArray);

        System.out.println("Sorted Array : ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.println(sortedArray[i]);

        }



    }

    private static int[] insertionSort(int[] unsortedArray) {
        int sortedElement = unsortedArray[0];
        for (int i = 1; i < unsortedArray.length; i++) {
//            System.out.println("i:"+i);
            int x=unsortedArray[i];
//            System.out.println("x:"+x);
            int j ;
            for ( j = i-1; j >= 0; j--) {
//            while(j>=0 && unsortedArray[j]>x) {
                if (unsortedArray[j] > x) {
                    unsortedArray[j + 1] = unsortedArray[j];
//                    j--;
                } else {
//                    --j;
                    break;
                }
            }
                unsortedArray[j+1]=x;

            }
        return unsortedArray;
    }
}
