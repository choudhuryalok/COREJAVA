package DataStructure;
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class LinkList {
  public static void main(String[] args) {
    System.out.println("/=/=/=/= TESTING /=/=/=/=");
    LinkedList ll = new LinkedList(10);
    ll.addAtHead(11);
    ll.addAtHead(12);
    ll.addAtHead(13);
    ll.addAtTail(8);
    ll.addAtTail(7);
    ll.addAtIndex(4,9);
    ll.addAtIndex(4,9);
    ll.deleteAtIndex(4);
    LinkedList.printList();
  //Reversing LinkedList
    LinkedList.Node nn = LinkedList.reverseLinkedList();
    LinkedList.printList();
  }
}


class LinkedList
{
  //Class variables for the Linked List
  private static Node head;
  
  
 
  
  public LinkedList(int dat)
  {
    head = new Node(dat);
  }
  
  public void addAtHead(int dat)
  {
    Node temp = head;
    head = new Node(dat);
    head.next = temp;
    
  }
  
  public void addAtTail(int dat)
  {
    Node temp = head;
    while(temp.next != null)
    {
      temp = temp.next;
    }
    
    temp.next = new Node(dat);
   
  }
  
  public void addAtIndex(int index, int dat)
  {
    Node temp = head;
    Node holder;
    for(int i=0; i < index-1 && temp.next != null; i++)
    {
      temp = temp.next;
    }
    holder = temp.next;
    temp.next = new Node(dat);
    temp.next.next = holder;
   
  }
  
  public void deleteAtIndex(int index)
  {
    Node temp = head;
    for(int i=0; i< index - 1 && temp.next != null; i++)
    {
      temp = temp.next;
    }
    temp.next = temp.next.next;
   
  }
  
  public static int find(Node n)
  {
    Node t = head;
    int index = 0;
    while(t != n)
    {
      index++;
      t = t.next;
    }
    return index;
  }
  
  public static Node find(int index)
  {
    Node temp=head;
    for(int i=0; i<index; i++)
    {
      temp = temp.next;
    }
    return temp;
  }
    
  public static void printList()
  {
    Node temp = head;
    while(temp != null)
    {
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  
  
//Reverse linkedlist using this function 
	public static Node reverseLinkedList()
	{
		// For first node, previousNode will be null
		Node previousNode=null;
		Node nextNode;
		while(head!=null)
		{
			nextNode=head.next;
			// reversing the link
			head.next=previousNode;
			// moving currentNode and previousNode by 1 node
			previousNode=head;
			head=nextNode;
		}
		return previousNode;
	}
 
  
 static class Node
  {
    //Declare class variables
    private Node next;
    private int data;
    
    public Node(int dat)
    {
      data = dat;
    }
    
   
  }
}