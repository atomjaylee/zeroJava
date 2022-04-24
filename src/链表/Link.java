package 链表;

public class Link {

    // -------------- 为了让Node类仅让Link类调用，所以设置为内部类 ----------------
    // 内部类的好处 - 避免了外部类访问内部类的设置getter和setter的尴尬
    private class Node {
        private Object data;  // 存放数据
        private Node next; // 下一个节点关系

        public Node(Object data) {
            this.data = data;
        }

        // 添加节点关系
        // 第一次调用 this = Link.root;
        public void addNode(Node newNode) {
            if (this.next == null) {
                this.next = newNode;
            } else {
                this.next.addNode(newNode);
            }
        }

        // 通过递归来取出节点的数据
        // 第一次调用 this = Link.root;
        public void toArrayNode() {
            Link.this.retData[Link.this.foot++] = this.data;
            if (this.next != null) {
                this.next.toArrayNode();
            }
        }

        // 递归利用equals来查询数据
        public boolean containsNode(Object search) {
            if (search.equals(this.data)) {
                return true;
            } else {
                if (this.next != null) {
                    return this.next.containsNode(search);
                } else {
                    return false;
                }
            }
        }

        // 通过递归 查询指定下标的数据
        public Object getNode(int index) {
            if (Link.this.foot++ == index) {
                return this.data;
            } else {
                return this.next.getNode(index);
            }
        }

        // 设置节点的数据
        public void setNode(int index, Object data) {
            if (Link.this.foot++ == index) {
                this.data = data;
            } else {
                if (this.next != null) {
                    this.next.setNode(index, data);
                }
            }
        }
    }

    // ----------------- 以下为Link类 ---------------------------

    private Node root; // 根节点，不然无法追加后续节点
    private int count = 0; // 链表中节点的数量
    private Object[] retData; // 返回的全部数据
    private int foot = 0; // 链表的脚标

    // 添加数据
    public void add(Object data) {
        if (data == null) {
            return; // 结束操作
        }
        Node newNode = new Node(data);
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    // 获取数据的个数
    public int size() {
        return this.count;
    }

    // 判断是否为空链表
    public boolean isEmpty() {
        return this.root == null && this.count == 0;
    }

    // 获取所有数据 -  返回对象数组
    public Object[] toArray() {
        if (this.count == 0) {
            return null;
        }

        // 开辟指定长度的对象数组
        this.retData = new Object[this.count];
        this.foot = 0;
        this.root.toArrayNode();
        return this.retData;
    }

    // 数据的查询
    public boolean contains(Object search) {
        if (search == null || this.root == null) {
            return false;
        }
        return this.root.containsNode(search);
    }

    //    获取指定下标下的数据
    public Object get(int index) {
        if (index >= this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    // 修改指定下标的数据
    public void set(int index, Object data) {
        if (index >= this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, data);
    }
}
