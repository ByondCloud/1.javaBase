package 一类变量和类方法.关键字static.引出问题;

// 问题分析
// 1.count是一个独立于对象，不属于ChildGame这个类，也不属于Child类，很尴尬
// 2.以后我们使用count就很麻烦，没有使用到面向对象
// 3.因此，我们引出类变量/静态变量

public class ChildGame {

    public static void main(String[] args) {

        // 定义一个变量 count, 统计有多少小孩加入了游戏
        int count = 0;

        Child child1 = new Child("白骨精");
        child1.join();
        count++;

        Child child2 = new Child("狐狸精");
        child2.join();
        count++;

        Child child3 = new Child("老鼠精");
        child3.join();
        count++;

        System.out.println("一共有" + count + "个小孩加入了游戏");
    }


}

class Child {
    private String name;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}
