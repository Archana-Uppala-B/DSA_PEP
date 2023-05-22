import java.util.Scanner;

class pattern4{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sp=0,st=n,i,j;
        for(i=0;i<n;i++)
        {
            for(j=0;j<sp;j++)
             System.out.print("  ");
            for(j=0;j<st;j++)
             System.out.print("* ");
            sp++;
            st--;
            System.out.print("\n");
        }
    }
}