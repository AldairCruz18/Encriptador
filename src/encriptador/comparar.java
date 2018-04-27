/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Aldair Cruz
 */
public class comparar {
    public comparar(){
        
    }
    
    
    public  Integer compare(String enlace2, String co) throws FileNotFoundException, IOException{
        int siono;
    File f= new File(enlace2);
        FileReader fr= new FileReader(f);
        String cont = "";
        int caracter = 0;
        char c;
        while(caracter!=-1){
            caracter = fr.read();
            
            c = (char) caracter;
            
            if(caracter!=-1)
                cont = cont.concat(String.valueOf(c));
            
        }     
        if(co.equals(cont)){
        siono=1;
        }else
            siono=0;
    return siono;
    }
    
    public void vaciar(String enlace2) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter(enlace2));
        bw.write("");
        bw.close();
    }
    
}
