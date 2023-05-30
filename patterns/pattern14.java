import java.util.Scanner;

class pattern14{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        n=in.nextInt();
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println(n+"x"+i+"="+n*i);
        }
    }
}