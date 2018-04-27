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
public class desencriptar {
    
    Abrir a= new Abrir();
   escribirNuevo es= new escribirNuevo();
    
    public desencriptar(){
        
    }
    public void desencriptarArchivo(String enlace, String clave) throws FileNotFoundException, IOException{
        String nuevo = "";
        int original;
        int sum;
        char caracter;
        
        File f= new File(enlace);
        FileReader fr= new FileReader(f);
        String adentro = a.Script(enlace);
        
        //contenido del archivo
        char ad[]=adentro.toCharArray();
        //contraseña
        char contra[]=clave.toCharArray();
        //System.out.println(contra);
        
        
        int co = 0;
        for(int i=0; i<ad.length; i++){
            original = (int) ad[i]; 
            sum = original - contra[co];
      
            if(sum<0){
                caracter = (char) (sum+255);
            }else{
                caracter = (char) sum;
            }           
            nuevo = nuevo.concat(String.valueOf(caracter));
            
            co++;
            
            if (co<clave.length()){
                co = 0;
            }
        }
        
        es.reescribir(enlace, nuevo);
        System.out.println("Desencriptado hecho");
        System.out.println(nuevo);
     
    }
}
