/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.cr.ulacit.cicc.ir.stopwords;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Pedro Guzmán <pguzmanb498@ulacit.ed.cr>
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        System.out.println(ArchivosTxt.leerArchivo());
        
        String texto = "Hola, para esto es un texto de prueba que vamos a quitarle todos. Los stops words para dejar solo las palabras relevantes que se encuentran en este texto para";
        
        // Filtros ------ Limpio caracteres especiales
        texto = texto.replace(",", "");
        texto = texto.replace(".", "");
        
        // Creo un vector de palabras solas sin signos especiales
        String[] palabras = texto.split(" ");
        
        
        // Creamos una lista de palabras
        
        List<String> listaTexto = new ArrayList<String>();
        
        for(int i = 0; i<palabras.length;++i){
            listaTexto.add(palabras[i]);
        } // FOR ENDS 
        
        
        
        for(int i = 0; i < listaTexto.size(); ++i){
        
            //System.out.println(listaTexto.get(i));
        }
        
        Iterator<String> iterador = listaTexto.iterator();
        
        // Usando iterador
        while(iterador.hasNext()){
            if(iterador.next().compareTo("para") == 0){
                iterador.remove();
            }
        }
        
        // Usando la lista
        for(int i = 0; i < listaTexto.size(); ++i){
            System.out.println(listaTexto.get(i));
        }

        
    }
    
}


