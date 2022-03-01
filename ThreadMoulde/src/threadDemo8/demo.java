package threadDemo8;

/**
 * @program: cloneTest
 * @ClassName demo
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 21:15
 **/
public class demo {
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        t1.setName("普通线程");
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.setName("守护线程");
        t2.setDaemon(true);//当只有守护线程时，程序会停止运行,虚拟机退出
        //但是不会立马停止,还会执行一小会,不会执行完毕
        t2.start();
    }
}
