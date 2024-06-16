package Controler;

import Modelo.Fruta;
import Modelo.Personagem;
import Modelo.Skoot;
import java.util.ArrayList;

public class ControleDeJogo {

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
}
