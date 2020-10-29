package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {

    Smartphone smartphone = new Smartphone(4, "P40 Pro", 54587, "Huawei");
    @Test
    public void shouldMatchByName() {
        String match = "P40 Pro";

        assertTrue(smartphone.matches(match));
    }

    @Test
    public void shouldMatchByMaker() {
        String match = "Huawei";

        assertTrue(smartphone.matches(match));
    }

    @Test
    public void shouldNoMatchByName() {
        String match = "Lg-g6";

        assertFalse(smartphone.matches(match));
    }

    @Test
    public void shouldNoMatchByMaker() {
        String match = "Acer";

        assertFalse(smartphone.matches(match));
    }
}