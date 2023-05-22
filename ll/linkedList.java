import java.util.Scanner;

class Node{
    int data;
    Node next;

    Node(int d)
    {
        this.data=d;
        this.next=null;
    }
}
class linkedList{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        System.out.println("Enter the no. of nodes do you want: ");
        n=in.nextInt();
        Node head=null;
        Node temp=null;
        for(i=0;i<n;i++)
        {
            
            System.out.println("Enter the val of node: ");
            Node list=new Node(in.nextInt());
            if(head==null)
            {
                head=temp=list;
            }
            else{
                temp.next=list;
                temp=temp.next;
            }

        }

        //to print the linkedlist

        System.out.println("The traversal of the linkedlist is...");
        Node temp2=head;
        while(temp2!=null)
        {
            System.out.print(temp2.data+" ");
            temp2=temp2.next;
        }

    }
}