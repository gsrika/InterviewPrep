
public class LCA {
	
	public static TreeNode findLCA(TreeNode root, int a ,int b) {
		if(root == null) {
			return null;
		}
		else {
			int minValue = Math.min(a, b);
			int maxValue = Math.max(a,b);
			int value = root.getData();
			if( value > minValue && value > maxValue) {
				return findLCA(root.getLeftNode(),a,b);
			}
			else if ( value < minValue && value < maxValue) {
				return findLCA(root.getLeftNode(),a,b);
			}
			else {
				return root;
			}
			
		}
	}
	
	public static void main(String args[]) {
		
		int a[] = {3,4,5,6,7,8,9};
		TreeNode root =TreeOperations.CreateBinaryTree(a, 0, 6);
		TreeNode lca = findLCA(root,3, 5);
		System.out.println(lca.getData());
		
	}

}
