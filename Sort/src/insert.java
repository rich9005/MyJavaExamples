
public class insert {
public static void insert (int [] a){
	
	for (int i =1 ; i < a.length ; i ++){
		int temp = a[i];
		
		for (int j = i -1 ; j >=0 && temp < a[j]; j -- ){
			a[j+1] = a[j];
			a[j] = temp;
 		}
	}
	
}
	
	public static void main (String args[]){
		int [] x = {5,4,2,3};
		insert(x);
		for (int i =0 ; i < x.length ; i ++){
			System.out.print(x[i]+" ");
		}
	}
	
}

