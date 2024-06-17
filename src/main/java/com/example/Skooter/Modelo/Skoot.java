package com.example.Skooter.Modelo;

public class Skoot extends Personagem{

    private int vidas;


    public Skoot(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setVidas(3);

    }

    public void setVidas(int vidas){
        this.vidas = vidas;
    }

    public int getVidas(){
        return vidas;
    }

    public void perderVida(){
        this.vidas = getVidas() - 1;
        System.out.println("Você perdeu uma vida! Total de vidas: " + getVidas());
    }

    public void moveUp() {
        this.setPosicao(this.getLinha() - 1, this.getColuna());
    }

    public void moveDown() {
        this.setPosicao(this.getLinha() + 1, this.getColuna());
    }

    public void moveRight() {
        this.setPosicao(this.getLinha(), this.getColuna() + 1);
    }

    public void moveLeft() {
        this.setPosicao(this.getLinha(), this.getColuna() - 1);
    }

}