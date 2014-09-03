package com.interviewprep.trees;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class BianryTreetoHeap {
	
	
	public static void traverseTree(TreeNode root, List<TreeNode> heapNodes) {
		if(root != null ) {
			heapNodes.add(root);
			traverseTree(root.getLeftNode(), heapNodes);
			traverseTree(root.getRightNode(),heapNodes);
		}				
	}
	
	public static TreeNode converBinaryTreetoHeap(TreeNode root) {
		List<TreeNode> heapNodes = new ArrayList<TreeNode>();
		traverseTree(root, heapNodes);
		Collections.sort(heapNodes, new Comparator<TreeNode>() {
		@Override
        public int compare(TreeNode o1, TreeNode o2) {
			if (o1.getData() < o2.getData()) {
				return -1;
			}
			else if (o1.getData() > o2.getData()) {
				return 1;
			}
			return 0;				
            }
			
		});
		List<TreeNode> retList = new ArrayList<TreeNode> ();
		for(int i=0;i<heapNodes.size();i++) {
			TreeNode tempNode = heapNodes.get(i);
			TreeNode leftNode = null;
			if ( (2*i + 1) < heapNodes.size()) {
				leftNode = heapNodes.get(2*i+1);
			}
			TreeNode rightNode = null;
			if( (2*i +2 )  < heapNodes.size()) {
				rightNode = heapNodes.get((2*i) +2);
			}
			tempNode.setLeftNode(leftNode);
			tempNode.setRightNode(rightNode);
			retList.add(tempNode);
		}
		return retList.get(0);
		
	}
	
	public static void main(String args[]) {
		int a[] = {3,6,5,4,7,9,8};
		TreeNode root =TreeOperations.CreateBinaryTree(a, 0, 6);
		TreeNode cr = converBinaryTreetoHeap(root);
		TreeOperations.printInorder(cr);
		
	}

}
