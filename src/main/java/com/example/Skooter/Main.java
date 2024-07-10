package com.example.Skooter;

import com.example.Skooter.Controler.Tela;

public class Main {
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                /*String caminhoMusica = new java.io.File("musica/Density&Time.wav").getAbsolutePath();
                Musica musica = new Musica(caminhoMusica);
                musica.play(); // Mudança de tocar() para play()*/
                Tela tTela = new Tela();
                tTela.setVisible(true);
                tTela.createBufferStrategy(2);
                tTela.go();
            }
        });
    }
}
