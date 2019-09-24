package cn.com.io;

import java.io.File;

public class TestDirDemo {
    public static void main(String[] args) {
        // mkdir():  上级目录存在 创建才能成功， 不存在的话 就创建失败
        File file = new File("F:/java code/io_Studey/abc/test");
//        boolean flag = file.mkdir();
//        System.out.println(flag);
        boolean flag = file.mkdirs();
        System.out.println(flag);
        System.out.println("--------");
        file = new File("F:/java code/io_Studey/abc/test0");
        flag = file.mkdir();
        System.out.println(flag);

        //list() 返回下一级名称
        System.out.println("-----");
        file = new File("F:/java code/io_Studey");
        String[] str  = file.list();
        for (String s :str) {
            System.out.println(s);
        }
        //listFiles() 返回下一级的 （对象）
        System.out.println("----------");
        File[] obj = file.listFiles();
        for (File f: obj) {
            System.out.println(f);
        }
        //所有的盘符
        System.out.println("-------------");
        File[] objs = file.listRoots();
        for (File ff: objs) {
            System.out.println(ff);
        }

    }
}
