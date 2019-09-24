package cn.com.io;

import java.io.*;

public class TestIo02 {
    public static void main(String[] args) {
        //文件字节输入流
        File file = new File("abc.txt");
        InputStream is = null;
        try {
            is = new FileInputStream(file);
            byte[] flush = new byte[1024];
            int tmp;
            while((tmp = is.read(flush)) != -1) {
                String str = new String(flush,0,tmp);
                System.out.println(str);
            }
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (is != null) {
                    is.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
