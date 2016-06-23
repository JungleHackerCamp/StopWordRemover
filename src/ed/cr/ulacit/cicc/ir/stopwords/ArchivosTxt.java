/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cr.ulacit.cicc.ir.stopwords;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Pedro Guzmán <pguzmanb498@ulacit.ed.cr>
 */
public class ArchivosTxt {
    
    public static String leerArchivo(){
        String texto = "";
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Text Files", "txt"));
        fileChooser.setAcceptAllFileFilterUsed(false);
        try{
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                BufferedReader br = new BufferedReader(new FileReader(selectedFile.getAbsolutePath()));
                try {
                    StringBuilder sb = new StringBuilder();
                    String line = br.readLine();

                    while (line != null) {
                        sb.append(line);
                        sb.append(System.lineSeparator());
                        line = br.readLine();
                    }
                    texto = sb.toString();
                } finally {
                    br.close();
                }
            }
        } // TRY ENDS
        catch(Exception e){
            System.out.println("ERROR AL LEER ARCHIVO");
        }
        return texto;
    }
    
}
