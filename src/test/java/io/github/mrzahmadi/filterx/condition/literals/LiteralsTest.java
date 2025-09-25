package io.github.mrzahmadi.filterx.condition.literals;

import io.github.mrzahmadi.filterx.core.Filter;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LiteralsTest {

    private final Map<String, String> dummy = Map.of("role", "admin");

    @Test
    void trueLiteralShouldAlwaysMatch() {
        Filter t = new True();
        assertTrue(t.matches(dummy));
    }

    @Test
    void falseLiteralShouldNeverMatch() {
        Filter f = new False();
        assertFalse(f.matches(dummy));
    }
}
