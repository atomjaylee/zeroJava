import java.lang.Comparable;
import java.util.Arrays;

class BinaryTree {
    // 内部类
    private class Node {
        private Comparable data;
        private Node left;
        private Node right;

        public Node(Comparable data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.data.compareTo(newNode.data) > 0) {
                if (this.left == null) {
                    this.left = newNode;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if (this.left != null) {
                this.left.toArrayNode();
            }
            BinaryTree.this.retData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }
    }

    // =======================
    private Node root;
    private int count;
    private int foot = 0;
    private Object[] retData;

    public Object[] toArray() {
        this.foot = 0;
        this.retData = new Object[this.count];
        this.root.toArrayNode();
        return this.retData;
    }

    public void add(Object data) {
        if (data == null) {
            return;
        }
        Node newNode = new Node((Comparable) data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }
}

public class 二叉树 {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add("W");
        bt.add("Z");
        bt.add("A");

        System.out.println(Arrays.toString(bt.toArray()));
    }
}
