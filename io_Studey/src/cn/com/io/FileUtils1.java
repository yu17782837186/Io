package cn.com.io;
import java.io.*;
public class FileUtils1 {
    public static void main(String[] args) {
        //文件到文件
//        try {
//            InputStream is = new FileInputStream("abc.txt");
//            OutputStream os = new FileOutputStream("abccopy.txt");
//            copy(is,os);
//        }catch(IOException e) {
//            e.printStackTrace();
//        }
        //文件到字节数组
        byte[] bytes = null;
        try {
            InputStream is = new FileInputStream("kt.jpg");
            OutputStream os =new ByteArrayOutputStream();
            copy(is,os);
            bytes = ((ByteArrayOutputStream) os).toByteArray();
            System.out.println(bytes.length);
        }catch(IOException e) {
            e.printStackTrace();
        }
        //字节数组到文件
        try {
            InputStream is = new ByteArrayInputStream(bytes);
            OutputStream os = new FileOutputStream("kt2.jpg");
            copy(is,os);
        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    public static void copy(InputStream is,OutputStream os) {
        byte[] bytes = new byte[1024*10];
        int tmp;
        try {
            while((tmp = is.read(bytes)) != -1) {
                os.write(bytes,0,tmp);
            }
            os.flush();
        }catch(IOException e) {
            e.printStackTrace();
        }finally {
            close(is,os);
        }
    }
    public static void close(InputStream is,OutputStream os) {
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
    public static void close2(Closeable... ios) {
        for (Closeable io: ios) {
            try {
                if (io != null) {
                    io.close();
                }
            }catch(IOException e) {
                e.printStackTrace();
            }
        }
    }
}
