/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.rexide;

import java.io.*;


/**
 *
 * @author mprietoe
 */
public class clases {
    

    public static void definirContenido(Object o, String s){
        try{
            File archivo = new File(s);

                
            if (!archivo.exists()){
                archivo.createNewFile();
            }
                    
            PrintWriter archivopw = new PrintWriter(archivo);
            archivopw.println(o);
            archivopw.close();
            } catch (IOException e){
                e.printStackTrace();
            }
        
        
        
    }

    static boolean definido = false;
    static String nombre;
}
