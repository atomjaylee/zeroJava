package 阿里java;

/**
 * 员工和部门的关系 - 面向对象编程
 *
 * 数据表设计：
 *      - 员工： empno(编号), ename(姓名), job(职位), sal(薪资), mgr(领导), dept(所属部门)
 *      - 部门: deptno(部门编号)， dname(部门名称); loc(公司地址)
 *
 *  需求：
 *      1、 一个部门有多个员工，并输出整个的部门信息
 *      2、 根据员工能找到对应的领导信息和该员工的部门信息
 *
 *
 *      数据表和简单Java类的关系
 *       - 数据表的名称 = java类的名称
 *       - 数据表的字段 =  java类中的属性
 *       - 数据表的一行信息 = java类的一个对象
 *       - 表的多行记录 = 对象数组
 *       - 表的引用配置 = 外键关系
 */

class Emp {
    private int empno;
    private String ename;
    private String job;
    private double sal;
    private Emp mgr; // 员工领导
    private Dept dept; // 所属部门

    public Emp(){}
    public Emp(int empno, String ename, String job, double sal){
        this.empno = empno;
        this.ename = ename;
        this.job = job;
        this.sal = sal;
    }

    public Emp getMgr(){
        return this.mgr;
    }

    public void setMgr(Emp mgr){
        this.mgr = mgr;
    }

    public Dept getDept(){
        return this.dept;
    }

    public void setDept(Dept dept){
        this.dept = dept;
    }
    public String getInfo(){
        return "[员工信息]: empno=" + this.empno + ",ename=" + this.ename +",job=" + this.job + ",sal=" + this.sal;
    }
}


class Dept{
    private int deptno;
    private String dname;
    private String loc;
    private Emp[] emps;

    public Dept(){}
    public Dept(int deptno, String dname, String loc){
        this.deptno = deptno;
        this.dname = dname;
        this.loc= loc;
    }

    public Emp[] getEmps(){
        return this.emps;
    }

    public void setEmps(Emp[] emps){
        this.emps = emps;
    }

    public String getInfo(){
        return "[部门信息]: deptno=" + this.deptno + ",dname="+ this.dname + ",loc=" + this.loc;
    }
}




public class 简单java类和数据表 {
    public static void main(String[] args){
        // 第一步 设置类对象之间的关系
        // 1. 创建实例化对象
        Dept dept = new Dept(1, "X-Charge","北京");
        Emp ea = new Emp(1501, "张三", "前端工程师",  200.0);
        Emp eb = new Emp(1502, "李四", "UI设计", 300.0);
        Emp ec = new Emp(1503, "王五", "总监", 5000.90);
        // 2. 设置关系
        ea.setMgr(ec);
        eb.setMgr(ec);

        ea.setDept(dept);
        eb.setDept(dept);
        ec.setDept(dept);

        dept.setEmps(new Emp[] {ea,eb,ec});
        // 第二部 进行数据的获取

        System.out.println(dept.getInfo());

        System.out.println("===================");

        printArr(dept.getEmps());

        System.out.println("===================");
        System.out.println(ea.getMgr().getInfo());
        System.out.println(ea.getMgr().getDept().getInfo());

    }


    // 打印数组
    public static void printArr(Emp temps[]){
        for(int x =0; x< temps.length; x++){
            System.out.println(temps[x].getInfo());
        }
    }
}
