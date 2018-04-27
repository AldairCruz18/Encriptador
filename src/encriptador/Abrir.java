/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Aldair Cruz
 */
public class Abrir {
    public Abrir(){
        
    }
    
     public String Script(String enlace) throws FileNotFoundException, IOException{
        File f= new File(enlace);
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
        return cont; 
    }
}
