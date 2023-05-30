import java.util.Scanner;

class pattern16{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int sp=(2*n)-3;
        int i,j,v;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++){
             System.out.print(j+" ");
            }
            for(j=1;j<=sp;j++){
             System.out.print("  ");
            }
            if(i==n)
              v=i-1;
            else
              v=i;
            for(j=v;j>0;j--){
             System.out.print(j+" ");
            }
            sp=sp-2;
            System.out.println();
        }
    }
}