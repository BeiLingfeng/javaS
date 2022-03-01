package threadDemo6;

/**
 * @program: cloneTest
 * @ClassName demo
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 21:03
 **/
public class demo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();
        Thread t1 = new Thread(mr);
        t1.start();

    }
}
