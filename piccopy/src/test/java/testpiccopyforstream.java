import javax.swing.*;
import java.io.File;

public class testpiccopyforstream {
    public static void main(String[] args) {
        piccopyforstream  piccopyforstream=null;
        JFileChooser jFileChooser = new JFileChooser();

        int i=jFileChooser.showOpenDialog(null);
        if(i==0){
            File selectedFile = jFileChooser.getSelectedFile();
            piccopyforstream = new piccopyforstream(selectedFile.getAbsolutePath());
            System.out.println(selectedFile.getAbsolutePath());
            jFileChooser.setFileSelectionMode((jFileChooser.DIRECTORIES_ONLY));
            int j=jFileChooser.showOpenDialog(null);
            if(j==0) {
                piccopyforstream.uploadpic(jFileChooser.getSelectedFile().getPath());
                System.out.println(jFileChooser.getSelectedFile().getPath());
            }
           // piccopyforstream.close();
        }

    }
}
