package cn.com.io;

public class TestEncode {
    public static void main(String[] args) {
        String str =  "每天都要努力1";
        //编码字节数组
        byte[] data = str.getBytes();//默认使用工程 的字符集(utf8 一个汉字表示三个字节)
        System.out.println(data.length);
        System.out.println("-------");
        //解码操作
        try{
            str = new String(data,0,data.length,"utf8");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
        //乱码的原因
        //1 字节数不够
        try {
            str =new String(data,0,data.length-4,"utf8");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
        //2 字符集不统一
        try {
            str = new String(data,0,data.length,"gbk");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(str);
        //编码其它字符集
        try {
            data = str.getBytes("UTF-16");
        }catch(Exception e) {
            e.printStackTrace();
        }
        System.out.println(data.length);
    }
}
