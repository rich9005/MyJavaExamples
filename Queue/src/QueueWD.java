public class QueueWD {  
//	 private static final int capacity = 3;  
//	 int arr[] = new int[capacity];
	 int wash[] = new int[5];
	 int dry[] = new int [5];
	 int size = 0;  
	 int topd = -1;
	 int topw,top = -1;
	 int rearw,reard,rear = 0;  
	  
	 public void pushd(int pushedElement) {  
	  if (topd < wash.length) {  
	   topd++;  
	   dry[topd] = pushedElement;  
	   System.out.println("Element " + pushedElement  
	     + " is pushed to Queue DRY!");  
//	   display("d");  
	  } else {  
	   System.out.println("Overflow !");  
	  }  
	  
	 }  
	  
	 public void pop() {  
	  while (topw > rearw) {
		  System.out.println("Pop operation done WASH!");
		  pushd(wash[rearw]);
	   rearw++;  
	     
//	   display("w");  
	  } 
	  /*else {  
	   System.out.println("Underflow !");  
	  } 
	  */ 
	 }  
	  
/*	 public void display(String v) {
		 if (v == "d")
			 {top = topd;
		 	 rear = reard;}
		 else if ( v == "w")
		 { top = topw;
		    rear = rearw;}
		 
	  if (top >= rear) {  
	   System.out.println("Elements in Queue : ");  
	   for (int i = rear; i <= top; i++) {  
	    System.out.println(arr[i]);  
	   }  
	  }  
	 }
*/	 
	 public void pushWash(){
		 for (int i =0 ; i <5 ; i ++)
		 	 {
			 	wash[i] = 9;
			 }
		 topw = wash.length;
		 for (int i =0 ; i <5 ; i ++)
	 	 {
		 	System.out.println(wash[i]);
		 }
	 }
	  
	 public static void main(String[] args) {  
	  QueueWD qstart = new QueueWD();  
	
	  qstart.pushWash();
	  qstart.pop();
	  

 
	 }  
	  
	}  

