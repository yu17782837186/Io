package cn.com.io;

import java.io.*;


public class TestIo03 {
    public static void main(String[] args)  {
        //文件字节输出流
        File file = new File("abc.txt");
        OutputStream os  = null;
        try {
            os = new FileOutputStream(file);
            String str = "i love you";
            byte[] flush = str.getBytes();
            os.write(flush,0,flush.length);
            os.flush();
        }catch(FileNotFoundException e) {
            e.printStackTrace();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (os != null) {
                    os.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
