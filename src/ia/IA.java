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
public class IA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sala sala = new Sala(2, 2, 0.5f);
        Robo robo = new Robo();
        
        robo.ligaRobo(sala);
        // System.out.println(sala.imprime(new Posicao(1, 1)));

    }

}
