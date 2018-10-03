import java.util.*;
class bSort
{
    static void bubbleSort(int arr[],int N)
    {
        
        for (int i = 0; i <N-1; i++)
            for (int j = 0; j < N-i-1; j++)
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
 
    static void printArray(int arr[],int N)
    {
        
        for (int i=0; i<N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter no. of elements:");
        int N=S.nextInt();
        int[ ] arr=new int[N];
        System.out.println("Enter array elements:");
        for(int i=0;i<N;i++)
        {
          arr[i]=S.nextInt();
        }
        bubbleSort(arr,N);
        System.out.println("Sorted array");
        printArray(arr,N);
    }
}