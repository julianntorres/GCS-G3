/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author rubar
 */
public class FechaException extends RuntimeException{
    
    //Contructor de la clase Fecha Exception
    public FechaException(){
        super("LA FECHA NO EXISTE");
    }  
}
