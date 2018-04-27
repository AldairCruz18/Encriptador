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
public class guardarContra {
    public void escribircontra(String enlace2, String clave) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(enlace2));
        bw.write(clave);
        bw.close();
    }
}
