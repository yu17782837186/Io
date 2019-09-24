package cn.com.io;

        import java.io.*;

public class TestTryWithRes04_08 {
    //使用 try...with...resourse 关闭流
    public static void main(String[] args) {
        copy("src/cn/com/io/TestIo04.java","TestIo04.txt");
    }
    public static void copy(String src,String dest) {
        File srcfile = new File(src);
        File destfile = new File(dest);

        try(InputStream is = new FileInputStream(srcfile)
            ;OutputStream os = new FileOutputStream(destfile)) {
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
        }
    }
}

