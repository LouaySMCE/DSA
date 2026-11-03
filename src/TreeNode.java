public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public static void inorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }

        inorderDFS(root.left);
        System.out.println(root.val);
        inorderDFS(root.right);
    }

    public static void preorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }

        System.out.println(root.val);
        preorderDFS(root.left);
        preorderDFS(root.right);
    }

    public static void postorderDFS(TreeNode root) {
        if (root == null) {
            return;
        }
        postorderDFS(root.left);
        postorderDFS(root.right);
        System.out.println(root.val);
    }

    public static void traversalBFS(TreeNode root) {

    }
}
