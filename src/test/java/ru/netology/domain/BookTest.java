package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book(6, "Эмоции людей и собак", 350, "Патриция Б. МакКоннелл");

    @Test
    public void shouldMatchByName() {
        String match = "Эмоции людей и собак";

        assertTrue(book.matches(match));
    }

    @Test
    public void shouldMatchByAuthor() {
        String match = "Патриция Б. МакКоннелл";

        assertTrue(book.matches(match));
    }

    @Test
    public void shouldNoMatchByName() {
        String match = "По ту сторон поводка";

        assertFalse(book.matches(match));
    }

    @Test
    public void shouldNoMatchByAuthor() {
        String match = "Карен Прайор";

        assertFalse(book.matches(match));
    }
}