package Tree;

public class IsSameTree {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p != null && q != null) {
            if (p.val != q.val) {
                return false;
            } else {
                return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
            }
        } else {
            return false;
        }


    }
}
