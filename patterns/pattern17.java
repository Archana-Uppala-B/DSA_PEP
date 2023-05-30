import java.util.Scanner;

class pattern17{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sp=n/2,i,j;
        int st=1;
        for(i=0;i<n;i++)
        {
            if(i==n/2)
            {
               for(j=1;j<=n;j++)
                System.out.print("* ");
            }
            else
            {
                for(j=1;j<=sp;j++)
                 System.out.print("  ");
                for(j=1;j<=st;j++)
                 System.out.print("* ");
            }

            if(i<n/2)
             st++;
            else
             st--;
            System.out.println();
        }
    }
}