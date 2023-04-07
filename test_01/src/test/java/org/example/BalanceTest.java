package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class BalanceTest {
    @Test
    public void testGetSaldo() {
        Balance balance = new Balance(100.0);
        assertEquals(100.0, balance.getSaldo(), 0.0);
    }

    @Test
    public void testDepositar() {
        Balance balance = new Balance(100.0);
        balance.depositar(50.0);
        assertEquals(150.0, balance.getSaldo(), 0.0);
    }

    @Test
    public void testRetirar() {
        Balance balance = new Balance(100.0);
        balance.retirar(50.0);
        assertEquals(50.0, balance.getSaldo(), 0.0);
    }
}