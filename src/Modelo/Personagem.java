package Modelo;

import Auxiliar.Consts;
import Auxiliar.Desenho;
import Auxiliar.Posicao;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Serializable;
import javax.swing.ImageIcon;

public abstract class Personagem implements Serializable {

    protected ImageIcon iImage;
    protected Posicao pPosicao;
    protected boolean bTransponivel; // Pode passar por cima?
    protected boolean bMovivel; // Pode mover?
    protected boolean bRemovivel; // Pode remover?
    protected boolean bMortal;       // Se encostar, morre?
    protected String nome;
    protected int direcao; // Direção da seta (1: cima, 2: baixo, 3: direita, 4: esquerda)


    protected Personagem(String sNomeImagePNG) {
        this.nome =sNomeImagePNG;
        this.pPosicao = new Posicao(1, 1);
        this.direcao = 0;
        this.setbTransponivel(true);
        this.setbMovivel(false);
        this.setbRemovivel(false);
        this.setbMortal(false);
        try {
            iImage = new ImageIcon(new java.io.File(".").getCanonicalPath() + Consts.PATH + sNomeImagePNG);
            Image img = iImage.getImage();
            BufferedImage bi = new BufferedImage(Consts.CELL_SIDE, Consts.CELL_SIDE, BufferedImage.TYPE_INT_ARGB);
            Graphics g = bi.createGraphics();
            g.drawImage(img, 0, 0, Consts.CELL_SIDE, Consts.CELL_SIDE, null);
            iImage = new ImageIcon(bi);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getNome(){
        return nome;
    }

    public Posicao getPosicao() {
        return pPosicao;
    }

    public int getLinha(){
        return this.pPosicao.getLinha();
    }

    public int getColuna(){
        return this.pPosicao.getColuna();
    }

    public int getDirecao(){
        return this.direcao;
    }

    public boolean isbTransponivel() {
        return bTransponivel;
    }

    public void setbTransponivel(boolean bTransponivel) {
        this.bTransponivel = bTransponivel;
    }

    public boolean isbMovivel() {
        return bMovivel;
    }

    public void setbMovivel(boolean bMovivel) {
        this.bMovivel = bMovivel;
    }

    public boolean isbRemovivel() {
        return bRemovivel;
    }

    public void setbRemovivel(boolean bRemovivel) {
        this.bRemovivel = bRemovivel;
    }

    public boolean isbMortal() {
        return bMortal;
    }

    public void setbMortal(boolean bMortal) {
        this.bMortal = bMortal;
    }

    public void autoDesenho(){
        Desenho.desenhar(this.iImage, this.pPosicao.getColuna(), this.pPosicao.getLinha());
    }

    public void setPosicao(int linha, int coluna) {
        pPosicao.setPosicao(linha, coluna);
    }

    public void moveUp() {

    }

    public void moveDown() {

    }

    public void moveRight() {

    }

    public void moveLeft() {

    }


}