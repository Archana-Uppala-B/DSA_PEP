import java.util.Scanner;

class Node{
    int data;
    Node next;
}

class linkedList{
    Node head;
    Node tail;
    int size;

    void addLast(int d)
    {
        Node temp=new Node();
        temp.data=d;
        temp.next=null;

        if(size==0)
        {
            head=tail=temp;
            size++;
        }
        else
        {
            tail.next=temp;
            tail=temp;
            size++;
        }
    }

    void printList(Node h)
    {
        Node temp=h;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    Node reverseLinkedList(Node h)
    {
        Node curr=h;
        Node prev=null;
        Node forw=null;

        while(curr!=null)
        {
            forw=curr.next;
            curr.next=prev;
            prev=curr;
            curr=forw;
        }
        return prev;
    }
}

class reverseLinkedListClass{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,i;
        linkedList ll=new linkedList();
        System.out.println("Enter the n:");
        n=in.nextInt();
        for(i=0;i<n;i++)
        {
            System.out.print("Enter node val:");
            ll.addLast(in.nextInt());
        }

        System.out.println("the traversal of the linkedlist is: ");
        ll.printList(ll.head);

        Node rhead=ll.reverseLinkedList(ll.head);
        System.out.println("\nthe reversal of the linked list is:");
        ll.printList(rhead);

        System.out.println("\nthe size of the linked list is: "+ ll.size);
    }
}