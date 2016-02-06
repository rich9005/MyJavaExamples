
public class merge {

	public static int [] mergeSort(int [] list){
		if (list.length <=1)
			return list ;
	
	
	int [] first =  new int [list.length/2];
	int [] second = new int [list.length - first.length  ];
	
	System.arraycopy(list, 0, first, 0, first.length);
	System.arraycopy(list, first.length, second, 0, second.length);
	
	mergeSort(first);
	mergeSort(second);
	
	mergee(first,second,list);
	return list;
			
	}
	
	public static void mergee(int [] first, int [] second, int [] list){
		int iFirst = 0;
		int iSecond = 0;
		int k = 0 ;
		while (iFirst < first.length && iSecond< second.length){
			if (first[iFirst] < second[iSecond]){
				list[k] = first[iFirst];
				iFirst ++;
			}
			else{
				list[k] = second[iSecond];
				iSecond ++;
			}
			k++;
		
		}
		
		System.arraycopy(first, iFirst, list, k, first.length - iFirst);
		System.arraycopy(second, iSecond, list, k, second.length - iSecond);
	}
	
	public static void main(String args[]){
		int [] a = {5,3,4,2,9,1};
		mergeSort(a);
		
		for (int i =0  ; i <a.length;i++)
		{
			System.out.print(a[i]);
		}
		
	}
	
}
