package oop;

/**
 * Java中类似js中的闭包实现，可以使用内部类来大致实现
 */
public class Closure {
    public static void main(String[] args) {
        Atom tom = new Atom();
        Atom.Inner closure = tom.new Inner();
        System.out.println(closure.getName());
    }
}

class Atom {
    protected String name = "atom";

    public class Inner {
        public String getName() {
            return name;
        }
    }
}
