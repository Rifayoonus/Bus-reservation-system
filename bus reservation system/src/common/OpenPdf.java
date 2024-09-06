/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package common;
import javax.swing.JOptionPane;
import java.io.File;
/**
 *
 * @author rifaa
 */
public class OpenPdf {
    public static void openbyid(String id){
        try{
            if((new File("Downloads"+id+".pdf")).exists()){
                Process p = Runtime
                           .getRuntime()
                           .exec("rundll32 url.dll,FileProtocolHandler Downloads"+id+".pdf");
            }
            else{
                JOptionPane.showMessageDialog(null, "File is not exists");
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
            
}
