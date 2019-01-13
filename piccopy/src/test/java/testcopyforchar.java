import javax.swing.*;
import java.io.File;

public class testcopyforchar {

    public static void main(String[] args) {
        piccopyforchar piccopyforchar=null;
        JFileChooser jFileChooser = new JFileChooser();
       int i=jFileChooser.showOpenDialog(null);
        if(i==0){
            File selectedFile = jFileChooser.getSelectedFile();//选择文件
            piccopyforchar = new piccopyforchar(selectedFile.getAbsolutePath());
            System.out.println(selectedFile.getAbsolutePath());
            jFileChooser.setFileSelectionMode((jFileChooser.DIRECTORIES_ONLY));
            int j=jFileChooser.showOpenDialog(null);//选择目标文件夹
            if(j==0) {
                piccopyforchar.uploadpic(jFileChooser.getSelectedFile().getPath());
                System.out.println("---"+jFileChooser.getSelectedFile().getPath());
            }
           // piccopyforchar.close();
        }

    }
}
