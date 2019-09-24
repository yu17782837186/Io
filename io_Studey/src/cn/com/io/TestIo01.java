package cn.com.io;

import java.io.File;

public class TestIo01 {
    public static void main(String[] args) {
        String path = "D:\\io_test";
        //看名称分割符，separatorChar();
        System.out.println(File.separatorChar);
        path = "D:/io_test";
        //System.out.println(path);
        System.out.println(path);
        //使用常量拼接,separator常量拼接
        path = "D:"+File.separator+"io_test";
        System.out.println(path);
    }
}
