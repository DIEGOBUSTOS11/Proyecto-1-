/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.linea3.project1;

public class CodigoCesar {
    
    private String alfabeto = "abcdefghijklmnopqrstuvwxyz";
    
    /*metodo encargado de encriptar con algoritmo Cesar un texto
     *@author alejandro y diego
     *@param texto cadena de caracteres con el texto a encriptar
     *@param llave numero en base al cual se encriptara
     *@return cadena de texto con el texto ya encriptado
     */
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
 
    /*metodo encargado de desencriptar con algoritmo Cesar un texto
     *@author alejandro y diego
     *@param texto cadena de caracteres con el texto a desencriptar
     *@param llave numero en base al cual fue encriptado el texto
     *@return cadena de texto con el texto ya desencriptado
     */
     
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
