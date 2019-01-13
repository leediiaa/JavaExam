import javax.swing.*;
import java.io.*;
import java.util.*;

public class piccopyforchar {
    FileReader fr;
    FileWriter fw;
    String exname;

    public piccopyforchar(String picpath){
        File file=new File(picpath);
        if(!file.exists()){
        JOptionPane.showMessageDialog(null,"输入图片不存在");
        return;
        }else
            try{
                exname=picpath.substring(picpath.lastIndexOf("."));//最后一个点的索引位置
            fr = new FileReader(picpath);
        }catch(Exception e){
            e.getStackTrace();
            }
    }


    public void uploadpic(String targetpath){
        File file=new File(targetpath+"/"+new Date().getTime()+exname);
        try {
            fw=new FileWriter(file);
            int length;
            char[] size=new char[1024];
            while((length=fr.read(size))!=-1){
                fw.write(size,0,length);
                fw.flush();
            }
            fw.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("文件上传成功！");
    }
    /*public void close() {
        try {
            if (fw != null)
                fw.close();
        if (fr != null)
            fr.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }*/
}
