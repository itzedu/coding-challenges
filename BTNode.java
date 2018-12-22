package hackerrank;

public class BTNode {
    public int value;
    public BTNode left;
    public BTNode right;

    public BTNode(int value) {
        this.value = value;
    }

    public BTNode insertLeft(int leftValue) {
        this.left = new BTNode(leftValue);
        return this.left;
    }

    public BTNode insertRight(int rightValue) {
        this.right = new BTNode(rightValue);
        return this.right;
    }
    
    public static int countDepth(BTNode node) {
    	System.out.println(node.value);
    	if(node.left == null && node.right == null) {
    		return 1;
    	}
    	
    	return 1 + countDepth(node.left) + countDepth(node.right);
    }
    
    public static boolean isBalanced(BTNode treeRoot) {
        // determine if the tree is superbalanced
    	// A tree is "superbalanced" if 
    	//  the difference between the depths of any two leaf nodes is no greater than one.
    	if(treeRoot == null) return true;
    	
    	int leftDepth = countDepth(treeRoot.left);
    	int rightDepth = countDepth(treeRoot.right);
    	
    	if(Math.abs(leftDepth - rightDepth) <= 1) {
    		return true;

    	}
        return false;
    }
}
