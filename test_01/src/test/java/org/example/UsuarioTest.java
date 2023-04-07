package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class UsuarioTest {
    @Test
    public void testGetNombre() {
        Usuario usuario = new Usuario("Juan", "juan@mail.com");
        assertEquals("Juan", usuario.getNombre());
    }

    @Test
    public void testGetEmail() {
        Usuario usuario = new Usuario("Juan", "juan@mail.com");
        assertEquals("juan@mail.com", usuario.getEmail());
    }
}
