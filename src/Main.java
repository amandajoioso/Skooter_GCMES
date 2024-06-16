import java.io.File;

import Controler.Tela;

public class Main {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String caminhoMusica = new File("musica/Density&Time.wav").getAbsolutePath();
                Musica musica = new Musica(caminhoMusica);
                musica.tocar();
                Tela tTela = new Tela();
                tTela.setVisible(true);
                tTela.createBufferStrategy(2);
                tTela.go();
            }
        });
    }
}

