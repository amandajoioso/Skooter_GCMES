package com.example.Skooter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MusicaTest {

    private Musica musica;

    @BeforeEach
    public void setUp() {
        musica = new Musica("musica/Density&Time.wav");
    }

    @Test
    public void testPlay() {
        assertDoesNotThrow(() -> musica.play());
    }

    @Test
    public void testStop() {
        assertDoesNotThrow(() -> musica.stop());
    }
}
    