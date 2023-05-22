import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class LinkedList{
    Node head=null;
    Node tail;
    int size;

    void addLast(int d)
    {
        Node temp=new Node();
        temp.data=d;
        temp.next=null;

        if(head==null)
        {
            head=tail=temp;
        }
        else
        {
            tail.next=temp;
            tail=temp;
        }
    }

    void addAtPosition(int pos,int d)
    {
        int i=1;
        Node temp=head;

        Node newNode=new Node();
        newNode.data=d;
        newNode.next=null;
        if(pos==1)
        {
            newNode.next=temp;
            head=newNode;
        }
        else
        {
        while(i!=pos-1)
        {
            temp=temp.next;
            i++;
        }

        newNode.next=temp.next;
        temp.next=newNode;
        }
    }

    void printList(Node h)
    {
        System.out.println("\nThe traversal of the linekdList is:");
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
}

class addAtPositionClass{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        n=in.nextInt();
        LinkedList ll= new LinkedList();
        for(i=0;i<n;i++)
        {
            System.out.println("Enter the node:");
            ll.addLast(in.nextInt());
        }


        ll.printList(ll.head);
        System.out.println("Enter the position at which you want to enter:");
        int pos=in.nextInt();

        System.out.println("Enetr the data you want to insert");
        ll.addAtPosition(pos,in.nextInt());

        ll.printList(ll.head);

    }
}