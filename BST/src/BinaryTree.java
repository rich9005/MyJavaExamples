
public class BinaryTree {

	public static void main (String [] args)
	{
		BSTn tree = new BSTn();
		int[] numbers = {11,2,5,21,3,1};
		for ( int i:numbers)
		{
			tree.addElement(i);
			System.out.println("adding element " +i);
			tree.inorder(tree.root);
		}
		
		tree.deleteElement(2);
		System.out.println("deleting");
		tree.inorder(tree.root);
	
	}
}
