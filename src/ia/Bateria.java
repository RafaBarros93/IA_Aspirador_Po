/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

/**
 *
 * @author aluno
 */
public class Bateria {

    int carga;

    public Bateria(int carga) {
        this.carga = carga;
    }

    public void descarrega() {
        --carga;
    }

    public void carrega() {
        ++carga;
    }

}
