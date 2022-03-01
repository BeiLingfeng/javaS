package lyt.javaStudy01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * @program: cloneTest
 * @ClassName IO
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-27 20:48
 **/
public class IO {

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("javaStudyBasic/a.txt");
        int b ;
        while((b = fis.read()) != -1){
            System.out.print((char)b);
        }


        fis.close();
    }

    private static void IOdemo3() throws IOException {
        FileInputStream fis = new FileInputStream("javaStudyBasic/a.txt");
        byte[] bytes = new byte[1024];
        fis.read(bytes);
        System.out.println(Arrays.toString(bytes));
    }

    private static void IOdemo2() {
        //        - 字节流写数据实现换行
//        - **windows:\r\n
//        - **linux:\n
//        - **mac:\r
//        - 字节流写数据如何实现追加写入
//        - public FileOutputStream(String name,boolean append)
//        - 创建文件输出流以指定的名称写入文件。如果第二个参数为true ，则字节将写入文件的末尾而不是开头
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("javaStudyBasic/a.txt", true);
            //        byte[] bytes = "1145dawd".getBytes();
////        fos.write(bytes);
            fos.write("\r\n".getBytes());
            for (int i = 0; i < 10; i++) {
                fos.write((i + "hello").getBytes());
                fos.write("\r\n".getBytes());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                assert fos != null;
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }

    private static void IOdemo1() throws IOException {
        //    void write(int b)将指定的字节写入此文件输出流 一次写一个字节数据
//    void write(byte[] b)将 b.length字节从指定的字节数组写入此文件输出流 一次写一个字节数组数据
//    void write(byte[] b, int off, int len)将 len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流 一次写一个字节数组的部分数据
        FileOutputStream fos = new FileOutputStream("javaStudyBasic/a.txt");
        byte[] bytes = "abcdefg".getBytes();
        fos.write(bytes);
        fos.close();
    }
}
