/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_edita;
import java.util.ArrayList;
/**Char
 *
 * @author hp
 */
public class Pila extends TDA {
    
    Pila(){
        
    }
    
    
    @Override
     public void agregar(char c){
         
         lista.add(c);
     }
     
    @Override
     public void imprimir(ArrayList<Character>temp){
         System.out.println("------------------");
         for(int i = 0; i<temp.size();i++){
             System.out.println(temp.get(i));
         }
     }
     
    @Override
     public void anula(ArrayList<Character>temp){
        
         temp.clear();
     }
    @Override
     public char tope(ArrayList<Character>temp){
         return temp.get(temp.size()-1);
     }
     
    @Override
     public void eliminar(int x,ArrayList<Character>temp){
         temp.remove(x);
     }
}
