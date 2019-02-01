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
    	if(node.left == null && node.right == null) {
    		return 1;
    	}
    	
    	int leftHeight = 0;
    	int rightHeight = 0;
    	
    	if(node.left != null && node.right == null) {
    		leftHeight = countDepth(node.left);
    	} else if(node.right != null && node.left == null) {
    		rightHeight = countDepth(node.right);
    	} else {
    		leftHeight = countDepth(node.left);
    		rightHeight = countDepth(node.right);
    	}
    
    	return 1 + leftHeight + rightHeight;
    }
    
    public static boolean isBalanced(BTNode treeRoot) {
        // determine if the tree is superbalanced
    	// A tree is "superbalanced" if 
    	//  the difference between the depths of any two leaf nodes is no greater than one.
    	if(treeRoot == null) return true;
    	
    	int leftDepth = 0;
    	int rightDepth = 0;
    	
    	if(treeRoot.left != null) {
    		leftDepth = countDepth(treeRoot.left);
    	}
    	
    	if(treeRoot.right != null) {
    		rightDepth = countDepth(treeRoot.right);
    	}

    	if(Math.abs(leftDepth - rightDepth) <= 1) {
    		return true;
    	}
    	
        return false;
    }
}
