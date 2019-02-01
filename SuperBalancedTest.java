package hackerrank;

public class SuperBalancedTest {

	public static void main(String[] args) {
        final BTNode root = new BTNode(1);
        root.insertLeft(5);
        final BTNode b = root.insertRight(9);
        b.insertLeft(8).insertLeft(7);
        b.insertRight(5);
        final boolean result = BTNode.isBalanced(root);
        System.out.println(root);
        System.out.println(result);
	}

}
