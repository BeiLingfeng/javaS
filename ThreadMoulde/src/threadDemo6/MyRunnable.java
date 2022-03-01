package threadDemo6;

/**
 * @program: cloneTest
 * @ClassName MyRunnable
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 20:34
 **/
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread() + "第二种多线程" + i);
        }
    }
}
