package cn.com.io;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
//        //File对象的三种构建方式
//        String path = "F:/java code/io_Study/abc.txt";
//        //1，构建File对象 直接丢路径
//        File file = new File(path);
//        System.out.println(file.length());
//        //2，构建File对象 父子构建
//        file = new File("F:/java code/io_Study","abc.txt");
//        System.out.println(file.length());
//        file = new File("F:/java code/","io_Study/abc.txt");
//        System.out.println(file.length());
//        //3，构建File对象 构建父对象，子名称
//        file = new File(new File("F:/java code/io_Study"),"abc.txt");
//        System.out.println(file.length());


//        String path = "F:java code/io_Study/abc.txt";
//        //绝对路径
//        File file = new File(path);
//        System.out.println(file.getAbsolutePath());
//        //相对路径
//        System.out.println(System.getProperty("user.dir"));
//        file = new File("abc.txt");
//        System.out.println(file.length());
//        System.out.println(file.getPath());
//        //构建一个不存在的文件
//        file = new File("abc/ball.png");
//        System.out.println(file.getAbsolutePath());

//        //文件的一些基本方法
//        File file = new File("F:/java code/io_Studey/abc.txt");
//        System.out.println("名称："+file.getName());
//        System.out.println("路径："+file.getPath());
//        System.out.println("绝对路径："+file.getAbsolutePath());
//        System.out.println("获得父路径："+file.getParent()); //没有返回null
//        System.out.println("父对象："+file.getParentFile().getName()); //返回上一层的名称


//        //文件的状态 不存在：exists 存在 是文件还是目录
//        File file = new File("io_Studey/abc.txt");
//        System.out.println("是否存在："+file.exists());
//        System.out.println("是否是文件："+file.isFile());
//        System.out.println("是否是目录："+file.isDirectory());
//
//        file = new File("abc.txt");
//        System.out.println("-------------");
//        System.out.println("是否存在："+file.exists());
//        System.out.println("是否是文件："+file.isFile());
//        System.out.println("是否是目录："+file.isDirectory());
//
//        file = new File("F:/java code/io_Studey");
//        System.out.println("----------");
//        System.out.println("是否存在："+file.exists());
//        System.out.println("是否是文件："+file.isFile());
//        System.out.println("是否是目录："+file.isDirectory());
//        //文件的一般操作流程如下
//        file =new File("***");
//        if(file == null || !file.exists()) {
//            System.out.println("文件不存在！");
//        }else if (file.isFile()) {
//            System.out.println("是文件");
//        }else {
//            System.out.println("是目录");
//        }

//        //length() 长度(返回的是文件的字节数)
//        File file = new File("F:/java code/io_Studey/abc.txt");
//        System.out.println("长度："+file.length());
//        file = new File("F:/java code/io_Studey");
//        System.out.println("长度："+file.length());

        //创建文件 createNewFile();
        File file = new File("F:/java code/io_Studey/io.txt");
        boolean flag = false;
        try {
            flag = file.createNewFile();
        }catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        flag = file.delete();
        System.out.println(flag);
        file = new File("F:/java code/io_Studey2");
        try {
            flag = file.createNewFile();
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(flag);
        flag = file.delete();
        System.out.println(flag);
    }
}
