import java.util.Scanner;

class max_of_arrayRecursion{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int[] a=new int[5];
        int i;
        System.out.println("Enter the elements of the array");
        for(i=0;i<5;i++)
        {
           a[i]=in.nextInt();
        }
        int m=max(a,0);
        System.out.println("The max of the array is"+m);
        
    }

    static int max(int[] a,int ind)
    {
        if(ind==a.length-1)
         return a[ind];
        int misa=max(a,ind+1);
        if(misa>a[ind])
         return misa;
        else
         return a[ind];
    }
}