package io.github.mrzahmadi.filterx.condition.logical;

import io.github.mrzahmadi.filterx.condition.comparison.Equals;
import io.github.mrzahmadi.filterx.condition.comparison.Greater;
import io.github.mrzahmadi.filterx.core.Filter;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class LogicalTest {

    private final Map<String, String> user = Map.of(
            "role", "administrator",
            "age", "35"
    );

    @Test
    void andShouldMatch() {
        Filter f = new And(
                new Equals("role", "administrator"),
                new Greater("age", "30")
        );
        assertTrue(f.matches(user));
    }

    @Test
    void andShouldFailIfOneFails() {
        Filter f = new And(
                new Equals("role", "guest"),
                new Greater("age", "30")
        );
        assertFalse(f.matches(user));
    }

    @Test
    void orShouldMatchIfOneMatches() {
        Filter f = new Or(
                new Equals("role", "guest"),
                new Greater("age", "30")
        );
        assertTrue(f.matches(user));
    }

    @Test
    void orShouldFailIfAllFail() {
        Filter f = new Or(
                new Equals("role", "guest"),
                new Greater("age", "50")
        );
        assertFalse(f.matches(user));
    }

    @Test
    void notShouldInvert() {
        Filter f = new Not(new Equals("role", "guest"));
        assertTrue(f.matches(user));
    }
}
