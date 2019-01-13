import javax.swing.*;
import java.io.*;
import java.util.*;

public class piccopyforstream {
        FileInputStream fr;
        FileOutputStream fw;
        String exname;
        public piccopyforstream(String picpath){
            File file=new File(picpath);
            if(!file.exists()){
                JOptionPane.showMessageDialog(null,"输入图片不存在");
                return;
            }else
                try{
                    exname=picpath.substring(picpath.lastIndexOf("."));//最后一个点的索引位置
                    fr = new FileInputStream(picpath);
                }catch(Exception e){
                    e.getStackTrace();
                }
        }


        public void uploadpic(String targetpath){
            File file=new File(targetpath+"/"+new Date().getTime()+exname);
            try {
                fw=new FileOutputStream(file);
                int length;
                byte[] size=new byte[1024];

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
       /* public void close() {
            try {
                if (fw != null)
                    fw.close();
                if (fr != null)
                    fr.close();
            }catch(Exception e){
                e.getStackTrace();
            }
        }*/
    }


