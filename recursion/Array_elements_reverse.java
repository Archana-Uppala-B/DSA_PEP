import java.util.Scanner;

class Array_elements_reverse{
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
        print(a,0);
        
    }

    static void print(int[] a,int ind)
    {
       if(ind==a.length)
        return;
       print(a,ind+1);
       System.out.print(a[ind]+" ");
    }
}