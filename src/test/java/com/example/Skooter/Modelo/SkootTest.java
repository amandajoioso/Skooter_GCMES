package com.example.Skooter.Modelo;



import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;




public class SkootTest {
    

    private Skoot skoot;

    @BeforeEach
    public void setUp() {
        skoot = new Skoot("skoot.png");
    }

    @Test
    public void testVidas() {
        int vidasEsperadas = 3;
        skoot.setVidas(vidasEsperadas); 
        assertEquals(vidasEsperadas, skoot.getVidas());
        skoot.perderVida();
        assertEquals(vidasEsperadas - 1, skoot.getVidas());

    }

    @Test
    public void testMovimento() {
        int linhaEsperada;
        int colunaEsperada;
        skoot.setPosicao(5, 5);
        skoot.moveUp(); 
        linhaEsperada = 4;
        assertEquals(linhaEsperada, skoot.getLinha());

        skoot.moveDown(); 
        linhaEsperada = 5;
        assertEquals(linhaEsperada, skoot.getLinha());

        skoot.moveLeft(); 
        colunaEsperada = 4;
        assertEquals(colunaEsperada, skoot.getColuna());

        skoot.moveRight(); 
        colunaEsperada = 5;
        assertEquals(colunaEsperada, skoot.getColuna());
    }


}
