import java.util.Scanner;

class pattern13{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        for(i=0;i<n;i++)
        {
            int icj=1;
            for(j=0;j<=i;j++)
            {
                System.out.print(icj+" ");
                int icjp1=icj*(i-j)/(j+1);
                  icj=icjp1;
            }
            System.out.println();
        }
    }
}