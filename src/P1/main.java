package P1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SLL list=new SLL();
		list.addfirst(1);
		list.addfirst(2);
		list.addfirst(3);
		list.addfirst(4);
		list.addLast(5);
		list.addLast(6);
		list.addLast(7);
		list.insert(10, 4);
		list.insert(11, 5);
		list.insert(12, 6);
		list.display();
		System.out.println();
		list.delfromlast(3);
		list.display();
		System.out.println();
		//list.deletefirst();
		//list.deletelast();
		//list.delete(4);
		//list.display();

	}

}
