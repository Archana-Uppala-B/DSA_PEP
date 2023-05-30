import java.util.Scanner;

class pattern15{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int i,j;
        int sp=n/2;
            int c=1;
            int val=1;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=sp;j++)
            {
                System.out.print("\t");
            }

            int cval=val;
            for(j=1;j<=c;j++)
            {
                System.out.print(cval+"\t");
                
                if(j<=c/2)
                {
                    cval++;
                }
                else{
                    cval--;
                }
                
            }

            if(i<=n/2)
            {
                sp--;
                c=c+2;
                val++;
            }
            else{
                sp++;
                c-=2;
                val--;
            }
            System.out.println();
        }
    }
}