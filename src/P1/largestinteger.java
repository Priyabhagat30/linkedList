package P1;
public class largestinteger {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {34,55,23,456,76,8,0,98,888,7,6,55,67,34,43,23,32};
		int temp1=Integer.MIN_VALUE;
		int temp2=Integer.MIN_VALUE;
		int temp3=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>temp1) {
				temp3=temp2;
				temp2=temp1;
				temp1=arr[i];
			}
			if(arr[i]<temp1 && arr[i]>temp2) {
				temp2=arr[i];
			}
			if(arr[i]<temp1 && arr[i]<temp2 && arr[i]>temp3) {
				temp3=arr[i];
			}
		}
		System.out.println("largest : "+temp1);
		System.out.println("second largest : "+temp2);
		System.out.println("third largest : "+temp3);
	}
}