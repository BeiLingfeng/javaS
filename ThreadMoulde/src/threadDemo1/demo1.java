package threadDemo1;

/**
 * @program: cloneTest
 * @ClassName demo1
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 20:23
 **/
public class demo1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("线程执行" + (i + 1));
        }
    }
}
