/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linea3.project1;

/**
 *
 * @author DiegoFernando
 */


public class CodigoCesar {
    
    private String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    
     public String Encriptar(String texto, int llave){
        
        //aqui se almacena el resultado
        String textoEncriptado = "";
        for(int i = 0; i < texto.length();i++)
        {
            //busca la posicion del caracter en la variable alfabeto
            int posicion = alfabeto.indexOf(texto.charAt(i));
            //realiza el reemplazo
            if ((posicion + llave) < alfabeto.length()){
                textoEncriptado = textoEncriptado + alfabeto.charAt(posicion+llave);
            }
            else
            {
                textoEncriptado = textoEncriptado + alfabeto.charAt((posicion+llave) - alfabeto.length());
            }
        }
        return textoEncriptado;
    }
 
    
    public String Desencriptar(String texto, int llave){
        
        String textoDesencriptado = "";
        
        for(int i = 0; i < texto.length();i++)
        {
            int posicion = alfabeto.indexOf(texto.charAt(i));
            
            if ((posicion - llave) < 0){
                textoDesencriptado = textoDesencriptado + alfabeto.charAt((posicion-llave) + alfabeto.length());
            }
            else
            {
                textoDesencriptado = textoDesencriptado + alfabeto.charAt(posicion-llave);
            }
        }
        return textoDesencriptado;
    }
    
}
