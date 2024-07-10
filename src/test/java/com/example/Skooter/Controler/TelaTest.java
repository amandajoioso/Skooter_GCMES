package com.example.Skooter.Controler; // Ajuste o pacote para corresponder ao diretório

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


import com.example.Skooter.Modelo.Skoot;
import com.example.Skooter.Modelo.ZigueZague;


public class TelaTest {

    private Tela tela;

    @BeforeEach
    public void setUp() {
        tela = new Tela();
    }

    @Test
    public void testAddPersonagem() {
        ZigueZague personagem = new ZigueZague("roboRosa.png");
        personagem.setPosicao(5, 5); // Defina a posição do Skoot
        tela.addPersonagem(personagem); // Adicione o Skoot à tela
        assertTrue(tela.getFaseAtual().contains(personagem)); // Verifique se o Skoot foi adicionado corretamente
    }

    @Test
    public void testAddSkoot() {
        Skoot skoot = new Skoot("skoot.png"); // Crie um objeto Skoot com imagem para teste
        skoot.setPosicao(5, 5); // Defina a posição do Skoot
        tela.addPersonagem(skoot); // Adicione o Skoot à tela
        assertTrue(tela.getFaseAtual().contains(skoot)); // Verifique se o Skoot foi adicionado corretamente
    }

    @Test
    public void testRemovePersonagem() {
        Skoot skoot = new Skoot("skoot.png"); // Crie um objeto Skoot com imagem para teste
        skoot.setPosicao(5, 5); // Defina a posição do Skoot
        tela.addPersonagem(skoot); // Adicione o Skoot à tela
        tela.removePersonagem(skoot); // Remova o Skoot da tela
        assertFalse(tela.getFaseAtual().contains(skoot)); // Verifique se o Skoot foi removido corretamente
    }


}
