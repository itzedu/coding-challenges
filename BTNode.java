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
    
    public static boolean isBalanced(BTNode treeRoot) {
        // determine if the tree is superbalanced
        return false;
    }
}
