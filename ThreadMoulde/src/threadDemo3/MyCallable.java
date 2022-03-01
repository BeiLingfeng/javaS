package threadDemo3;

import java.util.concurrent.Callable;

/**
 * @program: cloneTest
 * @ClassName MyCallable
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-28 20:39
 **/
public class MyCallable implements Callable<String> {
    //    public class MyCallable implements Callable<Object> {
    @Override
//    public Object call() throws Exception {  有返回值的 返回值表示线程运行完毕后的结果
//        return null;
//    }
    public String call() throws Exception {
        for (int i = 0; i < 5; i++) {
            System.out.println("好" + i);
        }
        return "坏";
    }
}
