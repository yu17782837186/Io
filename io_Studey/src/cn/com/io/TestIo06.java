package cn.com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestIo06 {
    public static void main(String[] args) {
        //文件字符输出流
        File file = new File("abc.txt");
        Writer write = null;
        try {
            write = new FileWriter(file,false);
            //第一种方法
//            String str = "我要很努力！!";
//            char[] flush = str.toCharArray();
//            write.write(flush,0,flush.length);
//            write.flush();

            //第二种方法
//            String str = "努力的还不够！！！";
//            write.write(str);
//            write.write("想要更努力！！！");
//            write.flush();

            //第三种方法
            write.append("小明").append("小红").append("小军");
            write.flush();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (write != null) {
                    write.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
        }
    }

