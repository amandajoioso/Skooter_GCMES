package Modelo;

public class Fruta extends Personagem{

    public Fruta(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.bTransponivel = true;
        this.bRemovivel = true;
        this.bMortal = false;
    }

    public void autoDesenho() {
        super.autoDesenho();
    }
}