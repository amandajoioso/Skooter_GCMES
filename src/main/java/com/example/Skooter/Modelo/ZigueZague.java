package com.example.Skooter.Modelo;

import com.example.Skooter.Auxiliar.Desenho;
import com.example.Skooter.Auxiliar.Posicao;
import java.util.Random;

public class ZigueZague extends Personagem{

    protected Posicao pos;

    public ZigueZague(String sNomeImagePNG) {
        
        super(sNomeImagePNG);
        this.setbTransponivel(false);
        this.setbMortal(true);
    }



   // movimentação aleatória dos robôs
    public void autoDesenho(){
        Random rand = new Random();
        int iDirecao = rand.nextInt(4);

        if(iDirecao == 0){
            this.pos = new Posicao(pPosicao.getLinha(), pPosicao.getColuna() + 1);
            if(!Desenho.acessoATelaDoJogo().colisao2(pos) && pos.posicaoValida())
                this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() + 1);
        }
        else if(iDirecao == 1){
            this.pos = new Posicao(pPosicao.getLinha() + 1, pPosicao.getColuna());
            if(!Desenho.acessoATelaDoJogo().colisao2(pos) && pos.posicaoValida())
                this.setPosicao(pPosicao.getLinha() + 1, pPosicao.getColuna());
        }
        else if(iDirecao == 2){
            this.pos = new Posicao(pPosicao.getLinha(), pPosicao.getColuna() - 1);
            if(!Desenho.acessoATelaDoJogo().colisao2(pos) && pos.posicaoValida())
                this.setPosicao(pPosicao.getLinha(), pPosicao.getColuna() - 1);
        }
        else if(iDirecao == 3){
            this.pos = new Posicao(pPosicao.getLinha() - 1, pPosicao.getColuna());
            if(!Desenho.acessoATelaDoJogo().colisao2(pos) && pos.posicaoValida())
                this.setPosicao(pPosicao.getLinha() - 1, pPosicao.getColuna());
        }

        super.autoDesenho();
    }






}
