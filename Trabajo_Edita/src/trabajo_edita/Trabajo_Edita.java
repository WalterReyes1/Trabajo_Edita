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
public class Trabajo_Edita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila p = new Pila();
        Editor e = new Editor(p);

        e.edita('a');
        e.edita('b');
        e.edita('c');
        e.edita('d');
        e.edita('e');
        e.edita('f');
        e.edita('g');
        System.out.println("-----------Antes del #-----------");
        p.imprimir(p.lista);
        e.edita('#');
        System.out.println("-----------Despues del #-----------");

        p.imprimir(p.lista);
        System.out.println("-----------Y si agrego un @-----------");
        e.edita('@');
        p.imprimir(p.lista);

    }

}
