package io.github.mrzahmadi.filterx.core;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static io.github.mrzahmadi.filterx.core.Filters.*;
import static org.junit.jupiter.api.Assertions.*;

class FiltersTest {

    private final Map<String, String> user = Map.of(
            "role", "administrator",
            "age", "35"
    );

    @Test
    void dslShouldBuildReadableFilters() {
        Filter f = and(
                eq("role", "administrator"),
                gt("age", 30)
        );

        assertTrue(f.matches(user));
    }

    @Test
    void dslNotShouldWork() {
        Filter f = not(eq("role", "guest"));
        assertTrue(f.matches(user));
    }
}
