package P1;

public class mainDl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DLL list=new DLL();
		list.addfirst(10);
		list.addfirst(20);
		list.addfirst(30);
		list.addfirst(40);
		list.insertAt(25, 3);
		list.insertlast(5);
		list.insertlast(1);
		list.insertlast(0);
		list.display();
		//list.displayrev();
		
	}

}
