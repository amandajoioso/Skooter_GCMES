package com.example.Skooter.Controler;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TelaTest {

    private Tela tela;

    @BeforeEach
    public void setUp() {
        tela = new Tela();
    }

    @Test
    public void testSetVisible() {
        tela.setVisible(true);
        assertTrue(tela.isVisible());
    }

    @Test
    public void testCreateBufferStrategy() {
        tela.createBufferStrategy(2);
        assertNotNull(tela.getBufferStrategy());
    }
}
