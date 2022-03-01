package threadDemo2;

/**
 * @program: cloneTest
 * @ClassName demo
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 20:35
 **/
public class demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();

        MyRunnable mr2 = new MyRunnable();
        Thread t2 = new Thread(mr2);
        t2.start();


    }
}
