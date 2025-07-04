package P1;

public class DLL {
	//components of dll
	node head;
	int size=0;
	
	//node structure
	class node{
		int data;
		node next;
		node prev;
		node(int data){
			this.data=data;
			this.next=null;
			this.prev=null;
		}
	}
	
	//add node in first place
	public void addfirst(int data) {
		node newnode=new node(data);
		newnode.prev=null;
		newnode.next=head;
		if(head!=null) {
			head.prev=newnode;
		}
		head=newnode;
		size++;
	}
	
	//display items as it is
	public void display() {
		node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.next;
		}
	}
	
	//display items in reverse order
	public void displayrev() {
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		while(temp!=null) {
			System.out.print(temp.data+" ");
			temp=temp.prev;
		}
	}
	
	//insert node at any particular index
	public void insertAt(int data,int n) {
		node newnode =new node(data);
		node temp1=head;
		for(int i=1;i<n-1;i++) {
			temp1=temp1.next;
		}
		node temp2=temp1.next;
		temp1.next=newnode;
		newnode.next=temp2;
		temp2.prev=newnode;
		newnode.prev=temp1;
		size++;
	}
	
	//insert at last position
	public void insertlast(int data) {
		node newnode =new node(data);
		node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newnode;
		newnode.next=null;
		newnode.prev=temp;
	}
}
