package bubbles;

public class bubblesort {
	
	public static void sort(int [] a){
		
		boolean flag = true;
		int temp;
		int len = a.length -1;
		while (flag){
			flag = false;
			
			for (int i =0 ;i<len ; i++){
				if (a[i] > a[i+1])
				{
				 temp = a[i];
				 a[i] = a[i+1];
				 a[i+1] = temp;
				 flag = true;
				}
			}
			len -= 1;
			
		}
		
	}
	
	
	public static void main(String []args){
		int [] a = {4,3,5,8,4,1};
		sort(a);
		for (int i =0 ;i<a.length ; i++){
			System.out.print("--"+a[i]);
		}
	}

}
