import java.util.Arrays;
import java.lang.Comparable;

// Arrays.sort(Object[] a)方法的时候，对象数组a中的对象必须实现Comparable接口。
// 类在继承Comparable接口的时候，必须复写compareTo方法

class Animation implements Comparable<Animation> {
    private int left;
    private int right;

    public Animation(int left, int right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "Animation[left = " + left + ",right = " + right + "]\n";
    }

    @Override
    public int compareTo(Animation o) {
        if (this.left > o.left) {
            return -1;
        } else {
            return 1;
        }
    }
}

public class comparable {

    public static void main(String[] args) {
        Animation ani[] = new Animation[]{
                new Animation(11, 100),
                new Animation(22, 120),
                new Animation(33, 500)
        };

        Arrays.sort(ani);
        System.out.println(Arrays.toString(ani));
    }
}
