

public class LinkedList {
Node first;

LinkedList (){
	first = null;
}

LinkedList (Node f){
	first = f;
}

public boolean isEmpty(){
	if (first == null)
		return true;
	else
		return false;
}
public void insertAtBegining(Object x)
{
	Node n = new Node(x);
	n.next = first;
	first = n;
}
public void insertAtEnd(Object x)
{
	if (isEmpty()){
		insertAtBegining(x);
	}
	else
	{
		Node n = new Node(x);
		Node p = first;
		while (p.next != null)
		{
			p = p.next;
		}
		p.next = n;
	}
}

public void deleteAtEnd()
{
	if (isEmpty())
	{
		System.out.println("cannot delete from end");
		
	}
	else
	{
		Node p = first;
		while (p!=null)
		{
			Node y = p;
			p = p.next;
			if (p.next == null)
			{	Object x = p.data;
				p = y ;
				p.next = null;
				System.out.println("End node deleted is " +x);
				break;
			}	
		}
	}
}

public void insertAtPosition(Object x , int position)
{
  if (isEmpty() || position == 0)
  {
	  System.out.println("position 0 or String is empty ... inserting at the start");
	  insertAtBegining(x);
  }
  else
  {
	  Node n = new Node (x);
	  Node p = first;
	  int count = 0;
	  
	  
	  
	  for (count = 0 ; count < position -1 ; count ++)
	  {
		  p = p.next;
		  
	  }
	  if (p.next == null)
	  {
		  System.out.println(" position exceeds LIST !!! ");
	      
	  }
	  else
	  {
	  n.next = p.next;
	  p.next = n;
	  }
	  
  }
}
public Object deleteFromBegining()
{
	if (isEmpty())
	{
		System.out.println("cannot delete from empty list");
		return false;
	}
	else
	{
		Object deleted = first.data;
		first = first.next;
		return deleted;
	}
}




public void print(){
	Node p= first ;
	while (p !=null){
		System.out.print(p.data+ "->");
		p = p.next;
	}
	System.out.println("Null");
}

}
