package part003线程间通信.part3_3类ThreadLocal的使用.part3_3_2验证线程变量的隔离性;

public class ThreadA extends Thread {
    @Override
    public void run() {
        try{
            for (int i = 0; i < 100; i++) {
                Tools.t1.set("ThreadA" + (i + 1));
                System.out.println("ThreadA get value" + Tools.t1.get());
                Thread.sleep(200);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
