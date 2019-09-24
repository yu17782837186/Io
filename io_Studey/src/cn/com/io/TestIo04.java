package cn.com.io;
import java.io.*;
public class TestIo04 {
    public static void main(String[] args) {
        copy("src/cn/com/io/TestIo05.java","TestIo05.txt");
    }
    public static void copy(String src,String dest) {
        File srcfile = new File(src);
        File destfile = new File(dest);
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(srcfile);
            os = new FileOutputStream(destfile);
            byte[] flush = new byte[1024];
            int tmp;
            while((tmp = is.read(flush)) != -1) {
                os.write(flush,0,tmp);
            }
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
