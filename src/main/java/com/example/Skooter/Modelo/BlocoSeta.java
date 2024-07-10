package com.example.Skooter.Modelo;


import java.util.Objects;

public class BlocoSeta extends Personagem{


    public BlocoSeta(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(true);
        this.setbRemovivel(false);
        this.setbMovivel(false);
        this.setbMortal(false);

        if(Objects.equals(sNomeImagePNG, "up.png")){
            this.direcao = 1;
        }
        else if(Objects.equals(sNomeImagePNG, "down.png")){
            this.direcao = 2;
        }
        else if(Objects.equals(sNomeImagePNG, "right.png")){
            this.direcao = 3;
        }
        else if(Objects.equals(sNomeImagePNG, "left.png")){
            this.direcao = 4;
        }


    }


    public void autoDesenho() {
        super.autoDesenho();
    }

}