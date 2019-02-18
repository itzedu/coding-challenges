package hackerrank;

public class BSTTester {

	public static void main(String[] args) {
//        final BTNode root = new BTNode(10);
//        BTNode firstLeft = root.insertLeft(5);
//        BTNode firstRight = root.insertRight(15);
//        firstLeft.insertLeft(2);
//        firstLeft.insertRight(7);
//        firstRight.insertRight(20);
//
//        System.out.println(root.checkVal());
        
        final BTNode root = new BTNode(50);
        final BTNode a = root.insertLeft(30);
        a.insertLeft(20);
        a.insertRight(25);
        final BTNode b = root.insertRight(80);
        b.insertLeft(70);
        b.insertRight(90);
        final boolean result = root.checkVal(Integer.MAX_VALUE, Integer.MAX_VALUE);
        System.out.println(result);
	}
}
