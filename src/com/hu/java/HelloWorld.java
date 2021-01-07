package com.hu.java;

/*尚硅谷·宋红康 设置版
尚硅谷•宋红康 设置版
执行(run)	alt+r
提示补全 (Class Name Completion)	alt+/
单行注释	ctrl + /
多行注释	ctrl + shift + /
向下复制一行 (Duplicate Lines)	ctrl+alt+down
删除一行或选中行 (delete line)	ctrl+d
向下移动行(move statement down)	alt+down
向上移动行(move statement up)	alt+up
向下开始新的一行(start new line)	shift+enter
向上开始新的一行 (Start New Line before current)	ctrl+shift+enter
如何查看源码 (class)	ctrl + 选中指定的结构 或
ctrl + shift + t
万能解错/生成返回值变量	alt + enter
退回到前一个编辑的页面 (back)	alt + left
进入到下一个编辑的页面(针对于上条) (forward)	alt + right
查看继承关系(type hierarchy)	F4

**/

import java.awt.*;
import java.util.ArrayList;

public class HelloWorld {

public static void main(String[] args){
//    public static final int INITIAL_SIZE=10;
        System.out.println("helloworld");
        ArrayList list1 = new ArrayList();
       System.out.println(list1);
               


}}
class test{
    public static void main(String[] args) {
        System.out.println();
        System.out.println("args = [" + args + "]");
        int num1=10;
        System.out.println("num = " + num1);
//        模板三：fori
        String[] temp=new String[]{"hu","jia","bin"};
        for (int i = 0; i <temp.length ; i++) {
            System.out.println(temp[i]);

        }
        //变形：iter
        for (String s : temp) {
            System.out.println(s);
        }
        //变形:itar
        for (int i = 0; i < temp.length; i++) {
            String s = temp[i];
            System.out.println(s);

        }

        //if
        List list=new List();
        list.add("124");
        list.add("125");
        list.add("127");
        if (list == null) {

        }


    }
}



