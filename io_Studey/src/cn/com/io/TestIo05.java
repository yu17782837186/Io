package cn.com.io;

import java.io.*;

public class TestIo05 {
    public static void main(String[] args) {
        //文件字符输入流
        File file = new File("abc.txt");
        Reader reader = null;
        try {
            reader = new FileReader(file);
            char[] flush = new char[1024];
            int tmp;
            while((tmp = reader.read(flush)) != -1) {
                String str = new String(flush,0,tmp);
                System.out.println(str);
            }
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
