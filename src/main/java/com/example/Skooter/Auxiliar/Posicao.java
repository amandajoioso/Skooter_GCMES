package com.example.Skooter.Auxiliar;

import java.io.Serializable;

public class Posicao  implements Serializable{
    private int	linha;
    private int coluna;

    public Posicao(int linha, int coluna){
        this.setPosicao(linha,coluna);
    }

    public void setPosicao(int linha, int coluna){
        this.linha = linha;
        this.coluna = coluna;
    }


    public int getLinha(){
        return linha;
    }

    public int getColuna(){
        return coluna;
    }

    public boolean igual(Posicao posicao){
        return (linha == posicao.getLinha() && coluna == posicao.getColuna());
    }


    public boolean posicaoValida(){    //Verifica se personagem tenta passar da margem

        if(this.getLinha() < 0 || this.getLinha() > 10)
            return false;
        if(this.getColuna() < 0 || this.getColuna() > 10)
            return false;

        return true;
    }

}
