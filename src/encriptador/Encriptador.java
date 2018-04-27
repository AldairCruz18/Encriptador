/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encriptador;

import java.io.IOException;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

/**
 *
 * @author Aldair Cruz
 */
public class Encriptador {

    /**
     * @param args the command line arguments
     */
    
    /*
    comparar c= new comparar();
                
        int ce =c.compare("C:/Users/Aldair Cruz/Documents/contra.txt", "aldair");
        
        System.out.println(ce);*/
    
    public static void main(String[] args) throws IOException {
        
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Encriptar e= new Encriptar();
        desencriptar d= new desencriptar();
        String co;
        guardarContra gc= new guardarContra();
        
        comparar c= new comparar();
        
        int ce;
        
        System.out.println("Contraseña: ");
        co=sc.nextLine();
       // e.Script("C:/Users/Aldair Cruz/Desktop/test.txt");
       int opc;
        System.out.print("Opcion:\n1.Encriptar archivo\n2.Desencriptar archivo\t");
        
       opc=sc.nextInt();
       switch(opc){
           case 1:
               gc.escribircontra("contra.txt", co);
               e.hacerScript("test.txt",co);
               
               break;
           case 2:
               ce =c.compare("contra.txt", co);
               if(ce==1){
               d.desencriptarArchivo("test.txt", co);
               c.vaciar("contra.txt");
               }else{
                   System.out.println("Contraseña incorrecta, lo siento");
               }
       }
       
        }
}
