import java.util.*;
class intersect 
{
   public static void main(String args[]) {
      Scanner S=new Scanner(System.in);
      System.out.println("Enter no. of elements of first array : ");
      int N=S.nextInt();
      int[ ] arr=new int[N];
      System.out.println("Enter first array elements : ");
      for(int i=0;i<N;i++)
      {
        arr[i]=S.nextInt();
      }
      System.out.println("Enter no. of elements of second array : ");
      int N1=S.nextInt();
      int[ ] arr2=new int[N1];	  
      System.out.println("Enter second array elements : ");
      for(int i=0;i<N1;i++)
      {
        arr2[i]=S.nextInt();
      }
 System.out.println("Intersection of the two arrays ::");
     
      for(int i = 0; i<N; i++ ) {
         for(int j = 0; j<N1; j++) {
            if(arr[i]==arr2[j]) {
               System.out.println(arr2[j]);
            }
         }
      }
   }
}