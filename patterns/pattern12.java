import java.util.Scanner;

class pattern12{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;

    
        int i,j,c;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(a+" ");
                c=a+b;
                a=b;
                b=c;
            }
            System.out.println();
        }
    }
}