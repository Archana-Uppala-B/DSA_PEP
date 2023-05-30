import java.util.Scanner;
class pattern19{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=n;j++)
            {
                if(i==1)
                {
                    if(j==n||j<=n/2+1)
                       System.out.print("* ");
                    else 
                       System.out.print("  ");
                }
                else if(i<=n/2 && i!=1)
                {
                    if(j==n/2+1 || j==n)
                      System.out.print("* ");
                    else
                      System.out.print("  ");
                }
                else if(i==n/2+1)
                {
                     System.out.print("* ");
                }
                else if(i>n/2+1 && i!=n)
                {
                    if(j==1 || j==n/2+1)
                      System.out.print("* ");
                    else
                      System.out.print("  ");
                }
                else if(i==n){
                     if(j==1|| j>=n/2+1)
                      System.out.print("* ");
                      else 
                      System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}