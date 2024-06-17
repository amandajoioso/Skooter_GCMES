package com.example.Skooter.Controler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ControleDeJogoTest {

    private ControleDeJogo controleDeJogo;

    @BeforeEach
    public void setUp() {
        controleDeJogo = new ControleDeJogo();
    }

    @Test
    public void testIniciarJogo() {
        controleDeJogo.iniciarJogo();
        assertNotNull(controleDeJogo.getFaseAtual());
    }

    @Test
    public void testPerderVida() {
        int vidasAntes = controleDeJogo.getVidas();
        controleDeJogo.perderVida();
        assertEquals(vidasAntes - 1, controleDeJogo.getVidas());
    }
}
