package ia;

import java.util.Random;

public class Sala {

    int sala[][];

    public Sala(int linhas, int colunas, float prob) {
        sala = new int[linhas][colunas];
        sujar(prob);
    }

    public void sujar(float probalidade) {
        Random numero_aleatorio = new Random();
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (numero_aleatorio.nextFloat() < probalidade) {
                    sala[i][j] = 1;
                } else {
                    sala[i][j] = 0;
                }

            }
        }
    }

    public String imprime(Posicao p) {
        String saida = "";
        for (int i = 0; i < sala.length; i++) {
            for (int j = 0; j < sala[0].length; j++) {
                if (p.i == i && p.j == j) {
                    saida += 5 + "\t";
                } else {
                    saida += sala[i][j] + "\t";
                }
            }
            saida += "\n";
        }
        return saida;
    }
}
