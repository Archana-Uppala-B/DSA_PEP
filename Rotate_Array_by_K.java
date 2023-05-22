import java.util.Scanner;

class Rotate_Array_by_K {
    public static void main(String args[] ) throws Exception {
        // Write your code here
        Scanner in =new Scanner(System.in);
        int T,i;
        //T=in.nextInt();
         int  N,K;
     
            N=in.nextInt();
            K=in.nextInt();
             int arr[]=new int[N];
            for(i=0;i<N;i++)
            {
               arr[i]=in.nextInt();
            }

            int temp;
            int left=0,right=N-1;
            while(left<right)
            {
                  temp=arr[right];
                  arr[right]=arr[left];
                  arr[left]=temp;
                   right--;
                   left++;

            }
            
            left=0;
            right=K-1;
            while(left<right)
            {
                  temp=arr[right];
                  arr[right]=arr[left];
                  arr[left]=temp;
                   right--;
                   left++;
            }

            left=K;
            right=N-1;
            while(left<right)
            {
                  temp=arr[right];
                  arr[right]=arr[left];
                  arr[left]=temp;
                   right--;
                   left++;
            }

            for(i=0;i<N;i++)
              System.out.print(arr[i]+" ");
            System.out.print("\n");

    }
}
