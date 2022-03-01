package threadDemo3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @program: cloneTest
 * @ClassName demo
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 20:40
 **/
public class demo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyCallable mc = new MyCallable();

        FutureTask<String> ft = new FutureTask<>(mc);//实现了runnable接口，所以可以作为thread的参数传递进去

        Thread t1 = new Thread(ft);
        t1.start();
        //可以获取线程执行的结果，必须要在执行后
        String s = ft.get();
        System.out.println(s);

    }
}
