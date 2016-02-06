
public class Node {

	int data;
	Node leftchild;
	Node rightchild;
	Node parent;
	
	Node (int x)
	{
		data = x;
	}
	
	void setLeft(Node n)
	{
		this.leftchild = n;
		if (n!=null)
			n.parent= this;
	}
	void setRight(Node n)
	{
		this.rightchild = n;
		if (n!= null)
			n.parent= this;
	}
}
