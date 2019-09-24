package cn.com.io;

import java.io.File;

public class TestDirDemo2 {
    //文件的大小
    private long len;
    //文件的路径
    private String path;
    //源
    private File file;
    //文件的个数
    private int fileSize;
    //文件夹的个数
    private int dirSize;

    public TestDirDemo2(String path) {
        this.path = path;
        this.file = new File(path);
        printSize(this.file);
    }
    private void printSize(File file) {
        if (file.exists() && file != null) {
            if (file.isFile()) {
                this.fileSize++;
                len += file.length();
            }else {
                this.dirSize++;
                for (File f:file.listFiles()) {
                    printSize(f);
                }
            }
        }
    }

    public long getLen() {
        return len;
    }

    public void setLen(long len) {
        this.len = len;
    }

    public int getFileSize() {
        return fileSize;
    }

    public void setFileSize(int fileSize) {
        this.fileSize = fileSize;
    }

    public int getDirSize() {
        return dirSize;
    }

    public void setDirSize(int dirSize) {
        this.dirSize = dirSize;
    }

    public static void main(String[] args) {
        TestDirDemo2 td =new TestDirDemo2("F:/java code/io_Studey");
        System.out.println(td.getLen()+"---->"+td.fileSize+"---->"+td.dirSize);
        TestDirDemo2 td1 =new TestDirDemo2("F:/java code/io_Studey/src");
        System.out.println(td1.getLen()+"---->"+td1.fileSize+"---->"+td1.dirSize);
    }
}
