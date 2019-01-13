import javax.swing.*;
import java.io.File;

public class testcopyforchar {

    public static void main(String[] args) {
        piccopyforchar piccopyforchar=null;
        JFileChooser jFileChooser = new JFileChooser();
       int i=jFileChooser.showOpenDialog(null);
        if(i==0){
            File selectedFile = jFileChooser.getSelectedFile();
            piccopyforchar = new piccopyforchar(selectedFile.getAbsolutePath());
            System.out.println(selectedFile.getAbsolutePath());
            int j=jFileChooser.showOpenDialog(null);
            if(j==0) {
                piccopyforchar.uploadpic(jFileChooser.getSelectedFile().getPath());
                System.out.println(jFileChooser.getSelectedFile().getPath());
            }
           // piccopyforchar.close();
        }

    }
}
