/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ia;

import java.util.Random;

/**
 *
 * @author aluno
 */
public class Robo {

    Posicao posicao;
    Bateria bateria;

    public Robo() {
        posicao = new Posicao(0, 0);
        bateria = new Bateria(100);
    }

    public void ligaRobo(Sala sala) {
        do {
            Posicao p = ativaSensor(sala);
            if (p == null) {
                System.out.println("Limpou");
                limpa(sala);
            } else {
                System.out.println("Moveu");
                move(p);
            }
             bateria.descarrega();
            System.out.println(sala.imprime(posicao));
        } while (bateria.carga > 0);
    }

    public void move(Posicao posicao) {
        this.posicao.i = posicao.i;
        this.posicao.j = posicao.j;
    }

    public void limpa(Sala sala) {
        sala.sala[posicao.i][posicao.j] = 0;
    }

    public Posicao ativaSensor(Sala sala) {
        // 1° Caso Sujeira na posição que ele está
        if (sala.sala[posicao.i][posicao.j] == 1) {
            return null;
        }
        //2° Caso Verifica se tem sujeiro em volta  
        for (int i = posicao.i - 1; i <= posicao.i + 1; i++) {
            for (int j = posicao.j - 1; j <= posicao.j + 1; j++) {
                if (i >= 0 && j >= 0 && i < sala.sala.length && j < sala.sala[0].length) {
                    if (sala.sala[i][j] == 1) {
                        return new Posicao(i, j);
                    }
                }

            }

        }
        // 3° Caso Mover Aleatorio
        int posicao_i_aleatoria = 0;
        int posicao_j_aleatoria = 0;

        Random r = new Random();
        do {
            posicao_i_aleatoria = posicao.i - (r.nextInt(3) - 1);
            posicao_j_aleatoria = posicao.j - (r.nextInt(3) - 1);
        } while (posicao_i_aleatoria < 0 || posicao_j_aleatoria < 0 || posicao_i_aleatoria >= sala.sala.length ||posicao_j_aleatoria >= sala.sala[0].length);
        return new Posicao(posicao_j_aleatoria, posicao_j_aleatoria);
    }

}
