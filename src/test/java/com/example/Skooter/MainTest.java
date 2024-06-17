package com.example.Skooter;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testMain() {
        String caminhoMusica = new java.io.File("musica/Density&Time.wav").getAbsolutePath();
        Musica musica = new Musica(caminhoMusica);
        assertNotNull(musica);
    }
}
