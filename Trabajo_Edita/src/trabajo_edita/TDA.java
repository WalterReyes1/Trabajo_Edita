/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_edita;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public abstract  class TDA {
  
   protected  ArrayList<Character>lista = new ArrayList();
    
    public TDA(){
        
    }
    public abstract void agregar(char c);

    
    public abstract void imprimir(ArrayList<Character>lista);
    
   public abstract void anula(ArrayList<Character>lista);
   
    public abstract char tope(ArrayList<Character>lista);
    
    public abstract void eliminar(int x,ArrayList<Character>lista);
    
}

