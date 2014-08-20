
public class TreeOperations {
	
	public static TreeNode CreateBinaryTree(int nodeList[], int start, int end)  {
		if( start > end) {
			return null;
		}
		TreeNode root = new TreeNode();
		int mid = (start+end)/2;
		root.setData(nodeList[mid]);
		root.setLeftNode(CreateBinaryTree(nodeList, start, mid-1));
		root.setRightNode(CreateBinaryTree(nodeList, mid+1, end));
		return root;
	}
	
	public static void printInorder(TreeNode root) {
		if( root != null ) {
			printInorder(root.getLeftNode());
			System.out.println(root.getData());
			printInorder(root.getRightNode());			
		}
	}
	
	public static void printPostOrder(TreeNode root) {
		if(root != null) {
			printPostOrder(root.getLeftNode());
			printPostOrder(root.getRightNode());
			System.out.println(root.getData());
		}
	}
	
	public static void printPreOrder(TreeNode root) {
		if (root != null ) {
			System.out.println(root.getData());
			printPreOrder(root.getLeftNode());
			printPreOrder(root.getRightNode());			
		}
	}
	
	public static boolean isElementExists(TreeNode root, int value ) {
		if(root == null) {
			return false;
		}
		if(value == root.getData()) {
			return true;
		}
		if(value < root.getData()) {
			return(isElementExists(root.getLeftNode(), value));
		}
		else {
			return(isElementExists(root.getRightNode(), value));
		}
	}
	
	public static void preorderTraversalWithoutRecursion(TreeNode root) {
		StackLinkedList<TreeNode> st = new StackLinkedList<TreeNode>();	
		while(!st.isEmpty() || root!=null) {
			while(root != null) {
				System.out.println(root.getData());
				st.push(root);
				root = root.getLeftNode();
			}
			root = st.pop().getRightNode();
		}		
	}
	
	public static void main(String args[]) {
		int a[] = {1,2,3,7,4,5,6};
		TreeNode root = CreateBinaryTree(a,0,6);
		preorderTraversalWithoutRecursion(root);
		System.out.println(isElementExists(root, -1));

	}

}
