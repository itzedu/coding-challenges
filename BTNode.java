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
    
    public static boolean isBinarySearchTree(BTNode root) {
        return isBinarySearchTree(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private static boolean isBinarySearchTree(BTNode root, int lowerBound, int upperBound) {
        if (root == null) {
            return true;
        }

        if (root.value >= upperBound || root.value <= lowerBound) {
            return false;
        }

        return isBinarySearchTree(root.left, lowerBound, root.value)
            && isBinarySearchTree(root.right, root.value, upperBound);
    }
}
