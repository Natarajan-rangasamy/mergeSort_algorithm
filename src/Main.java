import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merge sort algorithm----------!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array length.....");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array elements to sort.");
        for(int i =0; i<length ; i++){
            arr[i] = sc.nextInt();
        }
        mergeSort(arr);
        System.out.println("After sorting");
        for(int i =0 ; i<length;i++){
            System.out.println(arr[i]);
        }
    }
    private static void mergeSort(int[] arr){
        int length = arr.length;
        if(length < 2)
            return;

        int midindex = length/2;
        int[] leftHalf = new int[midindex];
        int[] rightHalf = new int[length - midindex];



        for(int i =0 ; i < midindex;i++){
            leftHalf[i] = arr[i];
        }
        for(int i=midindex; i<length;i++){
            rightHalf[i-midindex] = arr[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(arr,leftHalf,rightHalf);
    }

    private static void merge(int[] arr, int[] leftHalf, int[] rightHalf) {
        int rightSize = rightHalf.length;
        int leftSize = leftHalf.length;

        int i =0 , j =0 , k =0 ;
        while(i<leftSize && j<rightSize){
            if(leftHalf[i] <= rightHalf[j]){
                arr[k] = leftHalf[i];
                i++;
            }
            else {
                arr[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while (i<leftSize){
            arr[k]=leftHalf[i];
            i++;
            k++;
        }
        while (j<rightSize){
            arr[k]=rightHalf[j];
            j++;
            k++;
        }
    }
}




















