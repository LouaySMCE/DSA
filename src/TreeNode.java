import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
    TreeNode() {
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
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

    public static List<List<Integer>> BFS(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> fianlist = new ArrayList<>();

        if(root==null){
            return fianlist;
        }

        queue.offer(root);

        while(!queue.isEmpty()){
            int len = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode current = queue.poll();
                currentLevel.add(current.val);
                if (current.left != null) {
                    queue.offer(current.left);
                }
                if (current.right != null) {
                    queue.offer(current.right);
                }
            }
            fianlist.add(currentLevel);
        }
        return fianlist;
    }

    public static TreeNode insert(TreeNode root, int value) {
        if (root == null) {
            return new TreeNode(value);
        }
        if (value < root.val) {
            root.left = insert(root.left, value);
        } else if (value > root.val) {
            root.right = insert(root.right, value);
        }
        return root;
    }

    public static boolean search(TreeNode root, int target){
        if(root == null){
            return false;
        }
        if(root.val == target){
            return true;
        }
        if(root.val < target){
            return search(root.right, target);
        }
        return search(root.left, target);
    }

    public TreeNode invertTree(TreeNode root){
        if(root ==null){
            return null;
        }
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }


}
