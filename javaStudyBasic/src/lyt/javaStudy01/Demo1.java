package lyt.javaStudy01;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @program: cloneTest
 * @ClassName Demo1
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-25 14:25
 **/
public class Demo1 {
    public static void main(String[] args) throws IOException {



    }

    private static void fileDemo2() throws IOException {
        File f1 = new File("D:\\test\\java.txt");
        System.out.println(f1.createNewFile());
        File f4 = new File("javaStudyBasic\\a.txt");
        System.out.println(f1.createNewFile());
        File f2 = new File("D:\\test\\newDir");
        System.out.println(f2.mkdir());
        File f3 = new File("D:\\test\\newDir\\newDirs\\newDir1");
        System.out.println(f3.mkdirs());
    }

    private static void filedDemo1() {
        File f1 = new File("D:\\java.txt");
        System.out.println(f1);
    }

    private static void demo1() {
        Collection<Student> students = new ArrayList<>();
        Student a = new Student(12, "张三");
        Student b = new Student(16, "李四");
        Student c = new Student(20, "王五");
        students.add(a);
        students.add(b);
        students.add(c);
        Iterator<Student> iterator = students.iterator();
        for (Student student : students) {
            System.out.println(student);
        }
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
