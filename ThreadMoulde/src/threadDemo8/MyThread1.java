package threadDemo8;

/**
 * @program: cloneTest
 * @ClassName MyThread1
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 21:14
 **/
public class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
        }
    }
}
