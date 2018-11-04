//Linked List

import java.util.*;
class Node
{
  int data;
  Node next;
  Node(int data)
  {
    this.data=data;
    this.next=null;
  }
}
class swapping 
{
public Node swap(Node head)
{
  int c=0;
  Node prev=null;
  Node ne=null;
  ne=head.next;
  head.next=ne.next;
  ne.next=head;
  return ne;
  
}
  public void display(Node head)
  {
    while(head!=null)
    {
      System.out.println(head.data);
      head=head.next;
    }
  }

  public static void main(String[] args) {
    swapping m=new swapping();
    int data,i;
    Scanner o=new Scanner(System.in);
    Node head=null;
    System.out.println("enter 2 elements of linked list or -1 to exit");
    data=o.nextInt();
    while(data!=-1)
    {
    Node n=new Node(data);
    if(head==null)
    {
      head=n;
    }
    else
    {
      Node p=head;
      while(p.next!=null)
      {
        p=p.next;
      }
      p.next=n;
    }
    data=o.nextInt();
    }
    head=m.swap(head);

System.out.println("elements of linked list after swapping");    
m.display(head);

  }
}