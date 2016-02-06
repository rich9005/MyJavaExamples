 class QueueWD {  
//	 private static final int capacity = 3;  
//	 int arr[] = new int[capacity];
	 int wash[] = new int[5];
	 int dry[] = new int [5];
	 int size = 0;  
	 int reard = -1;
	 int topw,top = -1;
	 int rearw,topd,rear = 0;  
	  
	 public void pushd(int pushedElement) {  
	  if (reard < wash.length) {  
	   reard++;  
	   dry[reard] = pushedElement;  
	   System.out.println("Element " + pushedElement  
	     + " is pushed to Queue DRY!");  
//	   display("d");  
	  } else {  
	   System.out.println("Overflow !");  
	  }  
	  
	 }  
	  
	 public void pop() {  
	  if (topw > rearw) {
		  System.out.println("Clothes WASHED!");
		  pushd(wash[rearw]);
	   rearw++;  
	     
//	   display("w");  
	  } 
	  /*else {  
	   System.out.println("Underflow !");  
	  } 
	  */ 
	 }
	 public void popd() {
		 if (topd != -1){
		 if (topd <= reard){
			 System.out.println("Clothes DRIED !!!" +dry[topd]);
			 topd++;
		 }
		 }
		 else
			 System.out.println("No Clothes to DRY");
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
			 	wash[i] = i;
			 }
		 topw = wash.length;
		 for (int i =0 ; i <5 ; i ++)
	 	 {
		 	System.out.println(wash[i]);
		 }
	 }
}
//

class multiwash extends Thread{  
	static QueueWD qstart = new QueueWD();
public void run(){
//		System.out.println(Thread.currentThread().getName()); 
	 String threadName = Thread.currentThread().getName();
	 System.out.println("Current Thread is " +threadName);
 if(threadName.equals("wash"))
 {
	 System.out.println("washing");
  
	 for(int i=0;i<qstart.wash.length;i++)
	 {
		 
		 System.out.println(i+" Wash");
	
	 qstart.pop();
		 try {
			 Thread.sleep(1000);
		 } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
 else if (threadName.equals("dry"))
{
	for(int i1=1;i1<5;i1++)
	{
		System.out.println(i1+"DRY");
		qstart.popd();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}  
public static void main(String args[]) throws InterruptedException{  
 multiwash t1=new multiwash();  
 multiwash t2=new multiwash(); 
// QueueWD qstart = new QueueWD();
 qstart.pushWash();
 //String t1x = new String("wash");
  t1.setName("wash");
  t2.setName("dry");
t1.start();
t2.start();
 }  
}

