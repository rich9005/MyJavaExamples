
public class BSTn {
Node root;

void addElement (int x)
{
	Node n = new Node(x);
	if (root == null) // tree is empty
	{
		root = n;
	}
	else
	{
		Node curr , prev;
		curr = root;
		prev = root;
		
			while ( curr != null)
			{
				prev = curr;
				if ( x < curr.data)
					curr = curr.leftchild;
				else
					curr = curr.rightchild; 	
			}
			if (x <prev.data)
				prev.setLeft(n);
			else
				prev.setRight(n);
	}
}
	void inorder(Node n)
	{
		if (n == null)
			return;
		else
		{
			inorder(n.leftchild);
			System.out.println("-" +n.data);
			inorder(n.rightchild);
		}
	}
	
	void deleteElement (int x)
	{
		Node curr = root;
		
		while (curr!= null && curr.data!=x)
		{
			if (x<curr.data)
				curr = curr.leftchild;
			else
				curr = curr.rightchild;
		}
		
		if (curr == null)
			System.out.println( x + "is not present");
		else
		{
			Node replacement = null;
			//curr is a leaf node
			if (curr.leftchild == null && curr.rightchild == null)
			{
				System.out.println("leaf node" +x);
				replacement = null;
			}
 			if (curr.leftchild !=null && curr.rightchild == null)
				{replacement = curr.leftchild;}
			if (curr.leftchild ==null && curr.rightchild != null)
				{replacement = curr.rightchild;}
			//if curr has both the children 
			if (curr.leftchild !=null && curr.rightchild != null)
			{
				System.out.println("Has both child" +x);
				//replace with inorder successor
				replacement = curr.rightchild;
				while (replacement.leftchild != null)
				{
					replacement = replacement.leftchild;
				}
				//replacemtn point to inorde successor
				
				Node replacement_parent = replacement.parent;
				
				if (curr!=replacement_parent)
				{
					replacement_parent.leftchild = replacement.rightchild;
					replacement.rightchild= curr.rightchild;
				}
				replacement.leftchild = curr.leftchild;
			}
				Node parent = curr.parent;
				if (parent == null)
					root = replacement;
				else
				{
					if (curr == parent.leftchild)
						parent.leftchild = replacement;
					else
						parent.rightchild = replacement;
				}
				
			
		}
	}

}
