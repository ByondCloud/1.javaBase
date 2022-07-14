package 一类变量和类方法.关键字static.解决问题;

public class ChildGame {

    public static void main(String[] args) {

        // 定义一个变量 count, 统计有多少小孩加入了游戏
        int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
        child1.count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        child2.count++;

        Child child3 = new Child("老鼠精");
        child3.join();
        child3.count++;

        System.out.println("一共有" + count + "个小孩加入了游戏");
    }


}

class Child {
    private String name;
    // 定义一个变量count，是一个类变量(静态变量) static 静态
    // 该变量最大的特点就是会被Child类的所有的对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
