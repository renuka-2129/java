import java.util.Scanner;
 class Linear{
  public static void main(String args[]) {
    Scanner scanner=new Scanner(System.in);
    System.out.print("enter the number of elements in an array:");
    int n = scanner.nextInt();
    int[] array = new int[n];
    System.out.println("enter the elements of the array:");
    for(int i=0;i<n;i++)
    {
      array[i]=scanner.nextInt();
     }
     System.out.println("enter the element to be searched:");
     int key = scanner.nextInt();
     int result=linear(array,key);
     if(result==-1)
     {
        System.out.println("element not found in the array.");
     }
     else
     {
        System.out.println("element found");
     }
      scanner.close();
   }
      public static int linear(int[] array,int key)
      {
         for(int i=0;i<array.length;i++)
         {
           if(array[i]==key)
           {
            return i;
           }
         }
          return -1;
      }
    }  
