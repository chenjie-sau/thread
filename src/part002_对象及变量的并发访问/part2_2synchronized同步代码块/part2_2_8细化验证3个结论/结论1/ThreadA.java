package part002_对象及变量的并发访问.part2_2synchronized同步代码块.part2_2_8细化验证3个结论.结论1;

/**
 * Created by chenjie on 2020/1/30.
 */
public class ThreadA extends Thread {
    private Service service;
    private MyObject object;

    public ThreadA(Service service, MyObject object){
        super();
        this.service = service;
        this.object = object;
    }

    @Override
    public void run() {
        super.run();
        service.testMethod1(object);
    }
}
