import java.util.Scanner;

class pattern18{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sp=0,st=n,i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sp;j++)
             System.out.print("  ");
            for(j=1;j<=st;j++)
            {
                if(i>1 && i<=n/2 && j>1 && j<st)
                 System.out.print("  ");
                
                 else
                 System.out.print("* ");
            }

             if(i<=n/2)
              {
            sp=sp+1;
            st=st-2;
             }
             else
             {
            sp=sp-1;
            st=st+2;
             }
        System.out.println();
        }
    }
}