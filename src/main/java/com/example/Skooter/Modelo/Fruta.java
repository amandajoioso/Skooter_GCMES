package com.example.Skooter.Modelo;

import com.example.Skooter.Auxiliar.Desenho;
import com.example.Skooter.Modelo.Personagem;

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