package cn.com.io;

import java.io.File;

public class TestDirDemo1 {

    public static void main(String[] args) {
        File file  = new File("F:/java code/io_Studey");
        //printName(file,0);
        printFileSize(file);
        System.out.println(len);
    }
    //递归打印所有文件及文件夹的子目录
    public static void printName(File file,int i) {
        for (int j = 0; j <i ; j++) {
            System.out.print("-");
        }
        System.out.println(file.getName());
        if (!file.exists() || file == null) {
            return;
        }else if(file.isDirectory()) {
            //listFiles() 返回下一级对象
            for ( File f:file.listFiles()) {
                printName(f,i+1);
            }
        }
    }

    //统计文件夹的大小
    private static long len = 0;
    public static void printFileSize(File file) {
        //获取大小
        if (file.exists() && file != null) {
            if (file.isFile()) {
                len += file.length();
            }else {
                for (File ff:file.listFiles()) {
                    printFileSize(ff);
                }
            }
        }
    }
}
