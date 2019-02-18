package hackerrank;

public class BST {
	public BTNode root;
	
	public BST() {
		this.root = null;
	}
	
	public boolean isValid() {
		BTNode currNode = this.root;
		if(currNode == null) {
			return true;
		}
		
		return currNode.checkVal(Integer.MIN_VALUE, Integer.MAX_VALUE);
	}
	
}
