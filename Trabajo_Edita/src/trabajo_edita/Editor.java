/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo_edita;

import java.util.ArrayList;

/**
 *
 * @author hp
 */

public class Editor {

    private Pila p;

    Editor(Pila p) {
        this.p = p;

    }

    public void edita(char c) {
        if (c == '#') {
            if (!p.lista.isEmpty()) {
                p.eliminar(p.lista.size() - 1, p.lista);

            }
        } else if (c == '@') {
            p.anula(p.lista);
        } else {
            p.agregar(c);
        }
    }
}
