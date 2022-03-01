package threadDemo7;

import java.util.concurrent.FutureTask;

/**
 * @program: cloneTest
 * @ClassName demo
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 21:07
 **/
public class demo {
    public static void main(String[] args) {
        MyCallable mc = new MyCallable();
        FutureTask<String> ft = new FutureTask<>(mc);
        Thread t1 = new Thread(ft);
        t1.setName("飞机");
        t1.setPriority(10);
//        t1.getPriority();//默认5  最大10  最小1
        t1.start();

        MyCallable mc2 = new MyCallable();
        FutureTask<String> ft2 = new FutureTask<>(mc);
        Thread t2 = new Thread(ft2);
        t2.setName("火箭");
        t2.setPriority(1);
        t2.start();

    }
}
