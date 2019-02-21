/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linea3.project1;

import java.util.Scanner;

/**
 *
 * @author alejandro
 */
public class Menu {

    /**
     * constructor inicial de la clase Menu
     */
    public Menu() {
      
    }
    
    /**
     *Metodo principal, encargado de
     *capturar los datos segun la opcion elegida e invocar el metodo correspondiente
     *imprimir la cadena obtenida
     */
    public void MenuInicial(){
              
        Scanner scan=new Scanner(System.in);
        
        CodigoCesar encriptar=new CodigoCesar();
        
        String texto;
        int opcion=0,llave=0;
        
        do{
            System.out.print("\n\n\n1. ENCRIPTAR \n2. DESENCRIPTAR \n3. SALIR\n");
            opcion= scan.nextInt();
            
            if(opcion==1){
                
                System.out.print("Introduzca el texto a encriptar: \n");
                texto = scan.next();
                System.out.print("\nIntroduzca la llave de encriptacion: \n");
                llave = scan.nextInt();
                
                texto=encriptar.Encriptar(texto, llave);
                System.out.print("\nTexto encriptado: "+texto);
                     
            }else if(opcion==2){
                
                System.out.print("Introduzca el texto a desencriptar: \n");
                texto = scan.next();
                System.out.print("\nIntroduzca la llave de desencriptacion: \n");
                llave = scan.nextInt();
                
                texto=encriptar.Desencriptar(texto, llave);
                System.out.print("\nTexto desencriptado: "+texto);
                
            }else if(opcion==3){
                
                System.out.print("\nGRACIAS POR USAR ESTE PROGRAMA");
                
            }else{
                
                System.out.print("\nOPCION INCORRECTA");
            }
            
            
        }while(opcion!=3);   
        
    }

}
    

