package io.github.mrzahmadi.filterx.condition.comparison;

import io.github.mrzahmadi.filterx.core.Filter;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class ComparisonTest {

    private final Map<String, String> user = Map.of(
            "role", "administrator",
            "age", "35",
            "lastname", "Brown"
    );

    @Test
    void equalsShouldMatch() {
        Filter eq = new Equals("role", "administrator");
        assertTrue(eq.matches(user));
    }

    @Test
    void equalsShouldFail() {
        Filter eq = new Equals("role", "guest");
        assertFalse(eq.matches(user));
    }

    @Test
    void greaterShouldMatch() {
        Filter gt = new Greater("age", "30");
        assertTrue(gt.matches(user));
    }

    @Test
    void lessShouldFail() {
        Filter lt = new Less("age", "30");
        assertFalse(lt.matches(user));
    }

    @Test
    void regexShouldMatch() {
        Filter re = new RegularExpression("lastname", "B.*");
        assertTrue(re.matches(user));
    }

    @Test
    void existShouldDetectProperty() {
        Filter ex = new Exist("lastname");
        assertTrue(ex.matches(user));
    }

    @Test
    void existShouldFailWhenMissing() {
        Filter ex = new Exist("firstname");
        assertFalse(ex.matches(user));
    }
}
