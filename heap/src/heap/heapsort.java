package heap;

public class heapsort {
	
	private static int N;
	
	public static void sort(int [] arr){
		heapify(arr);
		
		for (int i =N ; i>0 ; i-- ){
			swap(arr,0,i);
			N= N -1;
			maxheap(arr,0);
		}
		
	}
	
	public static void heapify(int [] a){
		
		N = a.length - 1;
		for (int i = N/2 ; i >=0 ; i--)
			maxheap(a,i);
	}
	
	public static void maxheap(int [] a , int i){
		int left = 2 * i;
		int right = 2*i + 1;
		int max = i;
		
		if (left <= N && a[left]> a[i])
			max = left;
		if (right <= N && a[right]> a[max])
			max = right;
			
		if(max!=i){
			swap(a , max ,i);
			maxheap(a,max);
		}
	}
		public static void swap(int [] a , int max , int i){
			int temp = a[max];
			a[max] = a[i];
			a[i] =  temp;
		}
		
	
	
	
	
	public static void main (String agrs[]){
		int[] a = {3,6,7,8,1,2,88,77};
		sort(a);
		
		for (int i =0 ; i< a.length ;i++){
			System.out.print("--"+a[i]);
		}
		}
	

}
