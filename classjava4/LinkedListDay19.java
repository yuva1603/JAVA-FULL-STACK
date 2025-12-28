package classjava4;

import java.util.LinkedList;

public class LinkedListDay19 {
class Node{
	int data;
	Node next;
	
	Node(int data)
	{
		this.data=data;
		this.next=null;
	}
}
	Node head; //Node fixed to be at head
	
	//1. Insert at a begining
	void insertAtBegin(int data) {
		Node newNode=new Node(data);
		newNode.next=head;
		head=newNode;
	}
	
	//2. Insert at a End 
	void inserAtEnd(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		
	Node temp=head;
	while(temp.next!=null) {
		temp=temp.next;
	}
		temp.next=newNode;
	}
	
	//3. Delete a Node 
	void delete(int key) 
	{
		Node temp = head,prev=null;
		if(temp!=null && temp.data==key)
		{
			head=temp.next;
			return;
		}
	while(temp!=null && temp.data!=key) {
		prev=temp;
		temp=temp.next;
		}
	
	if(temp==null)
	{
		System.out.println("Element Not found ");
		return;
	}
	prev.next=temp.next;
	}
	
	//4. Search an Element
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
	
	//5. Length of List
	int length()
	{
		int count=0;
		Node temp=head;
		while(temp!=null) {
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	// 6. Display of the List
	void display()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.println(temp.data+ "->");
			temp=temp.next;
		}
		System.out.println("Null");
	}
	
	// 7. Reverse a List
	void reverse()
	{
		Node prev=null,curr=head,next;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
			
			head=prev;
		}
	}
	
	public static void main(String[] args) {
		LinkedListDay19 list =new LinkedListDay19();
		list.insertAtBegin(10);
		list.insertAtBegin(20);
		list.inserAtEnd(30);
		list.display();
		
		System.out.println("length "+list.length());
		list.delete(20);
		list.display();
		
		System.out.println("Search 10 "+list.search(10));
		list.reverse();
		list.display();
		
	}
}
