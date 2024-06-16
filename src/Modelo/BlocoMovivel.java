package Modelo;

import java.util.Objects;

public class BlocoMovivel extends Personagem {
    private final String nome;
    private final boolean arrastando; // Indica se o bloco está sendo arrastado pelo Skoot

    public BlocoMovivel(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.nome = sNomeImagePNG;
        this.setbTransponivel(false);
        this.setbMovivel(true);
        this.arrastando = false; // Inicialmente, não está sendo arrastado

        if(Objects.equals(sNomeImagePNG, "blocoVermelhoArrastavel.png")){
            this.setbRemovivel(false);
        }
        else if(Objects.equals(sNomeImagePNG, "blocoVerde.png")){
            this.setbRemovivel(true);
        }

    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRight() {

    }

    public void moveLeft() {

    }


    public void autoDesenho() {
        if (arrastando) {
            Skoot skoot = new Skoot("skoot.png");
            // Atualize a posição do bloco para seguir o Skoot
            setPosicao(skoot.getPosicao().getLinha(), skoot.getPosicao().getColuna());
        }
        super.autoDesenho();
    }

    public String getNome(){
        return nome;
    }


}
