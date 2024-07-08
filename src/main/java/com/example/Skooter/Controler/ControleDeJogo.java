package com.example.Skooter.Controler;

import java.util.ArrayList;
import com.example.Skooter.Modelo.Fruta;
import com.example.Skooter.Modelo.Personagem;
import com.example.Skooter.Modelo.Skoot;

public class ControleDeJogo {

    private int vidas;
    private int faseAtual;

    public ControleDeJogo() {
        this.vidas = 3; // Iniciar com 3 vidas
        this.faseAtual = 1; // Iniciar na fase 1
    }

    // Método responsável por desenhar todos os personagens na tela
    public void desenhaTudo(ArrayList<Personagem> e) {
        for (Personagem personagem : e) {
            personagem.autoDesenho(); // Chama o método de autoDesenho de cada personagem
        }
    }

    // Método responsável por processar as interações entre os personagens em uma fase
    public void processaTudo(ArrayList<Personagem> umaFase) {
        Skoot skoot = (Skoot) umaFase.get(0); // Obtém o personagem principal (Skoot) da fase
        Personagem pIesimoPersonagem;

        for (int i = 1; i < umaFase.size(); i++) {
            pIesimoPersonagem = umaFase.get(i);

            // Verifica se o personagem principal colidiu com o i-ésimo personagem da fase
            if (skoot.getPosicao().igual(pIesimoPersonagem.getPosicao())) {

                // Verifica se o personagem é transponível, removível e não mortal
                if (pIesimoPersonagem.isbTransponivel() && pIesimoPersonagem.isbRemovivel() && !pIesimoPersonagem.isbMortal()) {
                    umaFase.remove(pIesimoPersonagem); // Remove o personagem da fase
                }
            }
        }
    }

    // Método que verifica se ainda existem frutas no jogo
    public boolean temFruta(ArrayList<Personagem> fruta) {
        Personagem frutaT;

        for (int i = 1; i < fruta.size(); i++) {
            frutaT = fruta.get(i);

            if (frutaT instanceof Fruta) {
                // Ainda há frutas no jogo
                return true;
            }
        }

        // Acabaram as frutas
        return false;
    }

    // Método para iniciar o jogo
    public void iniciarJogo() {
        // Lógica para iniciar o jogo
        this.vidas = 3; // Reiniciar vidas
        this.faseAtual = 1; // Reiniciar para a fase 1
    }

    // Método para obter a fase atual
    public int getFaseAtual() {
        return faseAtual;
    }

    // Método para obter o número de vidas restantes
    public int getVidas() {
        return vidas;
    }

    // Método para reduzir uma vida
    public void perderVida() {
        if (vidas > 0) {
            vidas--;
        }
    }
}
