package bubbles;
import java.util.*;
public class mergeArray {
	
	public static void main(String [] args){
		
		int [] a = {1,5,7,7};
		int [] b = {0,1,2,3};
		int res[] = new int [9];
		res = merge(a,b);
		System.out.println(Arrays.toString(res)+ "Result Array");
		
			
		}
	public static int[] merge(int[] a , int []b){
		
		int len = a.length;
		int []res = new int [2*len];
		int k = 0;
		int i =0 , j=0;
		for (; i < len & j<len; ){
			
				if (i<len & a[i]<=b[j] & j<len){					
					res[k++] = a[i];
					System.out.println(Arrays.toString(res)+ "If");
					i++;					
				}
				else if (i<len & b[j]<=a[i] & j<len){
					res[k++] = b[j];
					System.out.println(Arrays.toString(res)+ "else");
					j++;					
					}
				}
		System.out.println("Test"+i+"GGGG"+j);
		while(i<len){
			res[k++] =a[i];
			i++;
		}
		while (j < len){
			res[k++] =a[i];
			j++;
		}
		return res;
	}
		
	}


