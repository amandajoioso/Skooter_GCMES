package com.example.Skooter.Modelo;

import com.example.Skooter.Auxiliar.Desenho;

import java.util.Objects;

public class BlocoEstatico extends Personagem{

    public BlocoEstatico(String sNomeImagePNG) {
        super(sNomeImagePNG);
        this.setbTransponivel(false);
        this.setbMovivel(false);

        if(Objects.equals(sNomeImagePNG, "blocoVerdeEstatico.png")){
            this.setbRemovivel(false);
        }
        else if(Objects.equals(sNomeImagePNG, "blocoVermelho")){
            this.setbRemovivel(false);
        }
    }

    public void autoDesenho() {

        switch (getNome()) {
            case "blocoVerdeEstatico.png" -> {
                Desenho.acessoATelaDoJogo().removePersonagem(this);
                super.autoDesenho();
            }
            case "blocoVermelho.png" -> super.autoDesenho();
        }
    }
}