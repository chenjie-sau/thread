package part003线程间通信.part3_2方法join的使用.part3_2_1学习方法join前的铺垫;

/**
 * Created by chenjie on 2020/2/18.
 */
public class Test {
    public static void main(String[] args) {
        MyThread threadTest = new MyThread();
        threadTest.start();
        //Thread.sleep("?");
        System.out.println("我想当threadTest对象执行完毕后我再执行");
        System.out.println("但上面代码中的sleep()中的值应该写多少呢？");
        System.out.println("答案是：根本不能确定：");
    }
}
