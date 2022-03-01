package threadDemo2;

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
        for (int i = 0; i < 100; i++) {
            System.out.println("第二种多线程" + i);
        }
    }
}
