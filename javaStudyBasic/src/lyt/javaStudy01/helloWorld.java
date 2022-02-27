package lyt.javaStudy01;

import java.util.Arrays;
import java.util.Objects;

/**
 * @program: javaStu
 * @ClassName helloWorld
 * @description:
 * @author: 罗业腾
 * @create: 2022-02-09 03:08
 **/
public class helloWorld {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] arr1 = {4, 1, 6, 7, 2, 3, 5, 8, 10};
//        System.out.println(MyBinarySearch(arr, -1));
//        System.out.println(MyBinarySearch(arr, 0));
//        System.out.println(MyBinarySearch(arr, 1));
//        System.out.println(MyBinarySearch(arr, 3));
//        System.out.println(MyBinarySearch(arr, 6));
//        System.out.println(MyBinarySearch(arr, 7));
//        System.out.println(Arrays.toString(arr1));
//        MyBubbleSort(arr1);
//        System.out.println(Arrays.toString(arr1));
        System.out.println(getJC(5));

    }
    /*
     * @Author 罗业腾
     * @Description 二分查找实现
     * @Date 3:31 2022/2/17
     * @Param
     * @return
     **/

    public static int MyBinarySearch(int[] arr, int element) {
        int min = 0, max = arr.length - 1;
        int mid = 0;
        while (true) {
            mid = (min + max) / 2;
            if (min >= arr.length || max <= -1) {
                mid = -1;
                break;
            } else {
                if (arr[mid] == element) {//相等，返回下标
                    break;
                } else if (arr[mid] > element) {//中间的大于目标元素，则取左边的
                    max = mid - 1;
                } else {
                    min = mid + 1;
                }
            }
        }
        return mid;
    }
    /*
     * @Author 罗业腾
     * @Description 冒泡排序
     * @Date 3:32 2022/2/17
     * @Param
     * @return
     **/

    public static void MyBubbleSort(int[] arr) {
        for (int j = 0; j < arr.length - 1; j++) {
            for (int i = 0; i < arr.length - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {//比较,大的放后面
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }
    /*
     * @Author 罗业腾
     * @Description 求阶乘
     * @Date 23:56 2022/2/17
     * @Param
     * @return
     **/

    public static int getJC(int x) {
        //100! = 100*99! = 100*99*98!...
        if (x == 1) {
            return 1;
        } else {
            return x * getJC(x - 1);
        }
    }
    /*
     * @Author 罗业腾
     * @Description 快排
     * @Date 0:02 2022/2/18
     * @Param
     * @return
     **/

    public static void quickSort(int[] arr, int left, int right) {

    }
}
