package classjava4;

import classjava4.LinkedListDay19.Node;

public class LinkedListExampleDay20 {
class Node{
	int data; // data
	Node next; // pointer

	  Node(int data) {
		this.data=data; //Store value
		this.next=null; // next Initial empty
	}
}
 	Node head; //Node fixed to be at head 
 	
 	// 1. insert at a begining
 	
 	void insertAtBegin(int data)
 	{
 		Node newNode=new Node(data); // Create a new node
 		newNode.next=head; // New node's next -> Current node
 		head=newNode;
 	}
 	
 	// 2. INsert at end
 	void insertAtEnd(int data)
 	{
 		Node newNode = new Node(data); //Create a new Node
 		// If list empty -> head = newNode
 		if(head==null) {
 			head=newNode;
 			return;
 		}
 	// else traverse to last node(where next = null)
 	// Attach newNode at end
 		Node temp=head;
 		while(temp.next!=null) {
 			temp=temp.next;
 		}
 	temp.next=newNode;
 	}
 	
 	//Delete a Node
 	
 	// case 1: Delete head node
 		// if head contains the key :
 		// head=head.next
 	
 	// case 2 : Delete middle or last
 		// keep two pointers :
 		// temp -> current node
 		// prev -> previoius node
 	    // when key found : 
 		// prev.next = temp.next
 	
 		// Node gets removed from chain
 	
 	void delete(int key) 
 	{
 		Node temp = head,prev = null;
 		if(temp!=null && temp.data == key)
 		{
 			
 		}
 		
 		
 	} 
 	
 	// Search an element
 	
 	//start from the head
 	// traverse node by node
 	// if match found -> return type 
 	// if match found -> return true
 	// if traversed entire list and not found -> return false
 	boolean search(int key)
 	{
 		Node temp=head;
 		while(temp!=null)
 		{
 			if(temp.data==key)
 			{
 				return true;
 			}
 		}
 		return false;
 	}
 	
 	// Length 
 	
 	//Revere a list
 	void reverse()
	{
		Node prev=null,curr=head,next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev; // save next
			prev=curr;      // reverse pointer
			curr=next;		// move prev forward
			head=prev;
		} // move curr forward 
	}
 	
	public static void main(String[] args) {
		

	}

}
