package P1;
public class SLL{
	// components of linked list
	node head;
	node tail;
	int size=0;
	
	//node class and its components as data,next node and a constructor
	public class node{
		int data;
		node next;
		node(int data){
			this.data=data;
			this.next=null;
		}
//		node(int data,node next){
//			this.data=data;
//			this.next=next;
//		}
	}
	
	//addfirst method to add in first position
	public void addfirst(int data) {
		node newnode=new node(data);
		newnode.next=head;
		head=newnode;
		if(tail==null) {
			tail=head;
		}
		size++;
	}
	
	//display method to display nodes
	public void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//addlast method to add in last position
	public void addLast(int data) {
		node newnode=new node(data);
		tail.next=newnode;
		newnode.next=null;
		tail=newnode;
		size++;
	}
	
	//add at any provided position
	public void insert(int data,int n) {
		node temp=head;
		node temp2=head;
		node newnode=new node(data);
		for(int i=1;i<n-1;i++) {
			temp=temp.next;
			temp2=temp.next;
		}
		temp.next=newnode;
		newnode.next=temp2;
		size++;
	}
	
	//delete from first position
	public void deletefirst() {
		head=head.next;
		if(head==null) {
			tail=null;
		}
		size--;
	}
	
	//delete from last
	public void deletelast() {
		node temp=head;
		for(int i=1;i<size-1;i++) {
			temp=temp.next;
		}
		tail=temp;
		temp.next=null;
		size--;
	}
	
	//delete from given index
	//does not handles the test case if 1st element 
	     //is to be deleted
	public void delete(int n) {
		node temp1=head;
		node temp2=head;
		for(int i=1;i<n-1;i++) {
			temp1=temp1.next;
			temp2=temp1.next;
		}
		temp2=temp2.next;
		temp1.next=temp2;
		size--;
	}
	
	//end of singly linked list..
	
	//questions imp
	public void delfromlast(int n) {
		node temp=head;
		node temp1=head;
		for(int i=1;i<size-n;i++) {
			temp=temp.next;
		}
		temp1=temp.next.next;
		temp.next=temp1;
		size--;
	}
}		


	

