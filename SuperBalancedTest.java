package hackerrank;

public class SuperBalancedTest {

	public static void main(String[] args) {
        final BTNode root = new BTNode(5);
        final BTNode a = root.insertLeft(8);
        final BTNode b = root.insertRight(6);
        a.insertLeft(1);
        a.insertRight(2);
        b.insertLeft(3);
        b.insertRight(4);
        final boolean result = BTNode.isBalanced(root);
        

	}

}
