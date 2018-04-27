/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aldair Cruz
 */
public class escribirNuevo {
    public escribirNuevo(){
        
    }
    public void reescribir(String enlace,String nuevo) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(enlace));
        bw.write(nuevo);
        bw.close();
        
    }
    
}
