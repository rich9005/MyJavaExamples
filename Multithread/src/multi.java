class multi extends Thread{  
 
public void run(){
//		System.out.println(Thread.currentThread().getName()); 
	 String threadName = Thread.currentThread().getName();
	 System.out.println("Current Thread is " +threadName);
 if(threadName.equals("wash"))
 {
	 System.out.println("Hello");
  
	 for(int i=1;i<=10;i++)
	 {
		 
		 System.out.println(i+" Wash");
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
	for(int i1=1;i1<=5;i1++)
	{
		System.out.println(i1+"DRY");
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
 multi t1=new multi();  
 multi t2=new multi(); 
 String t1x = new String("wash");
  t1.setName("wash");
  t2.setName("dry");
t1.start();
t2.start();
 }  
}