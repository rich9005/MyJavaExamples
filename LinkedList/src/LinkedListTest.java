
public class LinkedListTest {
public static void main(String [] args)
{
	LinkedList l1 = new LinkedList();
	l1.insertAtBegining("apple");
	l1.insertAtBegining("cherry");
	l1.print();
	System.out.println("Hello Linked");
	System.out.println("Element deleted is " +l1.deleteFromBegining());
	l1.print();
	l1.insertAtEnd("zebra");
	l1.print();
	l1.deleteAtEnd();
	l1.print();
	l1.insertAtBegining("ornge");
	l1.insertAtBegining("pear");
	l1.insertAtBegining("banana");
	l1.print();
	l1.insertAtPosition("Food", 0);
	l1.print();
}
}
