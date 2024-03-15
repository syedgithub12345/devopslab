package Sorting;
public class bubble_sort {
    public static void swap(int arr[]){
        int a=arr.length;
        int temp=0;
        for(int i=0;i<a-1;i++){
            for(int j=0;j<a-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }

        }
    }
    public static void printthe(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
public static void main(String args[]){
        int arr[]={5,3,2,1,4};
        swap(arr);
        printthe(arr);
    }
}