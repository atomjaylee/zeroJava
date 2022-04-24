package 阿里java;

class Trray{
    private int data[];
    private int footer = 0;

    public Trray(int len){
        if(len>0){
            this.data = new int[len];
        }else{
            this.data = new int[1];
        }
    }
    // 数组的动态扩充
    public void inc(int num){
        int newData[] = new int[this.data.length+num];
        System.arraycopy(this.data,0,newData,0,this.data.length);
        this.data = newData;
    }
    // 添加元素
    public boolean add(int num){
        if(this.footer>=this.data.length){
            return false;
        }
        this.data[footer++] = num;
        return true;
    }
    // 返回该数组
    public int[] getData(){
        return this.data;
    }
}

public class Array父类 {
    public static void main(String[] args){
        Trray arr= new Trray(5);
        System.out.println(arr.add(2));
        System.out.println(arr.add(3));
        System.out.println(arr.add(4));
        System.out.println(arr.add(5));
        System.out.println(arr.add(6));

        arr.inc(1);
        System.out.println(arr.add(7));

        int result[] = arr.getData();
        for(int x=0;x<result.length;x++){
            System.out.println(result[x]);
        }
    }
}
