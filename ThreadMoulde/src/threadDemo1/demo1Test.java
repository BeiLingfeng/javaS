package threadDemo1;

/**
 * @program: cloneTest
 * @ClassName demo1Test
 * @description:初体验
 * @author: 罗业腾
 * @create: 2022-02-28 20:24
 **/
public class demo1Test {
    public static void main(String[] args) {
        demo1 t1 = new demo1();
        demo1 t2 = new demo1();
        t1.start();
        t2.start();

    }
}
