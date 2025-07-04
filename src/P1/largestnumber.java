package P1;

public class largestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[] = {"3", "30", "34", "5", "9"};
		for(int i=0;i<arr.length-1;i++) {
			StringBuilder s1=new StringBuilder();
			StringBuilder s2=new StringBuilder();
			s1=s1.append(arr[i]);
			s1=s1.append(arr[i+1]);
			s2=s2.append(arr[i+1]);
			s2=s2.append(arr[i]);
			//int num = Integer.parseInt(s1.toString());
			if(Integer.parseInt(s2.toString())>Integer.parseInt(s1.toString())) {
				
			}
		}
		
		
		

	}

}
