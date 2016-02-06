package quick;

public class quicks {
	
	public static void sort(int [] a){
	if ( a.length == 0 )
		return;
	
	else
		quicksort(a,0,a.length -1);
	
	
	}
	public static void quicksort(int [] a,int i , int j){
		int lx = i;
		int hx = j;
		
		int pivot = a[lx + (hx - lx)/2];
		
		while (i<=j){
			
			while (a[i]<pivot){
				i++;
			}
			while (a[j]> pivot){
				j--;
			}
			
			if (i <=j)
			{
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}
						
		}
		if (i< hx)
			quicksort(a,i,hx);
		if ( j > lx)
			quicksort(a,lx,j);
		
	}
	
	
	
	public static void main (String [] args){
		int []a  = {4,5,7,2,8,12,2};
		sort(a);
		for (int i =0 ; i <a.length ;i++){
			System.out.print("--" +a[i]);
		}
		
	//	for (int k :a){
		//	System.out.print("-!-" +a[k]);
		//}
		}
	}


